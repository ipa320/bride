package org.ros.model.ros.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.ros.model.ros.Architecture;
import org.ros.model.ros.Package;
import org.ros.model.ros.RosFactory;
import org.ros.model.ros.diagram.WSFileDialog;

/**
 * @generated
 */
public class PackageCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public PackageCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}

	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {

		//IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("Tatiana");
		//IFolder filters = project.getFolder("filters");

		WSFileDialog dialog = new WSFileDialog(PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell(), SWT.SINGLE,
				"Choose a filter to create new replayable", ResourcesPlugin
						.getWorkspace().getRoot(), true, new String[] {
						"ros_package", "ros_coordinator" }, null);
		int result = dialog.open();
		if (result == WSFileDialog.OK) {
			IResource resource = dialog.getSingleResult();
			System.out.println(" ######## Selected File "
					+ resource.getFullPath());
			ResourceSet resourceSet = getEditingDomain().getResourceSet();
			Resource res = resourceSet.getResource(
					URI.createURI("platform:/resource/"
							+ resource.getFullPath()), true);
			if (res.getContents().size() > 1) {
				for (int i = 0; i < res.getContents().size(); i++)
					System.out.println("Contents:"
							+ res.getContents().get(i).toString());
			}
			Package newElement = (Package) res.getContents().get(0);
			Architecture owner = (Architecture) getElementToEdit();
			owner.getPackages().add(newElement);

			System.out.println("Adding new Element to Architecture: "
					+ newElement.toString());

			doConfigure(newElement, monitor, info);

			((CreateElementRequest) getRequest()).setNewElement(newElement);
			return CommandResult.newOKCommandResult(newElement);
		} else
			return null;

	}

	/**
	 * @generated
	 */
	protected void doConfigure(Package newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
