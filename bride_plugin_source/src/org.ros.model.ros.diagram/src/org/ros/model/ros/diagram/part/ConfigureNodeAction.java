package org.ros.model.ros.diagram.part;

import java.io.IOException;
import java.util.Map;


import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.ros.model.ros.diagram.edit.parts.NodeEditPart;
import org.ros.model.ros.diagram.edit.parts.NodeNameEditPart;

public class ConfigureNodeAction implements IObjectActionDelegate {
 
	public final static String ID = "org.ros.model.ros.popup.ConfigureNodeActionID";

	private NodeEditPart selectedElement;

	@Override
	public void run(IAction action) {
		System.out.println("TTUT");
		if (selectedElement == null) {
			return;
		}
		String nodename = ((NodeNameEditPart)selectedElement.getChildBySemanticHint(RosVisualIDRegistry.getType(5008))).getEditText();
		System.out.println(nodename);
		String cmd = "rosrun dynamic_reconfigure reconfigure_gui";
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
			if (structuredSelection.getFirstElement() instanceof NodeEditPart) {
				selectedElement = (NodeEditPart) structuredSelection.getFirstElement();
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

	

}
