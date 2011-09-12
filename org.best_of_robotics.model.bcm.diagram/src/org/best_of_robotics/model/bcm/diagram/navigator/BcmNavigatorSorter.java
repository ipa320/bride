package org.best_of_robotics.model.bcm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class BcmNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorItem) {
			org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorItem item = (org.best_of_robotics.model.bcm.diagram.navigator.BcmNavigatorItem) element;
			return org.best_of_robotics.model.bcm.diagram.part.BcmVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
