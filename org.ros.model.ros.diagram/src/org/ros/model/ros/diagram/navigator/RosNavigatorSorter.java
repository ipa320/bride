package org.ros.model.ros.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.ros.model.ros.diagram.part.RosVisualIDRegistry;

/**
 * @generated
 */
public class RosNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RosNavigatorItem) {
			RosNavigatorItem item = (RosNavigatorItem) element;
			return RosVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
