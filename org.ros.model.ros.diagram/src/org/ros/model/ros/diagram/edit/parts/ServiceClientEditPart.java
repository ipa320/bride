package org.ros.model.ros.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.ros.model.ros.diagram.edit.policies.ServiceClientItemSemanticEditPolicy;

/**
 * @generated
 */
public class ServiceClientEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public ServiceClientEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ServiceClientItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ServiceClientNameEditPart) {
			((ServiceClientNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureServiceClientNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ServiceClientNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ServiceClientFigure();
	}

	/**
	 * @generated
	 */
	public ServiceClientFigure getPrimaryShape() {
		return (ServiceClientFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ServiceClientFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureServiceClientNameFigure;

		/**
		 * @generated
		 */
		public ServiceClientFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureServiceClientNameFigure = new WrappingLabel();
			fFigureServiceClientNameFigure.setText("<...>");

			this.add(fFigureServiceClientNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureServiceClientNameFigure() {
			return fFigureServiceClientNameFigure;
		}

	}

}
