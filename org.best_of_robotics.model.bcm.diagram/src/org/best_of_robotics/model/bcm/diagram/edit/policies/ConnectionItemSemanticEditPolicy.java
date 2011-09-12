package org.best_of_robotics.model.bcm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ConnectionItemSemanticEditPolicy
		extends
		org.best_of_robotics.model.bcm.diagram.edit.policies.BcmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionItemSemanticEditPolicy() {
		super(
				org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Connection_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
