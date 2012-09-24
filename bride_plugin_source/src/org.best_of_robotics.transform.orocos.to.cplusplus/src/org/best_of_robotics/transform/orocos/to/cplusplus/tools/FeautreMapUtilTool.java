/**
 * Copyright (c) 2011 Katholieke Universiteit Leuven
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 * 
 *     Hugo A. Garica - initial API and implementation
 * and/or initial documentation.
 * 
 *     Herman Bruyninckx - Supervisor.
 */
package org.best_of_robotics.transform.orocos.to.cplusplus.tools;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.epsilon.eol.tools.AbstractTool;

public class FeautreMapUtilTool extends AbstractTool {
	
	public FeautreMapUtilTool() {
		
	}
	
	public void addText(FeatureMap featureMap, String text) {
		FeatureMapUtil.addText(featureMap, text);
	}

}
