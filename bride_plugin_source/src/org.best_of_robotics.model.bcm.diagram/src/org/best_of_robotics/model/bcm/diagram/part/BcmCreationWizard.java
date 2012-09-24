package org.best_of_robotics.model.bcm.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class BcmCreationWizard extends Wizard implements INewWizard {

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
	protected org.best_of_robotics.model.bcm.diagram.part.BcmCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.bcm.diagram.part.BcmCreationWizardPage domainModelFilePage;

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
		setWindowTitle(org.best_of_robotics.model.bcm.diagram.part.Messages.BcmCreationWizardTitle);
		setDefaultPageImageDescriptor(org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewBcmWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new org.best_of_robotics.model.bcm.diagram.part.BcmCreationWizardPage(
				"DiagramModelFile", getSelection(), "bcm_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(org.best_of_robotics.model.bcm.diagram.part.Messages.BcmCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(org.best_of_robotics.model.bcm.diagram.part.Messages.BcmCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new org.best_of_robotics.model.bcm.diagram.part.BcmCreationWizardPage(
				"DomainModelFile", getSelection(), "bcm") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".bcm_diagram".length()); //$NON-NLS-1$
					setFileName(org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "bcm")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(org.best_of_robotics.model.bcm.diagram.part.Messages.BcmCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(org.best_of_robotics.model.bcm.diagram.part.Messages.BcmCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										org.best_of_robotics.model.bcm.diagram.part.Messages.BcmCreationWizardOpenEditorError,
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
								org.best_of_robotics.model.bcm.diagram.part.Messages.BcmCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
