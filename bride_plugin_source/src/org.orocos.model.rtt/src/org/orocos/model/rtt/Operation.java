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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.orocos.model.rtt.Operation#getName <em>Name</em>}</li>
 *   <li>{@link org.orocos.model.rtt.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.orocos.model.rtt.Operation#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.orocos.model.rtt.RttPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
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
	 * @see org.orocos.model.rtt.RttPackage#getOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.orocos.model.rtt.OperationReturnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see org.orocos.model.rtt.OperationReturnType
	 * @see #setReturnType(OperationReturnType)
	 * @see org.orocos.model.rtt.RttPackage#getOperation_ReturnType()
	 * @model
	 * @generated
	 */
	OperationReturnType getReturnType();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.Operation#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see org.orocos.model.rtt.OperationReturnType
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(OperationReturnType value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.orocos.model.rtt.RttPackage#getOperation_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.orocos.model.rtt.Operation#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

} // Operation
