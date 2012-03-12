package org.ros.model.ros.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.ros.model.ros.diagram.edit.commands.ParameterCreateCommand;
import org.ros.model.ros.diagram.providers.RosElementTypes;

/**
 * @generated
 */
public class NodeParametersItemSemanticEditPolicy extends
		RosBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodeParametersItemSemanticEditPolicy() {
		super(RosElementTypes.Node_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RosElementTypes.Parameter_3001 == req.getElementType()) {
			return getGEFWrapper(new ParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
