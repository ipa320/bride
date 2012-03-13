package org.best_of_robotics.model.orocos.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class OrocosVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.best_of_robotics.model.orocos.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.MODEL_ID
					.equals(view.getType())) {
				return org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				org.best_of_robotics.model.orocos.diagram.part.OrocosDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
				.getPackage().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((org.best_of_robotics.model.orocos.Package) domainElement)) {
			return org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
				.getModelID(containerView);
		if (!org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getTaskContext().isSuperTypeOf(domainElement.eClass())) {
				return org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID;
			}
			if (org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID;
			}
			break;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
			}
			if (org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getInputPort().isSuperTypeOf(domainElement.eClass())) {
				return org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
			}
			break;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextPropertiesEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID;
			}
			break;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextOperationsEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
				.getModelID(containerView);
		if (!org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextNamespaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextPropertiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextPropertiesEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextOperationsEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID:
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
				.getConnectionPolicy().isSuperTypeOf(domainElement.eClass())) {
			return org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			org.best_of_robotics.model.orocos.Package element) {
		return true;
	}

}
