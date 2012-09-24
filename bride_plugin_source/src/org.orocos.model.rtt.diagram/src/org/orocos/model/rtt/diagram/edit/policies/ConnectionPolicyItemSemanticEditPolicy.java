package org.orocos.model.rtt.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.orocos.model.rtt.diagram.providers.RttElementTypes;

/**
 * @generated
 */
public class ConnectionPolicyItemSemanticEditPolicy extends
		RttBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionPolicyItemSemanticEditPolicy() {
		super(RttElementTypes.ConnectionPolicy_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
