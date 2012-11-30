package org.orocos.model.rtt.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.orocos.model.rtt.diagram.providers.RttElementTypes;

/**
 * @generated
 */
public class IActivityTaskContextItemSemanticEditPolicy extends
		RttBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IActivityTaskContextItemSemanticEditPolicy() {
		super(RttElementTypes.IActivityTaskContext_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
