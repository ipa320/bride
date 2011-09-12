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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.Package#getName <em>Name</em>}</li>
 *   <li>{@link org.orocos.model.rtt.Package#getTaskContext <em>Task Context</em>}</li>
 *   <li>{@link org.orocos.model.rtt.Package#getConnectionPolicy <em>Connection Policy</em>}</li>
 *   <li>{@link org.orocos.model.rtt.Package#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orocos.model.rtt.RttPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.orocos.model.rtt.RttPackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Task Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.orocos.model.rtt.TaskContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Context</em>' containment reference list.
	 * @see org.orocos.model.rtt.RttPackage#getPackage_TaskContext()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskContext> getTaskContext();

	/**
	 * Returns the value of the '<em><b>Connection Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.orocos.model.rtt.ConnectionPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Policy</em>' containment reference list.
	 * @see org.orocos.model.rtt.RttPackage#getPackage_ConnectionPolicy()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionPolicy> getConnectionPolicy();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.orocos.model.rtt.IActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see org.orocos.model.rtt.RttPackage#getPackage_Activity()
	 * @model containment="true"
	 * @generated
	 */
	EList<IActivity> getActivity();

} // Package
