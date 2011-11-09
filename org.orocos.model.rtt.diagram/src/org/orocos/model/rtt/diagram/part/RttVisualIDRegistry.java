package org.orocos.model.rtt.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.orocos.model.rtt.Package;
import org.orocos.model.rtt.RttPackage;
import org.orocos.model.rtt.diagram.edit.parts.ActivityCpuAffinityEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivityEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivityNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivityPeriodEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivityPriorityEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivitySchedulerEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivitySlavesEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ConnectionPolicyEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ConnectionPolicyNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.InputPortEditPart;
import org.orocos.model.rtt.diagram.edit.parts.InputPortIsEventPortEditPart;
import org.orocos.model.rtt.diagram.edit.parts.InputPortNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.InputPortTypeEditPart;
import org.orocos.model.rtt.diagram.edit.parts.OperationEditPart;
import org.orocos.model.rtt.diagram.edit.parts.OutputPortEditPart;
import org.orocos.model.rtt.diagram.edit.parts.OutputPortNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.OutputPortTypeEditPart;
import org.orocos.model.rtt.diagram.edit.parts.PackageEditPart;
import org.orocos.model.rtt.diagram.edit.parts.PropertyEditPart;
import org.orocos.model.rtt.diagram.edit.parts.SlaveEditPart;
import org.orocos.model.rtt.diagram.edit.parts.SlaveNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextNameEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextNamespaceEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextOperationsEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextPropertiesEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextTypeEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RttVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.orocos.model.rtt.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PackageEditPart.MODEL_ID.equals(view.getType())) {
				return PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.orocos.model.rtt.diagram.part.RttVisualIDRegistry
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
				RttDiagramEditorPlugin.getInstance().logError(
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
		if (RttPackage.eINSTANCE.getPackage().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Package) domainElement)) {
			return PackageEditPart.VISUAL_ID;
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
		String containerModelID = org.orocos.model.rtt.diagram.part.RttVisualIDRegistry
				.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.orocos.model.rtt.diagram.part.RttVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PackageEditPart.VISUAL_ID:
			if (RttPackage.eINSTANCE.getTaskContext().isSuperTypeOf(
					domainElement.eClass())) {
				return TaskContextEditPart.VISUAL_ID;
			}
			if (RttPackage.eINSTANCE.getActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ActivityEditPart.VISUAL_ID;
			}
			break;
		case TaskContextEditPart.VISUAL_ID:
			if (RttPackage.eINSTANCE.getOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			if (RttPackage.eINSTANCE.getInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			break;
		case TaskContextPropertiesEditPart.VISUAL_ID:
			if (RttPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case TaskContextOperationsEditPart.VISUAL_ID:
			if (RttPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case ActivitySlavesEditPart.VISUAL_ID:
			if (RttPackage.eINSTANCE.getSlave().isSuperTypeOf(
					domainElement.eClass())) {
				return SlaveEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.orocos.model.rtt.diagram.part.RttVisualIDRegistry
				.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.orocos.model.rtt.diagram.part.RttVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PackageEditPart.VISUAL_ID:
			if (TaskContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskContextEditPart.VISUAL_ID:
			if (TaskContextNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskContextNamespaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskContextTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskContextPropertiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskContextOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEditPart.VISUAL_ID:
			if (ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityCpuAffinityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityPeriodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityPriorityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivitySchedulerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivitySlavesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputPortEditPart.VISUAL_ID:
			if (OutputPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPortTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPortEditPart.VISUAL_ID:
			if (InputPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPortTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPortIsEventPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SlaveEditPart.VISUAL_ID:
			if (SlaveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskContextPropertiesEditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskContextOperationsEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivitySlavesEditPart.VISUAL_ID:
			if (SlaveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionPolicyEditPart.VISUAL_ID:
			if (ConnectionPolicyNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (RttPackage.eINSTANCE.getConnectionPolicy().isSuperTypeOf(
				domainElement.eClass())) {
			return ConnectionPolicyEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Package element) {
		return true;
	}

}
