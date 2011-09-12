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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.InputPort#getIsEventPort <em>Is Event Port</em>}</li>
 *   <li>{@link org.orocos.model.rtt.InputPort#getName <em>Name</em>}</li>
 *   <li>{@link org.orocos.model.rtt.InputPort#getType <em>Type</em>}</li>
 *   <li>{@link org.orocos.model.rtt.InputPort#getInputConnectionPolicy <em>Input Connection Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orocos.model.rtt.RttPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Event Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Event Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Event Port</em>' attribute.
	 * @see #setIsEventPort(Boolean)
	 * @see org.orocos.model.rtt.RttPackage#getInputPort_IsEventPort()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getIsEventPort();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.InputPort#getIsEventPort <em>Is Event Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Event Port</em>' attribute.
	 * @see #getIsEventPort()
	 * @generated
	 */
	void setIsEventPort(Boolean value);

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
	 * @see org.orocos.model.rtt.RttPackage#getInputPort_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.InputPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.orocos.model.rtt.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.orocos.model.rtt.PortType
	 * @see #setType(PortType)
	 * @see org.orocos.model.rtt.RttPackage#getInputPort_Type()
	 * @model required="true"
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.InputPort#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.orocos.model.rtt.PortType
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

	/**
	 * Returns the value of the '<em><b>Input Connection Policy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orocos.model.rtt.ConnectionPolicy#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Connection Policy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Connection Policy</em>' reference.
	 * @see #setInputConnectionPolicy(ConnectionPolicy)
	 * @see org.orocos.model.rtt.RttPackage#getInputPort_InputConnectionPolicy()
	 * @see org.orocos.model.rtt.ConnectionPolicy#getInputPort
	 * @model opposite="inputPort" required="true"
	 * @generated
	 */
	ConnectionPolicy getInputConnectionPolicy();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.InputPort#getInputConnectionPolicy <em>Input Connection Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Connection Policy</em>' reference.
	 * @see #getInputConnectionPolicy()
	 * @generated
	 */
	void setInputConnectionPolicy(ConnectionPolicy value);

} // InputPort
