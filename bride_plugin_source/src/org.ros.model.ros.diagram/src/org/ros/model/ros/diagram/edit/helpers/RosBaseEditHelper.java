package org.ros.model.ros.diagram.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.ros.model.ros.RosPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.CreateCopyCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.ros.model.ros.diagram.MyAddCommand;
import org.ros.model.ros.diagram.providers.RosElementTypes;

/**
 * @generated
 */
public class RosBaseEditHelper extends GeneratedEditHelperBase {
	@Override
	protected ICommand getConfigureCommand(ConfigureRequest req) {
		//System.out.println("WAAH!");
		//if (req.getElementToConfigure(). == RosElementTypes.Package_2001) {
			CompoundCommand compoundCommand = new CompoundCommand();
			ResourceSet resourceSet = req.getEditingDomain().getResourceSet();
			Resource res = resourceSet.getResource(URI.createURI("platform:/resource/turtle_client_package/model/turtle_client.ros_package"), true);
			Command command = new MyAddCommand(req.getEditingDomain(), res.getContents(), req.getElementToConfigure());
			
			compoundCommand.append(command);
			System.out.println("EditingDomain: " + req.getEditingDomain().toString());
			System.out.println("Trying to execute stuff");
			System.out.println(command.toString());
			if(compoundCommand.canExecute()) {
				System.out.println("Executing stuff");
				compoundCommand.execute();
				try {
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().doSave(new NullProgressMonitor());
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		//}
		System.out.println(req.getElementToConfigure().toString());
		//return new SetValueCommand(new SetRequest(req.getElementToConfigure(), RosPackage.Literals.PACKAGE__NAME, "WAAH"));
		return null;
	}

	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {
		
		return super.getCreateCommand(req);
	}
}
