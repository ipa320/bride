package org.best_of_robotics.transform.sysml_sm.to.smach.handler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import org.best_of_robotics.transform.sysml_sm.to.smach.Activator;
import org.best_of_robotics.transform.service.ITransformService;
import org.best_of_robotics.transform.service.access.TransformAccessActivator;
import org.best_of_robotics.transform.service.parameter.IEtlTransformParameter;
import org.best_of_robotics.transform.service.parameter.TransformParameterFactory;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;	
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.xtext.resource.XtextResource;
//import org.best.of.robotics.SmachDSLStandaloneSetup;
import org.eclipse.ui.IFileEditorInput;

import com.google.inject.Injector;


public class SysMLToSMACHHandler extends AbstractHandler {

	public SysMLToSMACHHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IFile sourceModelFilePath = null;
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor != null) {
            IEditorInput input = editor.getEditorInput();
            if (input instanceof IFileEditorInput) {
            	sourceModelFilePath = ((IFileEditorInput)input).getFile();
            	System.out.println("File from editor: " + sourceModelFilePath.getLocation().toOSString());
            	System.out.println("getFileExtension: " + sourceModelFilePath.getFileExtension().toString().compareTo("di"));
            	if(sourceModelFilePath.getFileExtension().toString().compareTo("di")!=0)
            	{
            		sourceModelFilePath = null;
            		MessageDialog
					.openError(
							PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getShell(),
							"Error on Editor Selection",
							"Please select the editor from which you want to generate code and execute command again.");
            	}
                
            }
        }
		if(sourceModelFilePath == null)
			return null;
				
		//configure new transform parameter
		IEtlTransformParameter etlTransformParameter = TransformParameterFactory.createEtlTransformParameter();
		etlTransformParameter.setTransformName("SYSML to SMACH");
		etlTransformParameter.setEtlTransformPath("epsilon/sysml_sm_to_smach.etl");
		etlTransformParameter.setPluginID(Activator.PLUGIN_ID);
		etlTransformParameter.setSourceMetaModelURI("http://www.eclipse.org/papyrus/0.7.0/SysML/StateMachines");
		etlTransformParameter.setSourceModelFilePath(sourceModelFilePath.getLocation().removeFileExtension().toOSString() + ".uml");
		etlTransformParameter.setSourceName("Source");
		etlTransformParameter.setSourceReadOnLoad(true);
		etlTransformParameter.setSourceStoreOnDisposal(false);
		etlTransformParameter.setTargetMetaModelURI("http://ros/1.0");
		
		String targetModelFilePath = sourceModelFilePath.getLocation().removeFileExtension().toOSString() + "gen.ros_coordinator";
		
		etlTransformParameter.setTargetModelFilePath(targetModelFilePath);
		etlTransformParameter.setTargetName("Target");
		etlTransformParameter.setTargetReadOnLoad(false);
		etlTransformParameter.setTargetStoreOnDisposal(true);
		
		//get transform service
		
		ITransformService transformService = TransformAccessActivator.getDefault().getTransformService();
		
		//do transform
		transformService.doTransform(etlTransformParameter);
		
				
		//now convert XMI to DSL file
		/*Injector inj = new SmachDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = inj.getInstance(ResourceSet.class);
		System.out.println("loading");
		XMIResource xmi_resource = (XMIResource) resourceSet.getResource(URI.createURI("file://"+targetModelFilePath), true);
		System.out.println("loaded");
		XtextResource mydsl_resource = (XtextResource) resourceSet.createResource(URI.createURI("file://" + sourceModelFilePath.getLocation().removeFileExtension().toOSString() + ".smach_model"));
		System.out.println("created xmi");
		System.out.println(xmi_resource.getContents().get(0).toString());
		mydsl_resource.getContents().add(xmi_resource.getContents().get(0));
		System.out.println("Converted");
		System.out.println(mydsl_resource.getContents().toString());
		
		try {
			mydsl_resource.save(Collections.EMPTY_MAP);
			System.out.println("Saved to: " + "file://" + sourceModelFilePath.getLocation().removeFileExtension().toOSString() + ".smach_model" );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Didnt Work");
			e.printStackTrace();
		}
		*/
		//now create diagram file
		
		return null;
	}

}
