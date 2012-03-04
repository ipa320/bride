package org.ros.model.ros.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.ros.model.ros.Package;
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.diagram.edit.parts.NodeEditPart;
import org.ros.model.ros.diagram.edit.parts.NodeNameEditPart;
import org.ros.model.ros.diagram.edit.parts.NodeParametersEditPart;
import org.ros.model.ros.diagram.edit.parts.PackageEditPart;
import org.ros.model.ros.diagram.edit.parts.ParameterEditPart;
import org.ros.model.ros.diagram.edit.parts.PublisherEditPart;
import org.ros.model.ros.diagram.edit.parts.PublisherNameEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceClientEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceClientNameEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceNameEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceServerEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceServerNameEditPart;
import org.ros.model.ros.diagram.edit.parts.SubscriberEditPart;
import org.ros.model.ros.diagram.edit.parts.SubscriberNameEditPart;
import org.ros.model.ros.diagram.edit.parts.TopicEditPart;
import org.ros.model.ros.diagram.edit.parts.TopicNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RosVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.ros.model.ros.diagram/debug/visualID"; //$NON-NLS-1$

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
		return org.ros.model.ros.diagram.part.RosVisualIDRegistry
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
				RosDiagramEditorPlugin.getInstance().logError(
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
		if (RosPackage.eINSTANCE.getPackage().isSuperTypeOf(
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
		String containerModelID = org.ros.model.ros.diagram.part.RosVisualIDRegistry
				.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.ros.model.ros.diagram.part.RosVisualIDRegistry
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
			if (RosPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())) {
				return NodeEditPart.VISUAL_ID;
			}
			if (RosPackage.eINSTANCE.getTopic().isSuperTypeOf(
					domainElement.eClass())) {
				return TopicEditPart.VISUAL_ID;
			}
			if (RosPackage.eINSTANCE.getService().isSuperTypeOf(
					domainElement.eClass())) {
				return ServiceEditPart.VISUAL_ID;
			}
			break;
		case NodeParametersEditPart.VISUAL_ID:
			if (RosPackage.eINSTANCE.getParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.ros.model.ros.diagram.part.RosVisualIDRegistry
				.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.ros.model.ros.diagram.part.RosVisualIDRegistry
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
			if (NodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TopicEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodeEditPart.VISUAL_ID:
			if (NodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeParametersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TopicEditPart.VISUAL_ID:
			if (TopicNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceEditPart.VISUAL_ID:
			if (ServiceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodeParametersEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceClientEditPart.VISUAL_ID:
			if (ServiceClientNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubscriberEditPart.VISUAL_ID:
			if (SubscriberNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceServerEditPart.VISUAL_ID:
			if (ServiceServerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PublisherEditPart.VISUAL_ID:
			if (PublisherNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (RosPackage.eINSTANCE.getServiceClient().isSuperTypeOf(
				domainElement.eClass())) {
			return ServiceClientEditPart.VISUAL_ID;
		}
		if (RosPackage.eINSTANCE.getSubscriber().isSuperTypeOf(
				domainElement.eClass())) {
			return SubscriberEditPart.VISUAL_ID;
		}
		if (RosPackage.eINSTANCE.getServiceServer().isSuperTypeOf(
				domainElement.eClass())) {
			return ServiceServerEditPart.VISUAL_ID;
		}
		if (RosPackage.eINSTANCE.getPublisher().isSuperTypeOf(
				domainElement.eClass())) {
			return PublisherEditPart.VISUAL_ID;
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
