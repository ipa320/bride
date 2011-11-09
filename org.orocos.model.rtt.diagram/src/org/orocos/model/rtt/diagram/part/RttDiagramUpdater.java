package org.orocos.model.rtt.diagram.part;

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
import org.orocos.model.rtt.Activity;
import org.orocos.model.rtt.ConnectionPolicy;
import org.orocos.model.rtt.IActivity;
import org.orocos.model.rtt.InputPort;
import org.orocos.model.rtt.Operation;
import org.orocos.model.rtt.OutputPort;
import org.orocos.model.rtt.Package;
import org.orocos.model.rtt.Property;
import org.orocos.model.rtt.RttPackage;
import org.orocos.model.rtt.Slave;
import org.orocos.model.rtt.TaskContext;
import org.orocos.model.rtt.diagram.edit.parts.ActivityEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ActivitySlavesEditPart;
import org.orocos.model.rtt.diagram.edit.parts.ConnectionPolicyEditPart;
import org.orocos.model.rtt.diagram.edit.parts.IActivityTaskContextEditPart;
import org.orocos.model.rtt.diagram.edit.parts.InputPortEditPart;
import org.orocos.model.rtt.diagram.edit.parts.OperationEditPart;
import org.orocos.model.rtt.diagram.edit.parts.OutputPortEditPart;
import org.orocos.model.rtt.diagram.edit.parts.PackageEditPart;
import org.orocos.model.rtt.diagram.edit.parts.PropertyEditPart;
import org.orocos.model.rtt.diagram.edit.parts.SlaveEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextOperationsEditPart;
import org.orocos.model.rtt.diagram.edit.parts.TaskContextPropertiesEditPart;
import org.orocos.model.rtt.diagram.providers.RttElementTypes;

/**
 * @generated
 */
public class RttDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<RttNodeDescriptor> getSemanticChildren(View view) {
		switch (RttVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_2001SemanticChildren(view);
		case TaskContextPropertiesEditPart.VISUAL_ID:
			return getTaskContextProperties_7001SemanticChildren(view);
		case TaskContextOperationsEditPart.VISUAL_ID:
			return getTaskContextOperations_7003SemanticChildren(view);
		case ActivitySlavesEditPart.VISUAL_ID:
			return getActivitySlaves_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttNodeDescriptor> getPackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) view.getElement();
		LinkedList<RttNodeDescriptor> result = new LinkedList<RttNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTaskContext().iterator(); it
				.hasNext();) {
			TaskContext childElement = (TaskContext) it.next();
			int visualID = RttVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TaskContextEditPart.VISUAL_ID) {
				result.add(new RttNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getActivity().iterator(); it
				.hasNext();) {
			IActivity childElement = (IActivity) it.next();
			int visualID = RttVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityEditPart.VISUAL_ID) {
				result.add(new RttNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttNodeDescriptor> getTaskContext_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TaskContext modelElement = (TaskContext) view.getElement();
		LinkedList<RttNodeDescriptor> result = new LinkedList<RttNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOutputPort().iterator(); it
				.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = RttVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new RttNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInputPort().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = RttVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new RttNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttNodeDescriptor> getTaskContextProperties_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TaskContext modelElement = (TaskContext) containerView.getElement();
		LinkedList<RttNodeDescriptor> result = new LinkedList<RttNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProperty().iterator(); it
				.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = RttVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PropertyEditPart.VISUAL_ID) {
				result.add(new RttNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttNodeDescriptor> getTaskContextOperations_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TaskContext modelElement = (TaskContext) containerView.getElement();
		LinkedList<RttNodeDescriptor> result = new LinkedList<RttNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperation().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = RttVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new RttNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttNodeDescriptor> getActivitySlaves_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Activity modelElement = (Activity) containerView.getElement();
		LinkedList<RttNodeDescriptor> result = new LinkedList<RttNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSlave().iterator(); it.hasNext();) {
			Slave childElement = (Slave) it.next();
			int visualID = RttVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SlaveEditPart.VISUAL_ID) {
				result.add(new RttNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getContainedLinks(View view) {
		switch (RttVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_2001ContainedLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002ContainedLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3001ContainedLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3002ContainedLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3003ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3005ContainedLinks(view);
		case SlaveEditPart.VISUAL_ID:
			return getSlave_3004ContainedLinks(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getIncomingLinks(View view) {
		switch (RttVisualIDRegistry.getVisualID(view)) {
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_2001IncomingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002IncomingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3001IncomingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3002IncomingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3003IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3005IncomingLinks(view);
		case SlaveEditPart.VISUAL_ID:
			return getSlave_3004IncomingLinks(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getOutgoingLinks(View view) {
		switch (RttVisualIDRegistry.getVisualID(view)) {
		case TaskContextEditPart.VISUAL_ID:
			return getTaskContext_2001OutgoingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002OutgoingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3001OutgoingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3002OutgoingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3003OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3005OutgoingLinks(view);
		case SlaveEditPart.VISUAL_ID:
			return getSlave_3004OutgoingLinks(view);
		case ConnectionPolicyEditPart.VISUAL_ID:
			return getConnectionPolicy_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getPackage_1000ContainedLinks(
			View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConnectionPolicy_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getTaskContext_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getActivity_2002ContainedLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_IActivity_TaskContext_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getOutputPort_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getInputPort_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getProperty_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getOperation_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getSlave_3004ContainedLinks(View view) {
		Slave modelElement = (Slave) view.getElement();
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_IActivity_TaskContext_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getConnectionPolicy_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getTaskContext_2001IncomingLinks(
			View view) {
		TaskContext modelElement = (TaskContext) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_IActivity_TaskContext_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getActivity_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getOutputPort_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getInputPort_3002IncomingLinks(
			View view) {
		InputPort modelElement = (InputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConnectionPolicy_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getProperty_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getOperation_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getSlave_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getConnectionPolicy_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getTaskContext_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getActivity_2002OutgoingLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_IActivity_TaskContext_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getOutputPort_3001OutgoingLinks(
			View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConnectionPolicy_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getInputPort_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getProperty_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getOperation_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getSlave_3004OutgoingLinks(View view) {
		Slave modelElement = (Slave) view.getElement();
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_IActivity_TaskContext_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RttLinkDescriptor> getConnectionPolicy_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RttLinkDescriptor> getContainedTypeModelFacetLinks_ConnectionPolicy_4001(
			Package container) {
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		for (Iterator<?> links = container.getConnectionPolicy().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConnectionPolicy) {
				continue;
			}
			ConnectionPolicy link = (ConnectionPolicy) linkObject;
			if (ConnectionPolicyEditPart.VISUAL_ID != RttVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InputPort dst = link.getInputPort();
			OutputPort src = link.getOutputPort();
			result.add(new RttLinkDescriptor(src, dst, link,
					RttElementTypes.ConnectionPolicy_4001,
					ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RttLinkDescriptor> getIncomingTypeModelFacetLinks_ConnectionPolicy_4001(
			InputPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RttPackage.eINSTANCE
					.getConnectionPolicy_InputPort()
					|| false == setting.getEObject() instanceof ConnectionPolicy) {
				continue;
			}
			ConnectionPolicy link = (ConnectionPolicy) setting.getEObject();
			if (ConnectionPolicyEditPart.VISUAL_ID != RttVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OutputPort src = link.getOutputPort();
			result.add(new RttLinkDescriptor(src, target, link,
					RttElementTypes.ConnectionPolicy_4001,
					ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RttLinkDescriptor> getIncomingFeatureModelFacetLinks_IActivity_TaskContext_4002(
			TaskContext target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RttPackage.eINSTANCE
					.getIActivity_TaskContext()) {
				result.add(new RttLinkDescriptor(setting.getEObject(), target,
						RttElementTypes.IActivityTaskContext_4002,
						IActivityTaskContextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RttLinkDescriptor> getOutgoingTypeModelFacetLinks_ConnectionPolicy_4001(
			OutputPort source) {
		Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Package) {
				container = (Package) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		for (Iterator<?> links = container.getConnectionPolicy().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConnectionPolicy) {
				continue;
			}
			ConnectionPolicy link = (ConnectionPolicy) linkObject;
			if (ConnectionPolicyEditPart.VISUAL_ID != RttVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InputPort dst = link.getInputPort();
			OutputPort src = link.getOutputPort();
			if (src != source) {
				continue;
			}
			result.add(new RttLinkDescriptor(src, dst, link,
					RttElementTypes.ConnectionPolicy_4001,
					ConnectionPolicyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RttLinkDescriptor> getOutgoingFeatureModelFacetLinks_IActivity_TaskContext_4002(
			IActivity source) {
		LinkedList<RttLinkDescriptor> result = new LinkedList<RttLinkDescriptor>();
		TaskContext destination = source.getTaskContext();
		if (destination == null) {
			return result;
		}
		result.add(new RttLinkDescriptor(source, destination,
				RttElementTypes.IActivityTaskContext_4002,
				IActivityTaskContextEditPart.VISUAL_ID));
		return result;
	}

}
