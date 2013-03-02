
import java.net.URI;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException; 
import java.util.ArrayList;
import java.util.List;
	


import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.commons.util.StringProperties;
import org.ros.model.ros.RosPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;




public class M2CStandalone {

	
	protected static File getFile(String fileName) throws URISyntaxException {
		
		URI binUri = M2CStandalone.class.getResource(fileName).toURI();
		URI uri = null;
		
		if (binUri.toString().indexOf("bin") > -1) {
			uri = new URI(binUri.toString().replaceAll("bin", "src"));
		}
		else {
			uri = binUri;
		}
		return new File(uri);
	}
	
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
	
	 public static void main(String[] args) {
		 	if(args.length == 1)
		 	{
		        try {
		        	// Try to find template entrance point
		        	String template_uri = findPackageURI("bride_templates") + "/cpp/package.egl";
		        	System.out.println("Will use template from " + template_uri);
		        	// Try to find model file
		        	String model_uri = findPackageURI(args[0]) + "/model/" + args[0] + ".ros_package";
		        	System.out.println("Will use model from " + model_uri);
		        	// Try to find output directory
		        	String output_uri = findPackageURI(args[0]);
		        	System.out.println("Will generate code to " + output_uri);
		        	
		        	EglFileGeneratingTemplateFactory eglTemplateFactory = new EglFileGeneratingTemplateFactory();
		        	IEolExecutableModule module = new EglTemplateFactoryModuleAdapter(eglTemplateFactory);
		        	System.out.println("Parsing template files...");
		        	eglTemplateFactory.setOutputRoot(output_uri);
		        	module.parse(new File(template_uri));
		        	
		        	System.out.println("Creating final model out of dsl and specific model...");
		        	EmfModel model = createEmfModel("Model", model_uri, findPackageURI("bride_compilers")+"/bin/models/ros.ecore", true, false);
					
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
		 	else
		 	{
		 		System.out.println("Usage: m2t package_name ");
		 	}
	 }
	
}
