package org.orocos.model.rtt.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.orocos.model.rtt.diagram.edit.commands.SlaveCreateCommand;
import org.orocos.model.rtt.diagram.providers.RttElementTypes;

/**
 * @generated
 */
public class ActivitySlaveCompartmentItemSemanticEditPolicy extends
		RttBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivitySlaveCompartmentItemSemanticEditPolicy() {
		super(RttElementTypes.Activity_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RttElementTypes.Slave_3003 == req.getElementType()) {
			return getGEFWrapper(new SlaveCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
