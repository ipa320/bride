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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.Cpf.Simple#getDescription <em>Description</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.Simple#getValue <em>Value</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.Simple#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.Simple#getDefaultvalue <em>Defaultvalue</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.Simple#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.Simple#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSimple()
 * @model extendedMetaData="name='simple' kind='elementOnly'"
 * @generated
 */
public interface Simple extends EObject {
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
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSimple_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.Simple#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSimple_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.Simple#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference.
	 * @see #setChoices(Choices)
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSimple_Choices()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='choices' namespace='##targetNamespace'"
	 * @generated
	 */
	Choices getChoices();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.Simple#getChoices <em>Choices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choices</em>' containment reference.
	 * @see #getChoices()
	 * @generated
	 */
	void setChoices(Choices value);

	/**
	 * Returns the value of the '<em><b>Defaultvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaultvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaultvalue</em>' containment reference.
	 * @see #setDefaultvalue(Defaultvalue)
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSimple_Defaultvalue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultvalue' namespace='##targetNamespace'"
	 * @generated
	 */
	Defaultvalue getDefaultvalue();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.Simple#getDefaultvalue <em>Defaultvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaultvalue</em>' containment reference.
	 * @see #getDefaultvalue()
	 * @generated
	 */
	void setDefaultvalue(Defaultvalue value);

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
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSimple_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.Simple#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.best_of_robotics.model.Cpf.SimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.best_of_robotics.model.Cpf.SimpleType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(SimpleType)
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getSimple_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleType getType();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.Simple#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.best_of_robotics.model.Cpf.SimpleType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(SimpleType value);

	/**
	 * Unsets the value of the '{@link org.best_of_robotics.model.Cpf.Simple#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(SimpleType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.best_of_robotics.model.Cpf.Simple#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(SimpleType)
	 * @generated
	 */
	boolean isSetType();

} // Simple
