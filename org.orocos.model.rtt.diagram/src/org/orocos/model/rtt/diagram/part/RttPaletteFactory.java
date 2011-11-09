package org.orocos.model.rtt.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.orocos.model.rtt.diagram.providers.RttElementTypes;

/**
 * @generated
 */
public class RttPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createRTT1Group());
	}

	/**
	 * Creates "RTT" palette tool group
	 * @generated
	 */
	private PaletteContainer createRTT1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.RTT1Group_title);
		paletteContainer.setId("createRTT1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.RTT1Group_desc);
		paletteContainer.add(createTaskContext1CreationTool());
		paletteContainer.add(createProperty2CreationTool());
		paletteContainer.add(createOperation3CreationTool());
		paletteContainer.add(createInputPort4CreationTool());
		paletteContainer.add(createOutputPort5CreationTool());
		paletteContainer.add(createConnectionPolicy6CreationTool());
		paletteContainer.add(createActivity7CreationTool());
		paletteContainer.add(createSlave8CreationTool());
		paletteContainer.add(createActivityTaskContext9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTaskContext1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TaskContext1CreationTool_title,
				Messages.TaskContext1CreationTool_desc,
				Collections.singletonList(RttElementTypes.TaskContext_2001));
		entry.setId("createTaskContext1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.TaskContext_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Property2CreationTool_title,
				Messages.Property2CreationTool_desc,
				Collections.singletonList(RttElementTypes.Property_3003));
		entry.setId("createProperty2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.Property_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation3CreationTool_title, null,
				Collections.singletonList(RttElementTypes.Operation_3005));
		entry.setId("createOperation3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.Operation_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputPort4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputPort4CreationTool_title,
				Messages.InputPort4CreationTool_desc,
				Collections.singletonList(RttElementTypes.InputPort_3002));
		entry.setId("createInputPort4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.InputPort_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPort5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutputPort5CreationTool_title,
				Messages.OutputPort5CreationTool_desc,
				Collections.singletonList(RttElementTypes.OutputPort_3001));
		entry.setId("createOutputPort5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.OutputPort_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionPolicy6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionPolicy6CreationTool_title,
				Messages.ConnectionPolicy6CreationTool_desc,
				Collections
						.singletonList(RttElementTypes.ConnectionPolicy_4001));
		entry.setId("createConnectionPolicy6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.ConnectionPolicy_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Activity7CreationTool_title,
				Messages.Activity7CreationTool_desc,
				Collections.singletonList(RttElementTypes.Activity_2002));
		entry.setId("createActivity7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.Activity_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSlave8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Slave8CreationTool_title,
				Messages.Slave8CreationTool_desc,
				Collections.singletonList(RttElementTypes.Slave_3004));
		entry.setId("createSlave8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.Slave_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityTaskContext9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ActivityTaskContext9CreationTool_title,
				null,
				Collections
						.singletonList(RttElementTypes.IActivityTaskContext_4002));
		entry.setId("createActivityTaskContext9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.IActivityTaskContext_4002));
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
