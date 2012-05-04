package org.best_of_robotics.model.orocos.diagram.part;

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
public class OrocosPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createOrocos1Group());
	}

	/**
	 * Creates "orocos" palette tool group
	 * @generated
	 */
	private PaletteContainer createOrocos1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				org.best_of_robotics.model.orocos.diagram.part.Messages.Orocos1Group_title);
		paletteContainer.setId("createOrocos1Group"); //$NON-NLS-1$
		paletteContainer.add(createTaskContext1CreationTool());
		paletteContainer.add(createInputPort2CreationTool());
		paletteContainer.add(createOutputPort3CreationTool());
		paletteContainer.add(createConnectionPolicy4CreationTool());
		paletteContainer.add(createActivity5CreationTool());
		paletteContainer.add(createProperty6CreationTool());
		paletteContainer.add(createOperation7CreationTool());
		paletteContainer.add(createActivityTaskContext8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTaskContext1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.best_of_robotics.model.orocos.diagram.part.Messages.TaskContext1CreationTool_title,
				org.best_of_robotics.model.orocos.diagram.part.Messages.TaskContext1CreationTool_desc,
				Collections
						.singletonList(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.TaskContext_2001));
		entry.setId("createTaskContext1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes
				.getImageDescriptor(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.TaskContext_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputPort2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.best_of_robotics.model.orocos.diagram.part.Messages.InputPort2CreationTool_title,
				org.best_of_robotics.model.orocos.diagram.part.Messages.InputPort2CreationTool_desc,
				Collections
						.singletonList(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.InputPort_3002));
		entry.setId("createInputPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes
				.getImageDescriptor(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.InputPort_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPort3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.best_of_robotics.model.orocos.diagram.part.Messages.OutputPort3CreationTool_title,
				org.best_of_robotics.model.orocos.diagram.part.Messages.OutputPort3CreationTool_desc,
				Collections
						.singletonList(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.OutputPort_3001));
		entry.setId("createOutputPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes
				.getImageDescriptor(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.OutputPort_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionPolicy4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.best_of_robotics.model.orocos.diagram.part.Messages.ConnectionPolicy4CreationTool_title,
				org.best_of_robotics.model.orocos.diagram.part.Messages.ConnectionPolicy4CreationTool_desc,
				Collections
						.singletonList(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.ConnectionPolicy_4001));
		entry.setId("createConnectionPolicy4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes
				.getImageDescriptor(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.ConnectionPolicy_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.best_of_robotics.model.orocos.diagram.part.Messages.Activity5CreationTool_title,
				org.best_of_robotics.model.orocos.diagram.part.Messages.Activity5CreationTool_desc,
				Collections
						.singletonList(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Activity_2002));
		entry.setId("createActivity5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes
				.getImageDescriptor(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Activity_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.best_of_robotics.model.orocos.diagram.part.Messages.Property6CreationTool_title,
				org.best_of_robotics.model.orocos.diagram.part.Messages.Property6CreationTool_desc,
				Collections
						.singletonList(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Property_3003));
		entry.setId("createProperty6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes
				.getImageDescriptor(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Property_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.best_of_robotics.model.orocos.diagram.part.Messages.Operation7CreationTool_title,
				org.best_of_robotics.model.orocos.diagram.part.Messages.Operation7CreationTool_desc,
				Collections
						.singletonList(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Operation_3004));
		entry.setId("createOperation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes
				.getImageDescriptor(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.Operation_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityTaskContext8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.best_of_robotics.model.orocos.diagram.part.Messages.ActivityTaskContext8CreationTool_title,
				null,
				Collections
						.singletonList(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.IActivityTaskContext_4002));
		entry.setId("createActivityTaskContext8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes
				.getImageDescriptor(org.best_of_robotics.model.orocos.diagram.providers.OrocosElementTypes.IActivityTaskContext_4002));
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
