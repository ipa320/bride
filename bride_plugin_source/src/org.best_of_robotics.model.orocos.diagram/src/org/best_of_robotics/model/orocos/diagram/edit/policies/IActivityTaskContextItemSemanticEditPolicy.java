package org.best_of_robotics.model.orocos.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class IActivityTaskContextItemSemanticEditPolicy
		extends
		org.best_of_robotics.model.orocos.diagram.edit.policies.OrocosBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IActivityTaskContextItemSemanticEditPolicy() {
		super(
				org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.IActivityTaskContext_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
