package org.best_of_robotics.transform.sysml_sm.to.smach.handler;

import java.io.FileOutputStream;
import java.io.IOException;
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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;	
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.parsetree.reconstr.SerializerOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.best.of.robotics.SmachDSLStandaloneSetup;

import com.google.inject.Injector;


public class SysMLToSMACHHandler extends AbstractHandler {

	public SysMLToSMACHHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		//get the selected source file
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		
		ISelection selection = window.getSelectionService().getSelection();
		
		ITreeSelection structuredSelection = (ITreeSelection) selection;
		
		Object element = structuredSelection.getFirstElement();
		
		//org.eclipse.papyrus.infra.onefile.model.impl.PapyrusFile pfile = (org.eclipse.papyrus.infra.onefile.model.impl.PapyrusFile) elementp;
		//IFile sourceModelFilePath = (IFile) element;
		
		
		//configure new transform parameter
		IEtlTransformParameter etlTransformParameter = TransformParameterFactory.createEtlTransformParameter();
		etlTransformParameter.setTransformName("SYSML to SMACH");
		etlTransformParameter.setEtlTransformPath("epsilon/sysml_sm_to_smach.etl");
		etlTransformParameter.setPluginID(Activator.PLUGIN_ID);
		etlTransformParameter.setSourceMetaModelURI("http://www.eclipse.org/papyrus/0.7.0/SysML/StateMachines");
		//etlTransformParameter.setSourceModelFilePath(sourceModelFilePath.getLocation().toOSString());
		etlTransformParameter.setSourceModelFilePath("/home/aub/sandbox/brics/runtime-EclipseXtext/xtexttest/src/sysml_test.uml");
		etlTransformParameter.setSourceName("Source");
		etlTransformParameter.setSourceReadOnLoad(true);
		etlTransformParameter.setSourceStoreOnDisposal(false);
		etlTransformParameter.setTargetMetaModelURI("http://www.best.org/of/robotics/SmachDSL");
		
		
		FileDialog fileDialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.SAVE);
		fileDialog.setText("SMACH Model File Name");
		fileDialog.setFilterPath("/home/aub/sandbox/brics/runtime-EclipseXtext/xtexttest/src/");
		String targetModelFilePath = fileDialog.open();
		
		etlTransformParameter.setTargetModelFilePath(targetModelFilePath);
		etlTransformParameter.setTargetName("Target");
		etlTransformParameter.setTargetReadOnLoad(false);
		etlTransformParameter.setTargetStoreOnDisposal(true);
		
		//get transform service
		
		ITransformService transformService = TransformAccessActivator.getDefault().getTransformService();
		
		//do transform
		transformService.doTransform(etlTransformParameter);
		
				
		//now convert XMI to DSL file
		
		Injector inj = new SmachDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = inj.getInstance(ResourceSet.class);
		
		// Obtain a new resource set
	    //ResourceSet resourceSet = new ResourceSetImpl();

	    // Get the resource
	    //Resource resource = resSet.getResource(URI .createURI("website/My.website"), true);
		System.out.println("loading");
		XtextResource xmi_resource = (XtextResource) resourceSet.getResource(URI.createURI("file:///home/aub/sandbox/brics/runtime-EclipseXtext/xtexttest/src/andersrum.smach_model"), true);
		System.out.println(xmi_resource.getParser().toString());
		System.out.println(xmi_resource.getParseResult().getRootASTElement().toString());
		System.out.println("loaded");
		XMIResource mydsl_resource = (XMIResource) resourceSet.createResource(URI.createURI("file:///home/aub/sandbox/brics/runtime-EclipseXtext/xtexttest/src/andersrum.smach_xmi"));
		System.out.println("created xmi");
		System.out.println(xmi_resource.getContents().get(0).toString());
		mydsl_resource.getContents().add(xmi_resource.getContents().get(0));
		System.out.println("Converted");
		System.out.println(mydsl_resource.getContents().toString());

		try {
			mydsl_resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Didnt Work");
			e.printStackTrace();
		}
		
		return null;
	}

}
