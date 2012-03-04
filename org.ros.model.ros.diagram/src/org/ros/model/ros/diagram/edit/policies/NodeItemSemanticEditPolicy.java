package org.ros.model.ros.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.ros.model.ros.diagram.edit.commands.PublisherCreateCommand;
import org.ros.model.ros.diagram.edit.commands.PublisherReorientCommand;
import org.ros.model.ros.diagram.edit.commands.ServiceClientCreateCommand;
import org.ros.model.ros.diagram.edit.commands.ServiceClientReorientCommand;
import org.ros.model.ros.diagram.edit.commands.ServiceServerCreateCommand;
import org.ros.model.ros.diagram.edit.commands.ServiceServerReorientCommand;
import org.ros.model.ros.diagram.edit.commands.SubscriberCreateCommand;
import org.ros.model.ros.diagram.edit.commands.SubscriberReorientCommand;
import org.ros.model.ros.diagram.edit.parts.NodeParametersEditPart;
import org.ros.model.ros.diagram.edit.parts.ParameterEditPart;
import org.ros.model.ros.diagram.edit.parts.PublisherEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceClientEditPart;
import org.ros.model.ros.diagram.edit.parts.ServiceServerEditPart;
import org.ros.model.ros.diagram.edit.parts.SubscriberEditPart;
import org.ros.model.ros.diagram.part.RosVisualIDRegistry;
import org.ros.model.ros.diagram.providers.RosElementTypes;

/**
 * @generated
 */
public class NodeItemSemanticEditPolicy extends RosBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodeItemSemanticEditPolicy() {
		super(RosElementTypes.Node_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (RosVisualIDRegistry.getVisualID(outgoingLink) == ServiceClientEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RosVisualIDRegistry.getVisualID(outgoingLink) == SubscriberEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RosVisualIDRegistry.getVisualID(outgoingLink) == ServiceServerEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RosVisualIDRegistry.getVisualID(outgoingLink) == PublisherEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (RosVisualIDRegistry.getVisualID(node)) {
			case NodeParametersEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (RosVisualIDRegistry.getVisualID(cnode)) {
					case ParameterEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RosElementTypes.ServiceClient_4001 == req.getElementType()) {
			return getGEFWrapper(new ServiceClientCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RosElementTypes.Subscriber_4002 == req.getElementType()) {
			return getGEFWrapper(new SubscriberCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RosElementTypes.ServiceServer_4003 == req.getElementType()) {
			return getGEFWrapper(new ServiceServerCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RosElementTypes.Publisher_4004 == req.getElementType()) {
			return getGEFWrapper(new PublisherCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RosElementTypes.ServiceClient_4001 == req.getElementType()) {
			return null;
		}
		if (RosElementTypes.Subscriber_4002 == req.getElementType()) {
			return null;
		}
		if (RosElementTypes.ServiceServer_4003 == req.getElementType()) {
			return null;
		}
		if (RosElementTypes.Publisher_4004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ServiceClientEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceClientReorientCommand(req));
		case SubscriberEditPart.VISUAL_ID:
			return getGEFWrapper(new SubscriberReorientCommand(req));
		case ServiceServerEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceServerReorientCommand(req));
		case PublisherEditPart.VISUAL_ID:
			return getGEFWrapper(new PublisherReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
