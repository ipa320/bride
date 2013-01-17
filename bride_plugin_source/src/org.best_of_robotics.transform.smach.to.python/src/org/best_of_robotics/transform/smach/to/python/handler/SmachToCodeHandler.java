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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class SmachToCodeHandler extends AbstractHandler {

	public SmachToCodeHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//get the selected source file
				
		IFile sourcefile = null;
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor != null) {
            IEditorInput input = editor.getEditorInput();
            if (input instanceof IFileEditorInput) {
            	sourcefile = ((IFileEditorInput)input).getFile();
            	System.out.println("File from editor: " + sourcefile.getLocation().toOSString());
            	if(sourcefile.getFileExtension() != "smach_model")
            	{
            		sourcefile = null;
            		MessageDialog
					.openError(
							PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getShell(),
							"Error on Editor Selection",
							"Please select the editor from which you want to generate code and execute command again.");
            	}
                
            }
        }
		if(sourcefile == null)
			return null;
		
		//configure new transform parameter
		IEglTransformParameter eglTransformParameter = TransformParameterFactory.createEglTransformParameter();
		eglTransformParameter.setTransformName("SMACH to python implementation");
		eglTransformParameter.setEglTransform("epsilon/smach_to_code.egl");//??
		eglTransformParameter.setPluginID(Activator.PLUGIN_ID);
		eglTransformParameter.setSourceMetaModelURI("http://www.best.org/of/robotics/SmachDSL");
		eglTransformParameter.setSourceModelFilePath(sourcefile.getLocation().toOSString());
		eglTransformParameter.setSourceName("Source");
		eglTransformParameter.setSourceReadOnLoad(true);
		eglTransformParameter.setSourceStoreOnDisposal(false);
		
		eglTransformParameter.setOutputRoot(sourcefile.getParent().getLocation().toOSString());
		
		//get transform service
		
		ITransformService transformService = TransformAccessActivator.getDefault().getTransformService();
		
		//do transform
		transformService.doTransform(eglTransformParameter);
		
		
		return null;
	}
}
