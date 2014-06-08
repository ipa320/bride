package org.ros.model.ros_package.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.internal.Workbench;

/**
 * @generated
 */
public class RosCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected org.ros.model.ros_package.diagram.part.RosCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected org.ros.model.ros_package.diagram.part.RosCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(org.ros.model.ros_package.diagram.part.Messages.RosCreationWizardTitle);
		setDefaultPageImageDescriptor(org.ros.model.ros_package.diagram.part.RosDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewRosWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	public static IProject getCurrentProject() {
		ISelectionService selectionService = Workbench.getInstance()
				.getActiveWorkbenchWindow().getSelectionService();

		ISelection selection = selectionService.getSelection();

		IProject project = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			Object element = ss.getFirstElement();
			if (element instanceof IResource)
				return ((IResource) element).getProject();
			if (!(element instanceof IAdaptable))
				return null;
			IAdaptable adaptable = (IAdaptable) element;
			Object adapter = adaptable.getAdapter(IResource.class);
			return ((IResource) adapter).getProject();
		}
		return project;
	}
	
	/**
	 * @not generated
	 */
	public void addPages() {
		diagramModelFilePage = new org.ros.model.ros_package.diagram.part.RosCreationWizardPage(
				"DiagramModelFile", getSelection(), "ros_package_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(org.ros.model.ros_package.diagram.part.Messages.RosCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(org.ros.model.ros_package.diagram.part.Messages.RosCreationWizard_DiagramModelFilePageDescription);
		
		IProject project = getCurrentProject();
		String project_name = "";
		if (project != null) {
			project_name = project.getName();
		}
		diagramModelFilePage.setFileName(project_name + ".ros_package_diagram");
		
		addPage(diagramModelFilePage);

		domainModelFilePage = new org.ros.model.ros_package.diagram.part.RosCreationWizardPage(
				"DomainModelFile", getSelection(), "ros_package") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".ros_package_diagram".length()); //$NON-NLS-1$
					setFileName(org.ros.model.ros_package.diagram.part.RosDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "ros_package")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(org.ros.model.ros_package.diagram.part.Messages.RosCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(org.ros.model.ros_package.diagram.part.Messages.RosCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = org.ros.model.ros_package.diagram.part.RosDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						org.ros.model.ros_package.diagram.part.RosDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										org.ros.model.ros_package.diagram.part.Messages.RosCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								org.ros.model.ros_package.diagram.part.Messages.RosCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				org.ros.model.ros_package.diagram.part.RosDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}

	/**
	 * NOT generated
	 */
	public boolean canFinish() {
		if (getContainer().getCurrentPage() == diagramModelFilePage)
			return false;
		else
			return true;
	}
}
