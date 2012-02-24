package org.best_of_robotics.model.orocos.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class OrocosEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getVisualID(view)) {

			case org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.PackageEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextNameEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextNameEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextNamespaceEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextNamespaceEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextTypeEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextTypeEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityNameEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.ActivityNameEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortNameEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.OutputPortNameEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortNameEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortNameEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortTypeEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.InputPortTypeEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyNameEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.PropertyNameEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.OperationEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextPropertiesEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextPropertiesEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextOperationsEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.TaskContextOperationsEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyNameEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.ConnectionPolicyNameEditPart(
						view);

			case org.best_of_robotics.model.orocos.diagram.edit.parts.IActivityTaskContextEditPart.VISUAL_ID:
				return new org.best_of_robotics.model.orocos.diagram.edit.parts.IActivityTaskContextEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
