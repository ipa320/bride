package org.ros.model.ros.diagram.part;

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
import org.ros.model.ros.diagram.providers.RosElementTypes;

/**
 * @generated
 */
public class RosPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createRos1Group());
	}

	/**
	 * Creates "ros" palette tool group
	 * @generated
	 */
	private PaletteContainer createRos1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Ros1Group_title);
		paletteContainer.setId("createRos1Group"); //$NON-NLS-1$
		paletteContainer.add(createNode1CreationTool());
		paletteContainer.add(createPublisher2CreationTool());
		paletteContainer.add(createSubscriber3CreationTool());
		paletteContainer.add(createTopic4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Node1CreationTool_title,
				Messages.Node1CreationTool_desc,
				Collections.singletonList(RosElementTypes.Node_2002));
		entry.setId("createNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosElementTypes
				.getImageDescriptor(RosElementTypes.Node_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPublisher2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Publisher2CreationTool_title,
				Messages.Publisher2CreationTool_desc,
				Collections.singletonList(RosElementTypes.Publisher_4002));
		entry.setId("createPublisher2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosElementTypes
				.getImageDescriptor(RosElementTypes.Publisher_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubscriber3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Subscriber3CreationTool_title,
				Messages.Subscriber3CreationTool_desc,
				Collections.singletonList(RosElementTypes.Subscriber_4001));
		entry.setId("createSubscriber3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosElementTypes
				.getImageDescriptor(RosElementTypes.Subscriber_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTopic4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Topic4CreationTool_title,
				Messages.Topic4CreationTool_desc,
				Collections.singletonList(RosElementTypes.Topic_2001));
		entry.setId("createTopic4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RosElementTypes
				.getImageDescriptor(RosElementTypes.Topic_2001));
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
