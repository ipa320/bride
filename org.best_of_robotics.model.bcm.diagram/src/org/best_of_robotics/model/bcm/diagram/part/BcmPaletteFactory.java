package org.best_of_robotics.model.bcm.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class BcmPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createBcm1Group());
	}

	/**
	 * Creates "bcm" palette tool group
	 * @generated
	 */
	private PaletteContainer createBcm1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				org.best_of_robotics.model.bcm.diagram.part.Messages.Bcm1Group_title);
		paletteContainer.setId("createBcm1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createConnection2CreationTool());
		paletteContainer.add(createPort3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.best_of_robotics.model.bcm.diagram.part.Messages.Component1CreationTool_title,
				org.best_of_robotics.model.bcm.diagram.part.Messages.Component1CreationTool_desc,
				Collections
						.singletonList(org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Component_2002));
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes
				.getImageDescriptor(org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Component_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.best_of_robotics.model.bcm.diagram.part.Messages.Connection2CreationTool_title,
				org.best_of_robotics.model.bcm.diagram.part.Messages.Connection2CreationTool_desc,
				Collections
						.singletonList(org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Connection_4001));
		entry.setId("createConnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes
				.getImageDescriptor(org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Connection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.best_of_robotics.model.bcm.diagram.part.Messages.Port3CreationTool_title,
				org.best_of_robotics.model.bcm.diagram.part.Messages.Port3CreationTool_desc,
				Collections
						.singletonList(org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Port_3001));
		entry.setId("createPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes
				.getImageDescriptor(org.best_of_robotics.model.bcm.diagram.providers.BcmElementTypes.Port_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
