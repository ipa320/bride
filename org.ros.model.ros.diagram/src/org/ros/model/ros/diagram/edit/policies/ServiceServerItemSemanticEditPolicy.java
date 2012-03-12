package org.ros.model.ros.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.ros.model.ros.diagram.providers.RosElementTypes;

/**
 * @generated
 */
public class ServiceServerItemSemanticEditPolicy extends
		RosBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceServerItemSemanticEditPolicy() {
		super(RosElementTypes.ServiceServer_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
