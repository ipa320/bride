package org.best_of_robotics.model.bcm.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class BcmParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser componentName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5004Parser() {
		if (componentName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.bcm.BcmPackage.eINSTANCE
					.getComponent_Name() };
			org.best_of_robotics.model.bcm.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.bcm.diagram.parsers.MessageFormatParser(
					features);
			componentName_5004Parser = parser;
		}
		return componentName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser portName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPortName_5001Parser() {
		if (portName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.bcm.BcmPackage.eINSTANCE
					.getPort_Name() };
			org.best_of_robotics.model.bcm.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.bcm.diagram.parsers.MessageFormatParser(
					features);
			portName_5001Parser = parser;
		}
		return portName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser portType_5002Parser;

	/**
	 * @generated
	 */
	private IParser getPortType_5002Parser() {
		if (portType_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.bcm.BcmPackage.eINSTANCE
					.getPort_Type() };
			org.best_of_robotics.model.bcm.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.bcm.diagram.parsers.MessageFormatParser(
					features);
			portType_5002Parser = parser;
		}
		return portType_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionName_6001Parser() {
		if (connectionName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { org.best_of_robotics.model.bcm.BcmPackage.eINSTANCE
					.getConnection_Name() };
			org.best_of_robotics.model.bcm.diagram.parsers.MessageFormatParser parser = new org.best_of_robotics.model.bcm.diagram.parsers.MessageFormatParser(
					features);
			connectionName_6001Parser = parser;
		}
		return connectionName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5004Parser();
		case org.best_of_robotics.model.bcm.diagram.edit.parts.PortNameEditPart.VISUAL_ID:
			return getPortName_5001Parser();
		case org.best_of_robotics.model.bcm.diagram.edit.parts.PortTypeEditPart.VISUAL_ID:
			return getPortType_5002Parser();
		case org.best_of_robotics.model.bcm.diagram.edit.parts.ConnectionNameEditPart.VISUAL_ID:
			return getConnectionName_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
