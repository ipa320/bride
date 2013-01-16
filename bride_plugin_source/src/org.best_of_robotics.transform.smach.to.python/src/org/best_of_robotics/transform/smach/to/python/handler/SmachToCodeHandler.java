package org.best_of_robotics.transform.smach.to.python.handler;

import org.best_of_robotics.transform.service.ITransformService;
import org.best_of_robotics.transform.service.access.TransformAccessActivator;
import org.best_of_robotics.transform.service.parameter.IEglTransformParameter;
import org.best_of_robotics.transform.service.parameter.TransformParameterFactory;
import org.best_of_robotics.transform.smach.to.python.Activator;
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

public class SmachToCodeHandler extends AbstractHandler {

	public SmachToCodeHandler() {
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
		IEglTransformParameter eglTransformParameter = TransformParameterFactory.createEglTransformParameter();
		eglTransformParameter.setTransformName("SMACH to python implementation");
		eglTransformParameter.setEglTransform("epsilon/smach_to_code.egl");//??
		eglTransformParameter.setPluginID(Activator.PLUGIN_ID);
		eglTransformParameter.setSourceMetaModelURI("http://www.best.org/of/robotics/SmachDSL");
		eglTransformParameter.setSourceModelFilePath(sourceModelFilePath.getLocation().toOSString());
		eglTransformParameter.setSourceName("Source");
		eglTransformParameter.setSourceReadOnLoad(true);
		eglTransformParameter.setSourceStoreOnDisposal(false);
		
		eglTransformParameter.setOutputRoot(sourceModelFilePath.getParent().getLocation().toOSString());
		
		//get transform service
		
		ITransformService transformService = TransformAccessActivator.getDefault().getTransformService();
		
		//do transform
		transformService.doTransform(eglTransformParameter);
		
		
		return null;
	}
}
