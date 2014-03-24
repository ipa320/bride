package org.ros.model.compilers;

import java.net.URI;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException; 
	


import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.commons.util.StringProperties;
//import org.ros.model.ROS_PackageStandaloneSetup;

//import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.best_of_robotics.transform.ros.to.cplusplus.tools.CHModToolNativeTypeDelegate;
import org.best_of_robotics.transform.ros.to.cplusplus.tools.ConfigFileCreatorNativeTypeDelegate;





public class M2CStandalone {
	static String output_package = "";
	static String input_package = "";
	static String model_path = "";
	static String language = "";

	
	/*protected static File getFile(String fileName) throws URISyntaxException {
		
		URI binUri = M2CStandalone.class.getResource(fileName).toURI();
		URI uri = null;
		
		if (binUri.toString().indexOf("bin") > -1) {
			uri = new URI(binUri.toString().replaceAll("bin", "src"));
		}
		else {
			uri = binUri;
		}
		return new File(uri);
	}*/
	
	protected static EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad, boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, "file:/" + new File(metamodel).getAbsolutePath());
		properties.put(EmfModel.PROPERTY_MODEL_URI, "file:/" + new File(model).getAbsolutePath());
		properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "true");
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, null);
		return emfModel;
	}
	
	/**
	 * convert the xtext file to an XMI file. saves the xmi in the save folder as the xtext file.
	 * 
	 * @param inputURI the xtext file
	 */
/*	public static void convertXTextToXMI(final org.eclipse.emf.common.util.URI inputURI) {
		ROS_PackageStandaloneSetup.doSetup();
		if ((inputURI != null) && inputURI.isFile() && !inputURI.isEmpty()) {
			final ResourceSet ressourceSet = new ResourceSetImpl();
			final Resource resource = ressourceSet.getResource(inputURI, true);
			final EObject eobject = resource.getContents().get(0);

			final XMIResourceFactoryImpl resFactory = new XMIResourceFactoryImpl();
			final org.eclipse.emf.common.util.URI xmiuri = inputURI.trimFileExtension().appendFileExtension("xmi");
			final XMIResource xmiresource = (XMIResource) resFactory.createResource(xmiuri);
			xmiresource.getContents().add(eobject);
			try {
				xmiresource.save(new HashMap<Object, Object>());
			} catch (final IOException ex) {
				System.out.println("Exception" + ex.toString());
			}
		} else {
			System.out.println("please provide a real not empty file");
		}
	}*/
	
	public static String findPackageURI(String packagename)
	{
		String cmd = "rospack find " + packagename;
		Runtime run = Runtime.getRuntime();
		Process pr;
		try {
			pr = run.exec(cmd);
			pr.waitFor();
			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			return buf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public static void parseArgs(String [] args)
	{
		// -o brics_test [-p brics_test] model/brics_test.ros_package
   
	    for (int i=0; i < args.length; i+=2) {
	         switch (args[i].charAt(0)) {
	         case '-':
	             if (args[i].charAt(1) == 'o') {
	            	 output_package = args[i+1];
	            	 break;   
	             } 
	             if (args[i].charAt(1) == 'p') {
	            	 input_package = args[i+1];
	            	 break;   
	             }
	             if (args[i].charAt(1) == 'l') {
	            	 language = args[i+1];
	            	 break;   
	             }
	             break;         
	         default:
	        	 model_path = args[i];
	        	 break;         
	         }     
	     }
	     if(model_path == "" || output_package == "")
	     {
	    	 System.out.println("Usage: rosrun bride_compilers m2t -o brics_test [-l language] [-p brics_test] model/brics_test.ros_package");
		     return;
	     }
	    	 
	 } 
	
	//
	// rosrun bride_compilers m2t -o brics_test [-p brics_test] model/brics_test.ros_package
	
	 public static void main(String[] args) {

		parseArgs(args);
		System.out.println("InputPackage: " + input_package);
	    System.out.println("OutputPackage: " + output_package);
	    System.out.println("ModelPath: " + model_path);
	    System.out.println("Language: " + language);
	    if(model_path != "" && output_package != "")
	 	{
	        try {
	        	// Try to find model file
	        	String model_uri = findPackageURI(input_package) + "/" + model_path;
	        	System.out.println("Will use model from " + model_uri);
	        	
	        	//Check what model we want to generate for
	        	String ext_type = model_uri.substring(model_uri.lastIndexOf('.')+1, model_uri.length());
	        	System.out.println("File extension is " + ext_type);
	        	String templ_type = "";
	        	if(ext_type.compareTo("ros_package") == 0)
	        	{
	        		templ_type = "package";
	        		if(language.compareTo("cpp") != 0 && language.compareTo("python") != 0)
	        		{
	        			language = "cpp";
	        		}
	        	}
	        	if(ext_type.compareTo("ros_coordinator") == 0)
	        	{
	        		templ_type = "coordinator";
	        		language = "python";
	        	}
	        	if(ext_type.compareTo("ros_system") == 0)
	        		templ_type = "system";
	        	if(templ_type == "")
	        	{
	        		System.out.println("File Extension unknown.");
	        		return;
	        	}
	        	
	        	// Try to find template entrance point
	        	String template_uri = findPackageURI("bride_templates") + "/" + language + "/" + templ_type + "/package.egl";
	        	System.out.println("Will use template from " + template_uri);
	        	
	        	// Try to find output directory
	        	String output_uri = findPackageURI(output_package);
	        	System.out.println("Will generate code to " + output_uri);
	        
	        	
	        	EglFileGeneratingTemplateFactory eglTemplateFactory = new EglFileGeneratingTemplateFactory();
	        	IEolExecutableModule module = new EglTemplateFactoryModuleAdapter(eglTemplateFactory);
	        	System.out.println("Parsing template files...");
	        	eglTemplateFactory.setOutputRoot(output_uri);
	        	module.parse(new File(template_uri));
	        	
	        	System.out.println("Creating final model out of dsl and specific model...");
	        	EmfModel model = createEmfModel("Model", model_uri, findPackageURI("bride_compilers")+"/bin/models/ros.ecore", true, false);
				
	        	module.getContext().getNativeTypeDelegates().add(new CHModToolNativeTypeDelegate());
	        	module.getContext().getNativeTypeDelegates().add(new ConfigFileCreatorNativeTypeDelegate());
	        	
				System.out.println("Adding model to template egl engine...");
	        	module.getContext().getModelRepository().addModel(model);
	        	
	        	Object result = new Object();
	        	try {
	        		System.out.println("Executing engine...");
	    			result = module.execute();
	    		} catch (EolRuntimeException e) {
	    			e.printStackTrace();
	    		}
	        	System.out.println(result);
	        	System.out.println("Done.");
	        } catch (Throwable t) {
	            System.err.println("An unexpected error occured");
	            t.printStackTrace();
	        }
	 	}
	 }
	
}
