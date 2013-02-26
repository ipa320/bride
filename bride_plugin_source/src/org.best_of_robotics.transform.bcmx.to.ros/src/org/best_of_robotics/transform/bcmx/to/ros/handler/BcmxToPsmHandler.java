package org.best_of_robotics.transform.bcmx.to.ros.handler;

import org.best_of_robotics.transform.bcmx.to.ros.Activator;
import org.best_of_robotics.transform.service.ITransformService;
import org.best_of_robotics.transform.service.access.TransformAccessActivator;
import org.best_of_robotics.transform.service.parameter.IEtlTransformParameter;
import org.best_of_robotics.transform.service.parameter.TransformParameterFactory;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class BcmxToPsmHandler extends AbstractHandler {

	public BcmxToPsmHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//get the selected source file
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		ISelection selection = window.getSelectionService().getSelection();
		ITreeSelection structuredSelection = (ITreeSelection) selection;
		Object element = structuredSelection.getFirstElement();
		IFile sourceModelFilePath = (IFile) element;
		

		
		//configure new transform parameter
		IEtlTransformParameter etlTransformParameter = TransformParameterFactory.createEtlTransformParameter();
		etlTransformParameter.setTransformName("BCM to ROS");
		etlTransformParameter.setEtlTransformPath("epsilon/bcmToRos.etl");
		etlTransformParameter.setPluginID(Activator.PLUGIN_ID);
		etlTransformParameter.setSourceMetaModelURI("org.best_of_robotics.model.bcmx");
		etlTransformParameter.setSourceModelFilePath(sourceModelFilePath.getLocation().toOSString());
		etlTransformParameter.setSourceName("Source");
		etlTransformParameter.setSourceReadOnLoad(true);
		etlTransformParameter.setSourceStoreOnDisposal(false);
		etlTransformParameter.setTargetMetaModelURI("http://ros/1.0");
		
		FileDialog fileDialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.SAVE);
		fileDialog.setText("ROS Model File Name");
		fileDialog.setFilterPath(sourceModelFilePath.getProject().getLocation().toOSString());
		String targetModelFilePath = fileDialog.open();
		
		etlTransformParameter.setTargetModelFilePath(targetModelFilePath);
		etlTransformParameter.setTargetName("Target");
		etlTransformParameter.setTargetReadOnLoad(false);
		etlTransformParameter.setTargetStoreOnDisposal(true);
		
		//get transform service
		
		ITransformService transformService = TransformAccessActivator.getDefault().getTransformService();
		
		//do transform
		transformService.doTransform(etlTransformParameter);
		
		return null;
	}

}
