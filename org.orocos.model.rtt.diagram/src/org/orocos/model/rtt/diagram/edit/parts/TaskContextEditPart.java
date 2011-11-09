package org.orocos.model.rtt.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.orocos.model.rtt.diagram.edit.policies.TaskContextCanonicalEditPolicy;
import org.orocos.model.rtt.diagram.edit.policies.TaskContextItemSemanticEditPolicy;
import org.orocos.model.rtt.diagram.part.RttVisualIDRegistry;
import org.orocos.model.rtt.diagram.providers.RttElementTypes;

/**
 * @generated
 */
public class TaskContextEditPart extends AbstractBorderedShapeEditPart {

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
	public TaskContextEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TaskContextItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new TaskContextCanonicalEditPolicy());
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
				switch (RttVisualIDRegistry.getVisualID(childView)) {
				case OutputPortEditPart.VISUAL_ID:
				case InputPortEditPart.VISUAL_ID:
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
		return primaryShape = new RoundedTaskContextFigure();
	}

	/**
	 * @generated
	 */
	public RoundedTaskContextFigure getPrimaryShape() {
		return (RoundedTaskContextFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TaskContextNameEditPart) {
			((TaskContextNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTaskContextNameFigure());
			return true;
		}
		if (childEditPart instanceof TaskContextNamespaceEditPart) {
			((TaskContextNamespaceEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTaskContextNamespaceFigure());
			return true;
		}
		if (childEditPart instanceof TaskContextTypeEditPart) {
			((TaskContextTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTaskContextTypeFigure());
			return true;
		}
		if (childEditPart instanceof TaskContextPropertiesEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePropertyCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((TaskContextPropertiesEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof TaskContextOperationsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureOperationCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((TaskContextOperationsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof OutputPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((OutputPortEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof InputPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(
					((InputPortEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TaskContextNameEditPart) {
			return true;
		}
		if (childEditPart instanceof TaskContextNamespaceEditPart) {
			return true;
		}
		if (childEditPart instanceof TaskContextTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof TaskContextPropertiesEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePropertyCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((TaskContextPropertiesEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof TaskContextOperationsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureOperationCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((TaskContextOperationsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof OutputPortEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((OutputPortEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InputPortEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((InputPortEditPart) childEditPart).getFigure());
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
		if (editPart instanceof TaskContextPropertiesEditPart) {
			return getPrimaryShape().getFigurePropertyCompartmentFigure();
		}
		if (editPart instanceof TaskContextOperationsEditPart) {
			return getPrimaryShape().getFigureOperationCompartmentFigure();
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
		return getChildBySemanticHint(RttVisualIDRegistry
				.getType(TaskContextNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RttElementTypes.IActivityTaskContext_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == RttElementTypes.IActivityTaskContext_4002) {
			types.add(RttElementTypes.Activity_2002);
			types.add(RttElementTypes.Slave_3004);
		}
		return types;
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
			if (type == RttElementTypes.Property_3003) {
				return getChildBySemanticHint(RttVisualIDRegistry
						.getType(TaskContextPropertiesEditPart.VISUAL_ID));
			}
			if (type == RttElementTypes.Operation_3005) {
				return getChildBySemanticHint(RttVisualIDRegistry
						.getType(TaskContextOperationsEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class RoundedTaskContextFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fFigurePropertyCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureOperationCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureTaskContextTopFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTaskContextNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTaskContextNamespaceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTaskContextTypeFigure;

		/**
		 * @generated
		 */
		public RoundedTaskContextFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setLineWidth(2);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTaskContextTopFigure = new RectangleFigure();
			fFigureTaskContextTopFigure
					.setBackgroundColor(FFIGURETASKCONTEXTTOPFIGURE_BACK);

			fFigureTaskContextTopFigure.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));

			GridData constraintFFigureTaskContextTopFigure = new GridData();
			constraintFFigureTaskContextTopFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureTaskContextTopFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureTaskContextTopFigure.horizontalIndent = 0;
			constraintFFigureTaskContextTopFigure.horizontalSpan = 1;
			constraintFFigureTaskContextTopFigure.verticalSpan = 1;
			constraintFFigureTaskContextTopFigure.grabExcessHorizontalSpace = true;
			constraintFFigureTaskContextTopFigure.grabExcessVerticalSpace = false;
			this.add(fFigureTaskContextTopFigure,
					constraintFFigureTaskContextTopFigure);

			GridLayout layoutFFigureTaskContextTopFigure = new GridLayout();
			layoutFFigureTaskContextTopFigure.numColumns = 3;
			layoutFFigureTaskContextTopFigure.makeColumnsEqualWidth = false;
			fFigureTaskContextTopFigure
					.setLayoutManager(layoutFFigureTaskContextTopFigure);

			fFigureTaskContextNameFigure = new WrappingLabel();
			fFigureTaskContextNameFigure.setText("<...>");

			fFigureTaskContextNameFigure
					.setFont(FFIGURETASKCONTEXTNAMEFIGURE_FONT);

			GridData constraintFFigureTaskContextNameFigure = new GridData();
			constraintFFigureTaskContextNameFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureTaskContextNameFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureTaskContextNameFigure.horizontalIndent = 0;
			constraintFFigureTaskContextNameFigure.horizontalSpan = 3;
			constraintFFigureTaskContextNameFigure.verticalSpan = 1;
			constraintFFigureTaskContextNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureTaskContextNameFigure.grabExcessVerticalSpace = false;
			fFigureTaskContextTopFigure.add(fFigureTaskContextNameFigure,
					constraintFFigureTaskContextNameFigure);

			fFigureTaskContextNamespaceFigure = new WrappingLabel();
			fFigureTaskContextNamespaceFigure.setText("<...>");

			fFigureTaskContextNamespaceFigure
					.setFont(FFIGURETASKCONTEXTNAMESPACEFIGURE_FONT);

			GridData constraintFFigureTaskContextNamespaceFigure = new GridData();
			constraintFFigureTaskContextNamespaceFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureTaskContextNamespaceFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureTaskContextNamespaceFigure.horizontalIndent = 0;
			constraintFFigureTaskContextNamespaceFigure.horizontalSpan = 1;
			constraintFFigureTaskContextNamespaceFigure.verticalSpan = 1;
			constraintFFigureTaskContextNamespaceFigure.grabExcessHorizontalSpace = false;
			constraintFFigureTaskContextNamespaceFigure.grabExcessVerticalSpace = false;
			fFigureTaskContextTopFigure.add(fFigureTaskContextNamespaceFigure,
					constraintFFigureTaskContextNamespaceFigure);

			WrappingLabel doubleColon1 = new WrappingLabel();
			doubleColon1.setText("::");

			doubleColon1.setFont(DOUBLECOLON1_FONT);

			GridData constraintDoubleColon1 = new GridData();
			constraintDoubleColon1.verticalAlignment = GridData.BEGINNING;
			constraintDoubleColon1.horizontalAlignment = GridData.BEGINNING;
			constraintDoubleColon1.horizontalIndent = 0;
			constraintDoubleColon1.horizontalSpan = 1;
			constraintDoubleColon1.verticalSpan = 1;
			constraintDoubleColon1.grabExcessHorizontalSpace = false;
			constraintDoubleColon1.grabExcessVerticalSpace = false;
			fFigureTaskContextTopFigure.add(doubleColon1,
					constraintDoubleColon1);

			fFigureTaskContextTypeFigure = new WrappingLabel();
			fFigureTaskContextTypeFigure.setText("<...>");

			GridData constraintFFigureTaskContextTypeFigure = new GridData();
			constraintFFigureTaskContextTypeFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureTaskContextTypeFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureTaskContextTypeFigure.horizontalIndent = 0;
			constraintFFigureTaskContextTypeFigure.horizontalSpan = 1;
			constraintFFigureTaskContextTypeFigure.verticalSpan = 1;
			constraintFFigureTaskContextTypeFigure.grabExcessHorizontalSpace = false;
			constraintFFigureTaskContextTypeFigure.grabExcessVerticalSpace = false;
			fFigureTaskContextTopFigure.add(fFigureTaskContextTypeFigure,
					constraintFFigureTaskContextTypeFigure);

			fFigurePropertyCompartmentFigure = new RectangleFigure();
			fFigurePropertyCompartmentFigure.setFill(false);

			GridData constraintFFigurePropertyCompartmentFigure = new GridData();
			constraintFFigurePropertyCompartmentFigure.verticalAlignment = GridData.FILL;
			constraintFFigurePropertyCompartmentFigure.horizontalAlignment = GridData.FILL;
			constraintFFigurePropertyCompartmentFigure.horizontalIndent = 0;
			constraintFFigurePropertyCompartmentFigure.horizontalSpan = 1;
			constraintFFigurePropertyCompartmentFigure.verticalSpan = 1;
			constraintFFigurePropertyCompartmentFigure.grabExcessHorizontalSpace = true;
			constraintFFigurePropertyCompartmentFigure.grabExcessVerticalSpace = true;
			this.add(fFigurePropertyCompartmentFigure,
					constraintFFigurePropertyCompartmentFigure);

			fFigurePropertyCompartmentFigure
					.setLayoutManager(new StackLayout());

			fFigureOperationCompartmentFigure = new RectangleFigure();
			fFigureOperationCompartmentFigure.setFill(false);

			GridData constraintFFigureOperationCompartmentFigure = new GridData();
			constraintFFigureOperationCompartmentFigure.verticalAlignment = GridData.FILL;
			constraintFFigureOperationCompartmentFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureOperationCompartmentFigure.horizontalIndent = 0;
			constraintFFigureOperationCompartmentFigure.horizontalSpan = 1;
			constraintFFigureOperationCompartmentFigure.verticalSpan = 1;
			constraintFFigureOperationCompartmentFigure.grabExcessHorizontalSpace = true;
			constraintFFigureOperationCompartmentFigure.grabExcessVerticalSpace = true;
			this.add(fFigureOperationCompartmentFigure,
					constraintFFigureOperationCompartmentFigure);

			fFigureOperationCompartmentFigure
					.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigurePropertyCompartmentFigure() {
			return fFigurePropertyCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureOperationCompartmentFigure() {
			return fFigureOperationCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureTaskContextTopFigure() {
			return fFigureTaskContextTopFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTaskContextNameFigure() {
			return fFigureTaskContextNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTaskContextNamespaceFigure() {
			return fFigureTaskContextNamespaceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTaskContextTypeFigure() {
			return fFigureTaskContextTypeFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color FFIGURETASKCONTEXTTOPFIGURE_BACK = new Color(null, 236,
			232, 233);

	/**
	 * @generated
	 */
	static final Font FFIGURETASKCONTEXTNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Font FFIGURETASKCONTEXTNAMESPACEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.ITALIC);

	/**
	 * @generated
	 */
	static final Font DOUBLECOLON1_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(),
			10, SWT.BOLD);

}
