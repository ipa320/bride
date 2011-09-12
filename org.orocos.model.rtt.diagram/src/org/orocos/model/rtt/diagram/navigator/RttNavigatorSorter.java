package org.orocos.model.rtt.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.orocos.model.rtt.diagram.part.RttVisualIDRegistry;

/**
 * @generated
 */
public class RttNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RttNavigatorItem) {
			RttNavigatorItem item = (RttNavigatorItem) element;
			return RttVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
