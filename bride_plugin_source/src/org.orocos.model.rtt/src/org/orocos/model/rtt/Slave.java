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
package org.orocos.model.rtt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.Slave#getMaster <em>Master</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orocos.model.rtt.RttPackage#getSlave()
 * @model
 * @generated
 */
public interface Slave extends IActivity {
	/**
	 * Returns the value of the '<em><b>Master</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.orocos.model.rtt.Activity#getSlave <em>Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master</em>' container reference.
	 * @see #setMaster(Activity)
	 * @see org.orocos.model.rtt.RttPackage#getSlave_Master()
	 * @see org.orocos.model.rtt.Activity#getSlave
	 * @model opposite="slave" transient="false"
	 * @generated
	 */
	Activity getMaster();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.Slave#getMaster <em>Master</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master</em>' container reference.
	 * @see #getMaster()
	 * @generated
	 */
	void setMaster(Activity value);

} // Slave
