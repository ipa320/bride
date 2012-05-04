package org.best_of_robotics.model.orocos.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OrocosDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID:
			return getTaskContext_2001SemanticChildren(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextPropertiesEditPart.VISUAL_ID:
			return getTaskContextProperties_7001SemanticChildren(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextOperationsEditPart.VISUAL_ID:
			return getTaskContextOperations_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor> getPackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.best_of_robotics.model.orocos.Package modelElement = (org.best_of_robotics.model.orocos.Package) view
				.getElement();
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskContext().iterator(); it
				.hasNext();) {
			org.best_of_robotics.model.orocos.TaskContext childElement = (org.best_of_robotics.model.orocos.TaskContext) it
					.next();
			int visualID = org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID) {
				result.add(new org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getActivity().iterator(); it
				.hasNext();) {
			org.best_of_robotics.model.orocos.IActivity childElement = (org.best_of_robotics.model.orocos.IActivity) it
					.next();
			int visualID = org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID) {
				result.add(new org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor> getTaskContext_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.best_of_robotics.model.orocos.TaskContext modelElement = (org.best_of_robotics.model.orocos.TaskContext) view
				.getElement();
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOutputPort().iterator(); it
				.hasNext();) {
			org.best_of_robotics.model.orocos.OutputPort childElement = (org.best_of_robotics.model.orocos.OutputPort) it
					.next();
			int visualID = org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
				result.add(new org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInputPort().iterator(); it
				.hasNext();) {
			org.best_of_robotics.model.orocos.InputPort childElement = (org.best_of_robotics.model.orocos.InputPort) it
					.next();
			int visualID = org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
				result.add(new org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor> getTaskContextProperties_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.best_of_robotics.model.orocos.TaskContext modelElement = (org.best_of_robotics.model.orocos.TaskContext) containerView
				.getElement();
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProperty().iterator(); it
				.hasNext();) {
			org.best_of_robotics.model.orocos.Property childElement = (org.best_of_robotics.model.orocos.Property) it
					.next();
			int visualID = org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID) {
				result.add(new org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor> getTaskContextOperations_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		org.best_of_robotics.model.orocos.TaskContext modelElement = (org.best_of_robotics.model.orocos.TaskContext) containerView
				.getElement();
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperacion().iterator(); it
				.hasNext();) {
			org.best_of_robotics.model.orocos.Operation childElement = (org.best_of_robotics.model.orocos.Operation) it
					.next();
			int visualID = org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID) {
				result.add(new org.best_of_robotics.model.orocos.diagram.part.OrocosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID:
			return getTaskContext_2001ContainedLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getActivity_2002ContainedLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3001ContainedLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getInputPort_3002ContainedLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getProperty_3003ContainedLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3004ContainedLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID:
			return getTaskContext_2001IncomingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getActivity_2002IncomingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3001IncomingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getInputPort_3002IncomingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getProperty_3003IncomingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3004IncomingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID:
			return getTaskContext_2001OutgoingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
			return getActivity_2002OutgoingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3001OutgoingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return getInputPort_3002OutgoingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
			return getProperty_3003OutgoingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID:
			return getOperation_3004OutgoingLinks(view);
		case org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getPackage_1000ContainedLinks(
			View view) {
		org.best_of_robotics.model.orocos.Package modelElement = (org.best_of_robotics.model.orocos.Package) view
				.getElement();
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConnectionPolicy_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getTaskContext_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getActivity_2002ContainedLinks(
			View view) {
		org.best_of_robotics.model.orocos.Activity modelElement = (org.best_of_robotics.model.orocos.Activity) view
				.getElement();
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_IActivity_TaskContext_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getOutputPort_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getInputPort_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getProperty_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getOperation_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getConnectionPolicy_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getTaskContext_2001IncomingLinks(
			View view) {
		org.best_of_robotics.model.orocos.TaskContext modelElement = (org.best_of_robotics.model.orocos.TaskContext) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_IActivity_TaskContext_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getActivity_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getOutputPort_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getInputPort_3002IncomingLinks(
			View view) {
		org.best_of_robotics.model.orocos.InputPort modelElement = (org.best_of_robotics.model.orocos.InputPort) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionPolicy_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getProperty_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getOperation_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getConnectionPolicy_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getTaskContext_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getActivity_2002OutgoingLinks(
			View view) {
		org.best_of_robotics.model.orocos.Activity modelElement = (org.best_of_robotics.model.orocos.Activity) view
				.getElement();
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_IActivity_TaskContext_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getOutputPort_3001OutgoingLinks(
			View view) {
		org.best_of_robotics.model.orocos.OutputPort modelElement = (org.best_of_robotics.model.orocos.OutputPort) view
				.getElement();
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionPolicy_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getInputPort_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getProperty_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getOperation_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getConnectionPolicy_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getContainedTypeModelFacetLinks_ConnectionPolicy_4001(
			org.best_of_robotics.model.orocos.Package container) {
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor>();
		for (Iterator<?> links = container.getConnectionPolicy().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.best_of_robotics.model.orocos.ConnectionPolicy) {
				continue;
			}
			org.best_of_robotics.model.orocos.ConnectionPolicy link = (org.best_of_robotics.model.orocos.ConnectionPolicy) linkObject;
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID != org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			org.best_of_robotics.model.orocos.InputPort dst = link
					.getInputPort();
			org.best_of_robotics.model.orocos.OutputPort src = link
					.getOutputPort();
			result.add(new org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor(
					src,
					dst,
					link,
					org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.ConnectionPolicy_4001,
					org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getIncomingTypeModelFacetLinks_ConnectionPolicy_4001(
			org.best_of_robotics.model.orocos.InputPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getConnectionPolicy_InputPort()
					|| false == setting.getEObject() instanceof org.best_of_robotics.model.orocos.ConnectionPolicy) {
				continue;
			}
			org.best_of_robotics.model.orocos.ConnectionPolicy link = (org.best_of_robotics.model.orocos.ConnectionPolicy) setting
					.getEObject();
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID != org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			org.best_of_robotics.model.orocos.OutputPort src = link
					.getOutputPort();
			result.add(new org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor(
					src,
					target,
					link,
					org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.ConnectionPolicy_4001,
					org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getIncomingFeatureModelFacetLinks_IActivity_TaskContext_4002(
			org.best_of_robotics.model.orocos.TaskContext target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == org.best_of_robotics.model.orocos.OrocosPackage.eINSTANCE
					.getIActivity_TaskContext()) {
				result.add(new org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor(
						setting.getEObject(),
						target,
						org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.IActivityTaskContext_4002,
						org.best_of_robotics.model.orocos.diagram.edit.parts.IActivityTaskContextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getOutgoingTypeModelFacetLinks_ConnectionPolicy_4001(
			org.best_of_robotics.model.orocos.OutputPort source) {
		org.best_of_robotics.model.orocos.Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof org.best_of_robotics.model.orocos.Package) {
				container = (org.best_of_robotics.model.orocos.Package) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor>();
		for (Iterator<?> links = container.getConnectionPolicy().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.best_of_robotics.model.orocos.ConnectionPolicy) {
				continue;
			}
			org.best_of_robotics.model.orocos.ConnectionPolicy link = (org.best_of_robotics.model.orocos.ConnectionPolicy) linkObject;
			if (org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID != org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			org.best_of_robotics.model.orocos.InputPort dst = link
					.getInputPort();
			org.best_of_robotics.model.orocos.OutputPort src = link
					.getOutputPort();
			if (src != source) {
				continue;
			}
			result.add(new org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor(
					src,
					dst,
					link,
					org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.ConnectionPolicy_4001,
					org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> getOutgoingFeatureModelFacetLinks_IActivity_TaskContext_4002(
			org.best_of_robotics.model.orocos.IActivity source) {
		LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor>();
		org.best_of_robotics.model.orocos.TaskContext destination = source
				.getTaskContext();
		if (destination == null) {
			return result;
		}
		result.add(new org.best_of_robotics.model.orocos.diagram.part.OrocosLinkDescriptor(
				source,
				destination,
				org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.IActivityTaskContext_4002,
				org.best_of_robotics.model.orocos.diagram.edit.parts.IActivityTaskContextEditPart.VISUAL_ID));
		return result;
	}

}
