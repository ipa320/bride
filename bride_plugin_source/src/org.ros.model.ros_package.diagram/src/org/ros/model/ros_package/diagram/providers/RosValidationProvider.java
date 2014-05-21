package org.ros.model.ros_package.diagram.providers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.ros.model.ros.ActionClient;
import org.ros.model.ros.ActionServer;
import org.ros.model.ros.Node;
import org.ros.model.ros.Parameter;
import org.ros.model.ros.Publisher;
import org.ros.model.ros.ServiceClient;
import org.ros.model.ros.ServiceServer;
import org.ros.model.ros.Subscriber;

/**
 * @generated
 */
public class RosValidationProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				org.ros.model.ros_package.diagram.part.RosDiagramEditorPlugin
						.getInstance().logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& org.ros.model.ros_package.diagram.edit.parts.PackageEditPart.MODEL_ID
							.equals(org.ros.model.ros_package.diagram.part.RosVisualIDRegistry
									.getModelID((View) object));
		}
		return true;
	}

	/**
	 * @generated
	 */
	public static class DefaultCtx implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			return isInDefaultEditorContext(object);
		}
	}

	/**
	 * @not generated
	 */
	public static class Adapter6 extends AbstractModelConstraint {

		/**
		 * @not generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Node context = (Node) ctx.getTarget();
			if (context.getName().matches("^[a-z|A-Z].*$"))
				return ctx.createSuccessStatus();
			else
				return ctx.createFailureStatus(context);
		}
	}

	/**
	 * @not generated
	 */
	public static class Adapter8 extends AbstractModelConstraint {

		/**
		 * @not generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Publisher context = (Publisher) ctx.getTarget();
			if (context.getName().matches("^[a-z|A-Z].*$"))
				return ctx.createSuccessStatus();
			else
				return ctx.createFailureStatus(context);
		}
	}

	/**
	 * @not generated
	 */
	public static class Adapter11 extends AbstractModelConstraint {

		/**
		 * @not generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Subscriber context = (Subscriber) ctx.getTarget();
			if (context.getName().matches("^[a-z|A-Z].*$"))
				return ctx.createSuccessStatus();
			else
				return ctx.createFailureStatus(context);
			
		}
	}

	/**
	 * @not generated
	 */
	public static class Adapter14 extends AbstractModelConstraint {

		/**
		 * @not generated
		 */
		public IStatus validate(IValidationContext ctx) {
			ServiceServer context = (ServiceServer) ctx.getTarget();
			if (context.getName().matches("^[a-z|A-Z].*$"))
				return ctx.createSuccessStatus();
			else
				return ctx.createFailureStatus(context);
			
		}
	}

	/**
	 * @not generated
	 */
	public static class Adapter17 extends AbstractModelConstraint {

		/**
		 * @not generated
		 */
		public IStatus validate(IValidationContext ctx) {
			ServiceClient context = (ServiceClient) ctx.getTarget();
			if (context.getName().matches("^[a-z|A-Z].*$"))
				return ctx.createSuccessStatus();
			else
				return ctx.createFailureStatus(context);
			
		}
	}

	/**
	 * @not generated
	 */
	public static class Adapter7 extends AbstractModelConstraint {

		/**
		 * @not generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Publisher context = (Publisher) ctx.getTarget();
			if (context.getName().matches("^[a-z|A-Z].*$"))
				return ctx.createSuccessStatus();
			else
				return ctx.createFailureStatus(context);

		}
	}

	/**
	 * @not generated
	 */
	public static class Adapter20 extends AbstractModelConstraint {

		/**
		 * @not generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Parameter context = (Parameter) ctx.getTarget();
			if (context.getType().getValue() == 4)
				return ctx.createSuccessStatus();
			else {
				if (context.getValue().length() > 0)
					return ctx.createSuccessStatus();
				else
					return ctx.createFailureStatus(context);
			}
		}
	}

	/**
	 * @not generated
	 */
	public static class Adapter23 extends AbstractModelConstraint {

		/**
		 * @not generated
		 */
		public IStatus validate(IValidationContext ctx) {
			ActionClient context = (ActionClient) ctx.getTarget();
			if (context.getName().matches("^[a-z|A-Z].*$"))
				return ctx.createSuccessStatus();
			else
				return ctx.createFailureStatus(context);
			
		}
	}

	/**
	 * @not generated
	 */
	public static class Adapter26 extends AbstractModelConstraint {

		/**
		 * @not generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Parameter context = (Parameter) ctx.getTarget();
			if (context.getName().matches("^[a-z|A-Z].*$"))
				return ctx.createSuccessStatus();
			else
				return ctx.createFailureStatus(context);
		}
	}

	/**
	 * @not generated
	 */
	public static class Adapter27 extends AbstractModelConstraint {

		/**
		 * @not generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Parameter context = (Parameter) ctx.getTarget();
			if (context.getName().matches("^[a-z|A-Z].*$"))
				return ctx.createSuccessStatus();
			else
				return ctx.createFailureStatus(context);

		}
	}

	/**
	 * @generated
	 */
	static String formatElement(EObject object) {
		return EMFCoreUtil.getQualifiedName(object, true);
	}

}
