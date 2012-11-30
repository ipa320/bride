package org.best_of_robotics.model.orocos.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class OrocosNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem) {
			org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem item = (org.best_of_robotics.model.orocos.diagram.navigator.OrocosNavigatorItem) element;
			return org.best_of_robotics.model.orocos.diagram.part.OrocosVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
