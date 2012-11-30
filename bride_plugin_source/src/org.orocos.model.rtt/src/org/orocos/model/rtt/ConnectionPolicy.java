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
 * A representation of the model object '<em><b>Connection Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.ConnectionPolicy#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link org.orocos.model.rtt.ConnectionPolicy#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link org.orocos.model.rtt.ConnectionPolicy#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.orocos.model.rtt.ConnectionPolicy#getName <em>Name</em>}</li>
 *   <li>{@link org.orocos.model.rtt.ConnectionPolicy#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link org.orocos.model.rtt.ConnectionPolicy#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orocos.model.rtt.RttPackage#getConnectionPolicy()
 * @model
 * @generated
 */
public interface ConnectionPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orocos.model.rtt.InputPort#getInputConnectionPolicy <em>Input Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' reference.
	 * @see #setInputPort(InputPort)
	 * @see org.orocos.model.rtt.RttPackage#getConnectionPolicy_InputPort()
	 * @see org.orocos.model.rtt.InputPort#getInputConnectionPolicy
	 * @model opposite="inputConnectionPolicy" required="true"
	 * @generated
	 */
	InputPort getInputPort();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.ConnectionPolicy#getInputPort <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(InputPort value);

	/**
	 * Returns the value of the '<em><b>Output Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orocos.model.rtt.OutputPort#getOutputConnectionPolicy <em>Output Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port</em>' reference.
	 * @see #setOutputPort(OutputPort)
	 * @see org.orocos.model.rtt.RttPackage#getConnectionPolicy_OutputPort()
	 * @see org.orocos.model.rtt.OutputPort#getOutputConnectionPolicy
	 * @model opposite="outputConnectionPolicy" required="true"
	 * @generated
	 */
	OutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.ConnectionPolicy#getOutputPort <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(OutputPort value);

	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(short)
	 * @see org.orocos.model.rtt.RttPackage#getConnectionPolicy_BufferSize()
	 * @model
	 * @generated
	 */
	short getBufferSize();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.ConnectionPolicy#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(short value);

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
	 * @see org.orocos.model.rtt.RttPackage#getConnectionPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.ConnectionPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lock Policy</b></em>' attribute.
	 * The default value is <code>"LOCK_FREE"</code>.
	 * The literals are from the enumeration {@link org.orocos.model.rtt.ConnectionPolicyLockPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Policy</em>' attribute.
	 * @see org.orocos.model.rtt.ConnectionPolicyLockPolicy
	 * @see #setLockPolicy(ConnectionPolicyLockPolicy)
	 * @see org.orocos.model.rtt.RttPackage#getConnectionPolicy_LockPolicy()
	 * @model default="LOCK_FREE"
	 * @generated
	 */
	ConnectionPolicyLockPolicy getLockPolicy();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.ConnectionPolicy#getLockPolicy <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Policy</em>' attribute.
	 * @see org.orocos.model.rtt.ConnectionPolicyLockPolicy
	 * @see #getLockPolicy()
	 * @generated
	 */
	void setLockPolicy(ConnectionPolicyLockPolicy value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"DATA"</code>.
	 * The literals are from the enumeration {@link org.orocos.model.rtt.ConnectionPolicyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.orocos.model.rtt.ConnectionPolicyType
	 * @see #setType(ConnectionPolicyType)
	 * @see org.orocos.model.rtt.RttPackage#getConnectionPolicy_Type()
	 * @model default="DATA"
	 * @generated
	 */
	ConnectionPolicyType getType();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.ConnectionPolicy#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.orocos.model.rtt.ConnectionPolicyType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectionPolicyType value);

} // ConnectionPolicy
