package org.ros.model.ros_package.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class NodeEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public NodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						org.ros.model.ros_package.diagram.part.RosVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new org.ros.model.ros_package.diagram.edit.policies.NodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new org.ros.model.ros_package.diagram.edit.policies.NodeCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (org.ros.model.ros_package.diagram.part.RosVisualIDRegistry
						.getVisualID(childView)) {
				case org.ros.model.ros_package.diagram.edit.parts.ServiceServerEditPart.VISUAL_ID:
				case org.ros.model.ros_package.diagram.edit.parts.ServiceClientEditPart.VISUAL_ID:
				case org.ros.model.ros_package.diagram.edit.parts.PublisherEditPart.VISUAL_ID:
				case org.ros.model.ros_package.diagram.edit.parts.ActionServerEditPart.VISUAL_ID:
				case org.ros.model.ros_package.diagram.edit.parts.ActionClientEditPart.VISUAL_ID:
				case org.ros.model.ros_package.diagram.edit.parts.SubscriberEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
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
		return primaryShape = new NodeFigure2();
	}

	/**
	 * @generated
	 */
	public NodeFigure2 getPrimaryShape() {
		return (NodeFigure2) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.NodeNameEditPart) {
			((org.ros.model.ros_package.diagram.edit.parts.NodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureNodeNameFigure());
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.NodeParametersEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureParameterCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((org.ros.model.ros_package.diagram.edit.parts.NodeParametersEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.ServiceServerEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((org.ros.model.ros_package.diagram.edit.parts.ServiceServerEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.ServiceClientEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((org.ros.model.ros_package.diagram.edit.parts.ServiceClientEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.PublisherEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((org.ros.model.ros_package.diagram.edit.parts.PublisherEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.ActionServerEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((org.ros.model.ros_package.diagram.edit.parts.ActionServerEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.ActionClientEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((org.ros.model.ros_package.diagram.edit.parts.ActionClientEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.SubscriberEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((org.ros.model.ros_package.diagram.edit.parts.SubscriberEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.NodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.NodeParametersEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureParameterCompartmentFigure();
			pane.remove(((org.ros.model.ros_package.diagram.edit.parts.NodeParametersEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.ServiceServerEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((org.ros.model.ros_package.diagram.edit.parts.ServiceServerEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.ServiceClientEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((org.ros.model.ros_package.diagram.edit.parts.ServiceClientEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.PublisherEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((org.ros.model.ros_package.diagram.edit.parts.PublisherEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.ActionServerEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((org.ros.model.ros_package.diagram.edit.parts.ActionServerEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.ActionClientEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((org.ros.model.ros_package.diagram.edit.parts.ActionClientEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof org.ros.model.ros_package.diagram.edit.parts.SubscriberEditPart) {
			getBorderedFigure()
					.getBorderItemContainer()
					.remove(((org.ros.model.ros_package.diagram.edit.parts.SubscriberEditPart) childEditPart)
							.getFigure());
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
		if (editPart instanceof org.ros.model.ros_package.diagram.edit.parts.NodeParametersEditPart) {
			return getPrimaryShape().getFigureParameterCompartmentFigure();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
	protected NodeFigure createMainFigure() {
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
				.getType(org.ros.model.ros_package.diagram.edit.parts.NodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == org.ros.model.ros_package.diagram.providers.RosElementTypes.Parameter_3001) {
				return getChildBySemanticHint(org.ros.model.ros_package.diagram.part.RosVisualIDRegistry
						.getType(org.ros.model.ros_package.diagram.edit.parts.NodeParametersEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class NodeFigure2 extends RoundedRectangle {

		public static final int BLUR_SHADOW_WIDTH = 5;

		/**
		 * This function fills a rounded rectangle with a vertical gradient. This
		 * implementation does not use the gradient mechanism based on background
		 * patterns since they do not work stable on all systems.
		 * 
		 * @param graphics
		 * @param bounds
		 * @param corner
		 * @param c1
		 * @param c2
		 */
		public void fillVerticalGradientRoundedRectangle(Graphics graphics,
				Rectangle bounds, Dimension corner, Color c1, Color c2) {

			graphics.pushState();

			graphics.setForegroundColor(c2);
			graphics.setBackgroundColor(c1);

			graphics.fillGradient(bounds.x, bounds.y + (corner.height >> 1),
					bounds.width, bounds.height - corner.height, true);

			Path p = new Path(null);
			p.addArc(bounds.x, bounds.y + bounds.height - corner.height - 1,
					corner.width, corner.height, 180, 90);
			p.addArc(bounds.x + bounds.width - corner.width - 1, bounds.y
					+ bounds.height - corner.height - 1, corner.width,
					corner.height, 270, 90);
			graphics.fillPath(p);
			p.dispose();

			p = new Path(null);
			graphics.setBackgroundColor(c2);
			p.addArc(bounds.x + bounds.width - corner.width - 1, bounds.y,
					corner.width, corner.height, 0, 90);
			p.addArc(bounds.x, bounds.y, corner.width, corner.height, 90, 90);
			graphics.fillPath(p);
			p.dispose();

			graphics.popState();
		}

		/**
		 * Calculates a mixed color from two colors by interpolating the rgb parts
		 * using a mix ratio.
		 * 
		 * @param baseColor
		 * @param mixinColor
		 * @param ratio
		 *            a value from 0 to 255 that defines the mix ratio. Using 0 will
		 *            return the base color and 255 the mixin color.
		 * @return
		 */
		public Color mixColor(Color baseColor, Color mixinColor, int ratio) {
			return new Color(baseColor.getDevice(), baseColor.getRed()
					+ (mixinColor.getRed() - baseColor.getRed()) * ratio / 255,
					baseColor.getGreen()
							+ (mixinColor.getGreen() - baseColor.getGreen())
							* ratio / 255, baseColor.getBlue()
							+ (mixinColor.getBlue() - baseColor.getBlue())
							* ratio / 255);
		}

		@Override
		public void paintFigure(Graphics graphics) {
			drawBlurredShadow(graphics);
			super.paintFigure(graphics);
		}

		/**
		 * Fill the shape with a vertical color gradient. The gradient mixes a white
		 * into the configured background color.
		 */
		@Override
		protected void fillShape(Graphics graphics) {
			Color c = mixColor(getBackgroundColor(), ColorConstants.white, 224);
			fillVerticalGradientRoundedRectangle(graphics, getBounds(),
					getCornerDimensions(), getBackgroundColor(), c);
			c.dispose();
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
		private WrappingLabel fFigureNodeNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureParameterCompartmentFigure;

		/**
		 * @generated
		 */
		public NodeFigure2() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setLineWidth(2);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(240),
					getMapMode().DPtoLP(180)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure nodeTopFigure0 = new RectangleFigure();

			nodeTopFigure0.setForegroundColor(NODETOPFIGURE0_FORE);

			nodeTopFigure0.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			GridData constraintNodeTopFigure0 = new GridData();
			constraintNodeTopFigure0.verticalAlignment = GridData.BEGINNING;
			constraintNodeTopFigure0.horizontalAlignment = GridData.FILL;
			constraintNodeTopFigure0.horizontalIndent = 0;
			constraintNodeTopFigure0.horizontalSpan = 1;
			constraintNodeTopFigure0.verticalSpan = 1;
			constraintNodeTopFigure0.grabExcessHorizontalSpace = true;
			constraintNodeTopFigure0.grabExcessVerticalSpace = false;
			this.add(nodeTopFigure0, constraintNodeTopFigure0);

			GridLayout layoutNodeTopFigure0 = new GridLayout();
			layoutNodeTopFigure0.numColumns = 1;
			layoutNodeTopFigure0.makeColumnsEqualWidth = true;
			nodeTopFigure0.setLayoutManager(layoutNodeTopFigure0);

			fFigureNodeNameFigure = new WrappingLabel();

			fFigureNodeNameFigure.setText("<...>");

			fFigureNodeNameFigure.setFont(FFIGURENODENAMEFIGURE_FONT);

			GridData constraintFFigureNodeNameFigure = new GridData();
			constraintFFigureNodeNameFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureNodeNameFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureNodeNameFigure.horizontalIndent = 0;
			constraintFFigureNodeNameFigure.horizontalSpan = 3;
			constraintFFigureNodeNameFigure.verticalSpan = 1;
			constraintFFigureNodeNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureNodeNameFigure.grabExcessVerticalSpace = false;
			nodeTopFigure0.add(fFigureNodeNameFigure,
					constraintFFigureNodeNameFigure);

			fFigureParameterCompartmentFigure = new RectangleFigure();

			fFigureParameterCompartmentFigure.setFill(false);

			GridData constraintFFigureParameterCompartmentFigure = new GridData();
			constraintFFigureParameterCompartmentFigure.verticalAlignment = GridData.FILL;
			constraintFFigureParameterCompartmentFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureParameterCompartmentFigure.horizontalIndent = 0;
			constraintFFigureParameterCompartmentFigure.horizontalSpan = 1;
			constraintFFigureParameterCompartmentFigure.verticalSpan = 1;
			constraintFFigureParameterCompartmentFigure.grabExcessHorizontalSpace = true;
			constraintFFigureParameterCompartmentFigure.grabExcessVerticalSpace = true;
			this.add(fFigureParameterCompartmentFigure,
					constraintFFigureParameterCompartmentFigure);

			fFigureParameterCompartmentFigure
					.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeNameFigure() {
			return fFigureNodeNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureParameterCompartmentFigure() {
			return fFigureParameterCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color NODETOPFIGURE0_FORE = new Color(null, 236, 232, 233);

	/**
	 * @generated
	 */
	static final Font FFIGURENODENAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.BOLD);

}
