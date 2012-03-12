package org.ros.model.ros.diagram.part;

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
import org.ros.model.ros.Node;
import org.ros.model.ros.Package;
import org.ros.model.ros.Parameter;
import org.ros.model.ros.Publisher;
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.Service;
import org.ros.model.ros.ServiceClient;
import org.ros.model.ros.ServiceServer;
import org.ros.model.ros.Subscriber;
import org.ros.model.ros.Topic;
import org.ros.model.ros.diagram.edit.parts.NodeEditPart;
import org.ros.model.ros.diagram.edit.parts.NodeParametersEditPart;
import org.ros.model.ros.diagram.edit.parts.PackageEditPart;
import org.ros.model.ros.diagram.edit.parts.ParameterEditPart;
import org.ros.model.ros.diagram.edit.parts.PublisherEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceClientEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceServerEditPart;
import org.ros.model.ros.diagram.edit.parts.SubscriberEditPart;
import org.ros.model.ros.diagram.edit.parts.TopicEditPart;
import org.ros.model.ros.diagram.providers.RosElementTypes;

/**
 * @generated
 */
public class RosDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<RosNodeDescriptor> getSemanticChildren(View view) {
		switch (RosVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		case NodeParametersEditPart.VISUAL_ID:
			return getNodeParameters_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosNodeDescriptor> getPackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) view.getElement();
		LinkedList<RosNodeDescriptor> result = new LinkedList<RosNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNode().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = RosVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == NodeEditPart.VISUAL_ID) {
				result.add(new RosNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Topic childElement = modelElement.getTopic();
			int visualID = RosVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TopicEditPart.VISUAL_ID) {
				result.add(new RosNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getService().iterator(); it
				.hasNext();) {
			Service childElement = (Service) it.next();
			int visualID = RosVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ServiceEditPart.VISUAL_ID) {
				result.add(new RosNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosNodeDescriptor> getNodeParameters_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Node modelElement = (Node) containerView.getElement();
		LinkedList<RosNodeDescriptor> result = new LinkedList<RosNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameter().iterator(); it
				.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = RosVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new RosNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getContainedLinks(View view) {
		switch (RosVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2001ContainedLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_2002ContainedLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2003ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001ContainedLinks(view);
		case ServiceClientEditPart.VISUAL_ID:
			return getServiceClient_4001ContainedLinks(view);
		case SubscriberEditPart.VISUAL_ID:
			return getSubscriber_4002ContainedLinks(view);
		case ServiceServerEditPart.VISUAL_ID:
			return getServiceServer_4003ContainedLinks(view);
		case PublisherEditPart.VISUAL_ID:
			return getPublisher_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getIncomingLinks(View view) {
		switch (RosVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_2001IncomingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_2002IncomingLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2003IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001IncomingLinks(view);
		case ServiceClientEditPart.VISUAL_ID:
			return getServiceClient_4001IncomingLinks(view);
		case SubscriberEditPart.VISUAL_ID:
			return getSubscriber_4002IncomingLinks(view);
		case ServiceServerEditPart.VISUAL_ID:
			return getServiceServer_4003IncomingLinks(view);
		case PublisherEditPart.VISUAL_ID:
			return getPublisher_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getOutgoingLinks(View view) {
		switch (RosVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_2001OutgoingLinks(view);
		case TopicEditPart.VISUAL_ID:
			return getTopic_2002OutgoingLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2003OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001OutgoingLinks(view);
		case ServiceClientEditPart.VISUAL_ID:
			return getServiceClient_4001OutgoingLinks(view);
		case SubscriberEditPart.VISUAL_ID:
			return getSubscriber_4002OutgoingLinks(view);
		case ServiceServerEditPart.VISUAL_ID:
			return getServiceServer_4003OutgoingLinks(view);
		case PublisherEditPart.VISUAL_ID:
			return getPublisher_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getPackage_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getNode_2001ContainedLinks(View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ServiceClient_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Subscriber_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ServiceServer_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Publisher_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getTopic_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getService_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getParameter_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getServiceClient_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getSubscriber_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getServiceServer_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getPublisher_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getNode_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getTopic_2002IncomingLinks(View view) {
		Topic modelElement = (Topic) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Subscriber_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Publisher_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getService_2003IncomingLinks(View view) {
		Service modelElement = (Service) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ServiceClient_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ServiceServer_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getParameter_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getServiceClient_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getSubscriber_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getServiceServer_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getPublisher_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getNode_2001OutgoingLinks(View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ServiceClient_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Subscriber_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ServiceServer_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Publisher_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getTopic_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getService_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getParameter_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getServiceClient_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getSubscriber_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getServiceServer_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RosLinkDescriptor> getPublisher_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RosLinkDescriptor> getContainedTypeModelFacetLinks_ServiceClient_4001(
			Node container) {
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		for (Iterator<?> links = container.getServiceClient().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ServiceClient) {
				continue;
			}
			ServiceClient link = (ServiceClient) linkObject;
			if (ServiceClientEditPart.VISUAL_ID != RosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Service dst = link.getService();
			result.add(new RosLinkDescriptor(container, dst, link,
					RosElementTypes.ServiceClient_4001,
					ServiceClientEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosLinkDescriptor> getContainedTypeModelFacetLinks_Subscriber_4002(
			Node container) {
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		for (Iterator<?> links = container.getSubscriber().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Subscriber) {
				continue;
			}
			Subscriber link = (Subscriber) linkObject;
			if (SubscriberEditPart.VISUAL_ID != RosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Topic dst = link.getTopic();
			result.add(new RosLinkDescriptor(container, dst, link,
					RosElementTypes.Subscriber_4002,
					SubscriberEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosLinkDescriptor> getContainedTypeModelFacetLinks_ServiceServer_4003(
			Node container) {
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		for (Iterator<?> links = container.getServiceServer().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ServiceServer) {
				continue;
			}
			ServiceServer link = (ServiceServer) linkObject;
			if (ServiceServerEditPart.VISUAL_ID != RosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Service dst = link.getService();
			result.add(new RosLinkDescriptor(container, dst, link,
					RosElementTypes.ServiceServer_4003,
					ServiceServerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosLinkDescriptor> getContainedTypeModelFacetLinks_Publisher_4004(
			Node container) {
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		for (Iterator<?> links = container.getPublisher().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Publisher) {
				continue;
			}
			Publisher link = (Publisher) linkObject;
			if (PublisherEditPart.VISUAL_ID != RosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Topic dst = link.getTopic();
			result.add(new RosLinkDescriptor(container, dst, link,
					RosElementTypes.Publisher_4004, PublisherEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosLinkDescriptor> getIncomingTypeModelFacetLinks_ServiceClient_4001(
			Service target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RosPackage.eINSTANCE
					.getServiceClient_Service()
					|| false == setting.getEObject() instanceof ServiceClient) {
				continue;
			}
			ServiceClient link = (ServiceClient) setting.getEObject();
			if (ServiceClientEditPart.VISUAL_ID != RosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Node) {
				continue;
			}
			Node container = (Node) link.eContainer();
			result.add(new RosLinkDescriptor(container, target, link,
					RosElementTypes.ServiceClient_4001,
					ServiceClientEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosLinkDescriptor> getIncomingTypeModelFacetLinks_Subscriber_4002(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RosPackage.eINSTANCE
					.getSubscriber_Topic()
					|| false == setting.getEObject() instanceof Subscriber) {
				continue;
			}
			Subscriber link = (Subscriber) setting.getEObject();
			if (SubscriberEditPart.VISUAL_ID != RosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Node) {
				continue;
			}
			Node container = (Node) link.eContainer();
			result.add(new RosLinkDescriptor(container, target, link,
					RosElementTypes.Subscriber_4002,
					SubscriberEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosLinkDescriptor> getIncomingTypeModelFacetLinks_ServiceServer_4003(
			Service target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RosPackage.eINSTANCE
					.getServiceServer_Service()
					|| false == setting.getEObject() instanceof ServiceServer) {
				continue;
			}
			ServiceServer link = (ServiceServer) setting.getEObject();
			if (ServiceServerEditPart.VISUAL_ID != RosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Node) {
				continue;
			}
			Node container = (Node) link.eContainer();
			result.add(new RosLinkDescriptor(container, target, link,
					RosElementTypes.ServiceServer_4003,
					ServiceServerEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RosLinkDescriptor> getIncomingTypeModelFacetLinks_Publisher_4004(
			Topic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RosLinkDescriptor> result = new LinkedList<RosLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RosPackage.eINSTANCE
					.getPublisher_Topic()
					|| false == setting.getEObject() instanceof Publisher) {
				continue;
			}
			Publisher link = (Publisher) setting.getEObject();
			if (PublisherEditPart.VISUAL_ID != RosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Node) {
				continue;
			}
			Node container = (Node) link.eContainer();
			result.add(new RosLinkDescriptor(container, target, link,
					RosElementTypes.Publisher_4004, PublisherEditPart.VISUAL_ID));

		}
		return result;
	}

}
