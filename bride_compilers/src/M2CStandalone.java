
import java.net.URI;
import java.io.File;
import java.net.URISyntaxException; 
	


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
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, "file:/" + getFile(metamodel).getAbsolutePath());
		properties.put(EmfModel.PROPERTY_MODEL_URI, "file:/" + getFile(model).getAbsolutePath());
		properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "true");
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, null);
		return emfModel;
	}
	
	 public static void main(String[] args) {
	        try {
	        	EglFileGeneratingTemplateFactory eglTemplateFactory = new EglFileGeneratingTemplateFactory();
	        	IEolExecutableModule module = new EglTemplateFactoryModuleAdapter(eglTemplateFactory);
	        	System.out.println("Parsing template files...");
	        	eglTemplateFactory.setOutputRoot(M2CStandalone.class.getResource("ros_package/").toString());
	        	module.parse(getFile("egl/package.egl"));
	        	
	        	System.out.println("Creating final model out of dsl and specific model...");
	        	EmfModel model = createEmfModel("Model", "models/gripper.ros", "models/ros.ecore", true, false);
				
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
