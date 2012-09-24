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
package org.best_of_robotics.model.Cpf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.Cpf.Sequence#getDescription <em>Description</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.Sequence#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.Sequence#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.Sequence#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.Sequence#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.Sequence#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSequence()
 * @model extendedMetaData="name='sequence' kind='elementOnly'"
 * @generated
 */
public interface Sequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSequence_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.Sequence#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.Cpf.Simple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' containment reference list.
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSequence_Simple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simple' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Simple> getSimple();

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.Cpf.Struct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference list.
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSequence_Struct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Struct> getStruct();

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.Cpf.Sequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference list.
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSequence_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Sequence> getSequence();

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
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSequence_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.Sequence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSequence_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.Sequence#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Sequence
