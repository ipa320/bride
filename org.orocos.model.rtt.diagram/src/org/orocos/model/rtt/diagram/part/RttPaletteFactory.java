package org.orocos.model.rtt.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
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
		paletteContainer.add(createInputPort2CreationTool());
		paletteContainer.add(createOutputPort3CreationTool());
		paletteContainer.add(createConnectionPolicy4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createActivity6CreationTool());
		paletteContainer.add(createSlave7CreationTool());
		paletteContainer.add(createActivityTaskContext8CreationTool());
		paletteContainer.add(createProperty9CreationTool());
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
	private ToolEntry createInputPort2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputPort2CreationTool_title,
				Messages.InputPort2CreationTool_desc,
				Collections.singletonList(RttElementTypes.InputPort_3002));
		entry.setId("createInputPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.InputPort_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPort3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutputPort3CreationTool_title,
				Messages.OutputPort3CreationTool_desc,
				Collections.singletonList(RttElementTypes.OutputPort_3001));
		entry.setId("createOutputPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.OutputPort_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionPolicy4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionPolicy4CreationTool_title,
				Messages.ConnectionPolicy4CreationTool_desc,
				Collections
						.singletonList(RttElementTypes.ConnectionPolicy_4001));
		entry.setId("createConnectionPolicy4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.ConnectionPolicy_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Activity6CreationTool_title,
				Messages.Activity6CreationTool_desc,
				Collections.singletonList(RttElementTypes.Activity_2002));
		entry.setId("createActivity6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.Activity_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSlave7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Slave7CreationTool_title,
				Messages.Slave7CreationTool_desc,
				Collections.singletonList(RttElementTypes.Slave_3004));
		entry.setId("createSlave7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.Slave_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityTaskContext8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ActivityTaskContext8CreationTool_title,
				null,
				Collections
						.singletonList(RttElementTypes.IActivityTaskContext_4002));
		entry.setId("createActivityTaskContext8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.IActivityTaskContext_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Property9CreationTool_title,
				Messages.Property9CreationTool_desc,
				Collections.singletonList(RttElementTypes.Property_3003));
		entry.setId("createProperty9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RttElementTypes
				.getImageDescriptor(RttElementTypes.Property_3003));
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
