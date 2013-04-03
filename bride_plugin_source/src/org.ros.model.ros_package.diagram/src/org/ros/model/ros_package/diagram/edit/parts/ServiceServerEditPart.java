package org.ros.model.ros_package.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ServiceServerEditPart extends AbstractBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ServiceServerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new org.ros.model.ros_package.diagram.edit.policies.ServiceServerItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ServiceServerFigure();
	}

	/**
	 * @generated
	 */
	public ServiceServerFigure getPrimaryShape() {
		return (ServiceServerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.ServiceServerNameEditPart) {
			((org.ros.model.ros_package.diagram.edit.parts.ServiceServerNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureServiceServerNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.ServiceServerNameEditPart) {
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
		super.addChildVisual(childEditPart, -1);
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
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(80, 20);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(org.ros.model.ros_package.diagram.part.RosVisualIDRegistry
				.getType(org.ros.model.ros_package.diagram.edit.parts.ServiceServerNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ServiceServerFigure extends ScalablePolygonShape {
		public static final int BLUR_SHADOW_WIDTH = 5;

		@Override
		public void paintFigure(Graphics graphics) {
			drawBlurredShadow(graphics);
			super.paintFigure(graphics);
		}

		private void drawBlurredShadow(Graphics graphics) {
			// draw the shadow...
			graphics.pushState();

			int size = MapModeUtil.getMapMode(this).DPtoLP(BLUR_SHADOW_WIDTH);
			int step = MapModeUtil.getMapMode(this).DPtoLP(-1);

			graphics.setForegroundColor(ColorConstants.gray);
			graphics.setLineWidth(MapModeUtil.getMapMode(this).DPtoLP(2));
			graphics.translate(size, size);
			graphics.setClip(graphics.getClip(new Rectangle(getBounds()))
					.expand(size, size));
			graphics.setAlpha(20);
			outlineShape(graphics);
			graphics.translate(step, step);
			graphics.setAlpha(30);
			outlineShape(graphics);
			graphics.translate(step, step);
			graphics.setAlpha(60);
			outlineShape(graphics);
			graphics.translate(step, step);
			graphics.setAlpha(100);
			outlineShape(graphics);
			graphics.translate(step, step);
			graphics.setAlpha(150);
			outlineShape(graphics);

			graphics.popState();
		}
		/**
		 * @generated
		 */
		private WrappingLabel fFigureServiceServerNameFigure;

		/**
		 * @generated
		 */
		public ServiceServerFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(false);

			this.setLayoutManager(layoutThis);

			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(30), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode()
					.DPtoLP(20)));
			this.addPoint(new Point(getMapMode().DPtoLP(30), getMapMode()
					.DPtoLP(40)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(40)));
			this.setFill(true);
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(80),
					getMapMode().DPtoLP(20)));

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureServiceServerNameFigure = new WrappingLabel();

			fFigureServiceServerNameFigure.setText("<...>");

			this.add(fFigureServiceServerNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureServiceServerNameFigure() {
			return fFigureServiceServerNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 150, 150, 0);

}
