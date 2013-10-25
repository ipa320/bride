package org.ros.model.ros_coordinator.diagram.part;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.ros.model.ros_coordinator.diagram.edit.parts.ActionStateEditPart;
import org.ros.model.ros_coordinator.diagram.edit.parts.ActionStateNameEditPart;

public class CobTeacherConfigureStateAction implements IObjectActionDelegate {
 
	public final static String ID = "org.ros.model.ros.popup.ConfigureNodeActionID";

	private ActionStateEditPart selectedElement;

	@Override
	public void run(IAction action) {
		System.out.println("Executing Teacher");
		if (selectedElement == null) {
			return;
		}
		String config_file = "";
		String nodename = ((ActionStateNameEditPart)selectedElement.getChildBySemanticHint(SmachVisualIDRegistry.getType(5001))).getEditText();
		IFile sourcefile = null;
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor != null) {
            IEditorInput input = editor.getEditorInput();
            if (input instanceof IFileEditorInput) {
            	sourcefile = ((IFileEditorInput)input).getFile();
            	config_file = sourcefile.getParent().getParent().getLocation().toOSString() + "/config/" + nodename+"_goal.yaml";
            }
		}
		
		String cmd = "rosrun cob_teacher bride_teacher " + config_file;
		System.out.println(cmd);
		Runtime run = Runtime.getRuntime();
		Process pr;
		try {
			pr = run.exec(cmd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof ActionStateEditPart) {
				selectedElement = (ActionStateEditPart) structuredSelection.getFirstElement();
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

	

}
