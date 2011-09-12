package org.best_of_robotics.model.bcm.diagram.part;

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
public class BcmDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.bcm.diagram.edit.parts.BundleEditPart.VISUAL_ID:
			return getBundle_1000SemanticChildren(view);
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmNodeDescriptor> getBundle_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.best_of_robotics.model.bcm.Bundle modelElement = (org.best_of_robotics.model.bcm.Bundle) view
				.getElement();
		LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmNodeDescriptor> result = new LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponent().iterator(); it
				.hasNext();) {
			org.best_of_robotics.model.bcm.Component childElement = (org.best_of_robotics.model.bcm.Component) it
					.next();
			int visualID = org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.best_of_robotics.model.bcm.diagram.edit.parts.ComponentEditPart.VISUAL_ID) {
				result.add(new org.best_of_robotics.model.bcm.diagram.part.BcmNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmNodeDescriptor> getComponent_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		org.best_of_robotics.model.bcm.Component modelElement = (org.best_of_robotics.model.bcm.Component) view
				.getElement();
		LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmNodeDescriptor> result = new LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPort().iterator(); it.hasNext();) {
			org.best_of_robotics.model.bcm.Port childElement = (org.best_of_robotics.model.bcm.Port) it
					.next();
			int visualID = org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.best_of_robotics.model.bcm.diagram.edit.parts.PortEditPart.VISUAL_ID) {
				result.add(new org.best_of_robotics.model.bcm.diagram.part.BcmNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.bcm.diagram.edit.parts.BundleEditPart.VISUAL_ID:
			return getBundle_1000ContainedLinks(view);
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2002ContainedLinks(view);
		case org.best_of_robotics.model.bcm.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3001ContainedLinks(view);
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2002IncomingLinks(view);
		case org.best_of_robotics.model.bcm.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3001IncomingLinks(view);
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
				.getVisualID(view)) {
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2002OutgoingLinks(view);
		case org.best_of_robotics.model.bcm.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3001OutgoingLinks(view);
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getBundle_1000ContainedLinks(
			View view) {
		org.best_of_robotics.model.bcm.Bundle modelElement = (org.best_of_robotics.model.bcm.Bundle) view
				.getElement();
		LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getComponent_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getPort_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getComponent_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getPort_3001IncomingLinks(
			View view) {
		org.best_of_robotics.model.bcm.Port modelElement = (org.best_of_robotics.model.bcm.Port) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getConnection_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getComponent_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getPort_3001OutgoingLinks(
			View view) {
		org.best_of_robotics.model.bcm.Port modelElement = (org.best_of_robotics.model.bcm.Port) view
				.getElement();
		LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getContainedTypeModelFacetLinks_Connection_4001(
			org.best_of_robotics.model.bcm.Bundle container) {
		LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor>();
		for (Iterator<?> links = container.getConnection().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.best_of_robotics.model.bcm.Connection) {
				continue;
			}
			org.best_of_robotics.model.bcm.Connection link = (org.best_of_robotics.model.bcm.Connection) linkObject;
			if (org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			org.best_of_robotics.model.bcm.Port dst = link.getTarget();
			org.best_of_robotics.model.bcm.Port src = link.getSource();
			result.add(new org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor(
					src,
					dst,
					link,
					org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Connection_4001,
					org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_4001(
			org.best_of_robotics.model.bcm.Port target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != org.best_of_robotics.model.bcm.BcmPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof org.best_of_robotics.model.bcm.Connection) {
				continue;
			}
			org.best_of_robotics.model.bcm.Connection link = (org.best_of_robotics.model.bcm.Connection) setting
					.getEObject();
			if (org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			org.best_of_robotics.model.bcm.Port src = link.getSource();
			result.add(new org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor(
					src,
					target,
					link,
					org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Connection_4001,
					org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_4001(
			org.best_of_robotics.model.bcm.Port source) {
		org.best_of_robotics.model.bcm.Bundle container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof org.best_of_robotics.model.bcm.Bundle) {
				container = (org.best_of_robotics.model.bcm.Bundle) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor> result = new LinkedList<org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor>();
		for (Iterator<?> links = container.getConnection().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof org.best_of_robotics.model.bcm.Connection) {
				continue;
			}
			org.best_of_robotics.model.bcm.Connection link = (org.best_of_robotics.model.bcm.Connection) linkObject;
			if (org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			org.best_of_robotics.model.bcm.Port dst = link.getTarget();
			org.best_of_robotics.model.bcm.Port src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new org.best_of_robotics.model.bcm.diagram.part.BcmLinkDescriptor(
					src,
					dst,
					link,
					org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Connection_4001,
					org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

}
