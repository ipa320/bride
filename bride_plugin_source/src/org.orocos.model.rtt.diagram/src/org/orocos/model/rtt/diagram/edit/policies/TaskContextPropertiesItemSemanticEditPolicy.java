package org.orocos.model.rtt.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.orocos.model.rtt.diagram.edit.commands.PropertyCreateCommand;
import org.orocos.model.rtt.diagram.providers.RttElementTypes;

/**
 * @generated
 */
public class TaskContextPropertiesItemSemanticEditPolicy extends
		RttBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TaskContextPropertiesItemSemanticEditPolicy() {
		super(RttElementTypes.TaskContext_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RttElementTypes.Property_3003 == req.getElementType()) {
			return getGEFWrapper(new PropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
