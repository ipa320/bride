package org.best_of_robotics.model.orocos.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TaskContextPropertiesItemSemanticEditPolicy
		extends
		org.best_of_robotics.model.orocos.diagram.edit.policies.OrocosBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TaskContextPropertiesItemSemanticEditPolicy() {
		super(
				org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.TaskContext_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Property_3003 == req
				.getElementType()) {
			return getGEFWrapper(new org.best_of_robotics.model.orocos.diagram.edit.commands.PropertyCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
