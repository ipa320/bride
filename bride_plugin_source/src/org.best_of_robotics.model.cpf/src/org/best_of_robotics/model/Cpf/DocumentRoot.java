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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getDefaultvalue <em>Defaultvalue</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.best_of_robotics.model.Cpf.DocumentRoot#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference.
	 * @see #setChoice(Choice)
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_Choice()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace'"
	 * @generated
	 */
	Choice getChoice();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getChoice <em>Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice</em>' containment reference.
	 * @see #getChoice()
	 * @generated
	 */
	void setChoice(Choice value);

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
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_Choices()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='choices' namespace='##targetNamespace'"
	 * @generated
	 */
	Choices getChoices();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getChoices <em>Choices</em>}' containment reference.
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
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_Defaultvalue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='defaultvalue' namespace='##targetNamespace'"
	 * @generated
	 */
	Defaultvalue getDefaultvalue();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getDefaultvalue <em>Defaultvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaultvalue</em>' containment reference.
	 * @see #getDefaultvalue()
	 * @generated
	 */
	void setDefaultvalue(Defaultvalue value);

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
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(Properties)
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_Properties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(Sequence)
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_Sequence()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	Sequence getSequence();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(Sequence value);

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' containment reference.
	 * @see #setSimple(Simple)
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_Simple()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simple' namespace='##targetNamespace'"
	 * @generated
	 */
	Simple getSimple();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getSimple <em>Simple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple</em>' containment reference.
	 * @see #getSimple()
	 * @generated
	 */
	void setSimple(Simple value);

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference.
	 * @see #setStruct(Struct)
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_Struct()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace'"
	 * @generated
	 */
	Struct getStruct();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getStruct <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' containment reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(Struct value);

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
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#getDocumentRoot_Value()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // DocumentRoot
