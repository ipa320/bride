package org.best_of_robotics.model.orocos.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ConnectionPolicyItemSemanticEditPolicy
		extends
		org.best_of_robotics.model.orocos.diagram.edit.policies.OrocosBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionPolicyItemSemanticEditPolicy() {
		super(
				org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.ConnectionPolicy_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
