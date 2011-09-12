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
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.OutputPort#getName <em>Name</em>}</li>
 *   <li>{@link org.orocos.model.rtt.OutputPort#getType <em>Type</em>}</li>
 *   <li>{@link org.orocos.model.rtt.OutputPort#getOutputConnectionPolicy <em>Output Connection Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orocos.model.rtt.RttPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends EObject {
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
	 * @see org.orocos.model.rtt.RttPackage#getOutputPort_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.OutputPort#getName <em>Name</em>}' attribute.
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
	 * @see org.orocos.model.rtt.RttPackage#getOutputPort_Type()
	 * @model required="true"
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.OutputPort#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.orocos.model.rtt.PortType
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

	/**
	 * Returns the value of the '<em><b>Output Connection Policy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orocos.model.rtt.ConnectionPolicy#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Connection Policy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Connection Policy</em>' reference.
	 * @see #setOutputConnectionPolicy(ConnectionPolicy)
	 * @see org.orocos.model.rtt.RttPackage#getOutputPort_OutputConnectionPolicy()
	 * @see org.orocos.model.rtt.ConnectionPolicy#getOutputPort
	 * @model opposite="outputPort" required="true"
	 * @generated
	 */
	ConnectionPolicy getOutputConnectionPolicy();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.OutputPort#getOutputConnectionPolicy <em>Output Connection Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Connection Policy</em>' reference.
	 * @see #getOutputConnectionPolicy()
	 * @generated
	 */
	void setOutputConnectionPolicy(ConnectionPolicy value);

} // OutputPort
