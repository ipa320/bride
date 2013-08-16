package org.ros.model.ros_package.diagram.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.resource.XtextResource;
import org.ros.model.ros_package.dsl.RosPackageStandaloneSetup;

import com.google.inject.Injector;

/**
 * @generated
 */
public class RosInitDiagramFileAction implements IObjectActionDelegate {

	/**
	 * @generated
	 */
	private IWorkbenchPart targetPart;
	/**
	 * @generated
	 */
	private URI domainModelURI;

	/**
	 * @generated
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @generated
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		domainModelURI = null;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false
				|| selection.isEmpty()) {
			return;
		}
		IFile file = (IFile) ((IStructuredSelection) selection)
				.getFirstElement();
		domainModelURI = URI.createPlatformResourceURI(file.getFullPath()
				.toString(), true);
		action.setEnabled(true);
	}

	/**
	 * @generated
	 */
	private Shell getShell() {
		return targetPart.getSite().getShell();
	}

	/**
	 * @generated
	 */
	public void run(IAction action) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		// ResourceSet resourceSet = editingDomain.getResourceSet();
		Injector inj = new RosPackageStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = inj.getInstance(ResourceSet.class);

		EObject diagramRoot = null;
		try {
			XtextResource resource = (XtextResource) resourceSet.getResource(
					domainModelURI, true);
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			org.ros.model.ros_package.diagram.part.RosDiagramEditorPlugin
					.getInstance().logError(
							"Unable to load resource: " + domainModelURI, ex); //$NON-NLS-1$
		}
		if (diagramRoot == null) {
			MessageDialog
					.openError(
							getShell(),
							org.ros.model.ros_package.diagram.part.Messages.InitDiagramFile_ResourceErrorDialogTitle,
							org.ros.model.ros_package.diagram.part.Messages.InitDiagramFile_ResourceErrorDialogMessage);
			return;
		}
		Wizard wizard = new org.ros.model.ros_package.diagram.part.RosNewDiagramFileWizard(
				domainModelURI, diagramRoot, editingDomain);
		wizard.setWindowTitle(NLS
				.bind(org.ros.model.ros_package.diagram.part.Messages.InitDiagramFile_WizardTitle,
						org.ros.model.ros_package.diagram.edit.parts.PackageEditPart.MODEL_ID));
		org.ros.model.ros_package.diagram.part.RosDiagramEditorUtil.runWizard(
				getShell(), wizard, "InitDiagramFile"); //$NON-NLS-1$
	}
}
