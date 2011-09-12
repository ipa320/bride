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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.best_of_robotics.model.Cpf.CpfFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface CpfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Cpf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://Cpf/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Cpf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpfPackage eINSTANCE = org.best_of_robotics.model.Cpf.impl.CpfPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.Cpf.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.impl.ChoiceImpl
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.Cpf.impl.ChoicesImpl <em>Choices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.impl.ChoicesImpl
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getChoices()
	 * @generated
	 */
	int CHOICES = 1;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICES__CHOICE = 0;

	/**
	 * The number of structural features of the '<em>Choices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.Cpf.impl.DefaultvalueImpl <em>Defaultvalue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.impl.DefaultvalueImpl
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getDefaultvalue()
	 * @generated
	 */
	int DEFAULTVALUE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Defaultvalue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.Cpf.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.impl.DescriptionImpl
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.impl.DocumentRootImpl
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHOICES = 4;

	/**
	 * The feature id for the '<em><b>Defaultvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFAULTVALUE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTIES = 7;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SEQUENCE = 8;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE = 9;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRUCT = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 11;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.Cpf.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.impl.PropertiesImpl
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__SIMPLE = 1;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__STRUCT = 3;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.Cpf.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.impl.SequenceImpl
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SIMPLE = 1;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__STRUCT = 2;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SEQUENCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.Cpf.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.impl.SimpleImpl
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__CHOICES = 2;

	/**
	 * The feature id for the '<em><b>Defaultvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__DEFAULTVALUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.Cpf.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.impl.StructImpl
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__SIMPLE = 1;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__STRUCT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.Cpf.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.impl.ValueImpl
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.Cpf.SimpleType <em>Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.SimpleType
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 10;

	/**
	 * The meta object id for the '<em>Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.Cpf.SimpleType
	 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getSimpleTypeObject()
	 * @generated
	 */
	int SIMPLE_TYPE_OBJECT = 11;

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.Cpf.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see org.best_of_robotics.model.Cpf.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute list '{@link org.best_of_robotics.model.Cpf.Choice#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.best_of_robotics.model.Cpf.Choice#getMixed()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Mixed();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.Cpf.Choices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choices</em>'.
	 * @see org.best_of_robotics.model.Cpf.Choices
	 * @generated
	 */
	EClass getChoices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.Cpf.Choices#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see org.best_of_robotics.model.Cpf.Choices#getChoice()
	 * @see #getChoices()
	 * @generated
	 */
	EReference getChoices_Choice();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.Cpf.Defaultvalue <em>Defaultvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defaultvalue</em>'.
	 * @see org.best_of_robotics.model.Cpf.Defaultvalue
	 * @generated
	 */
	EClass getDefaultvalue();

	/**
	 * Returns the meta object for the attribute list '{@link org.best_of_robotics.model.Cpf.Defaultvalue#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.best_of_robotics.model.Cpf.Defaultvalue#getMixed()
	 * @see #getDefaultvalue()
	 * @generated
	 */
	EAttribute getDefaultvalue_Mixed();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.Cpf.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.best_of_robotics.model.Cpf.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.best_of_robotics.model.Cpf.Description#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.best_of_robotics.model.Cpf.Description#getMixed()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Mixed();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.Cpf.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getChoice()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choices</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getChoices()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Choices();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getDefaultvalue <em>Defaultvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaultvalue</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getDefaultvalue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Defaultvalue();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getSequence()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getSimple()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Simple();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getStruct()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Struct();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.best_of_robotics.model.Cpf.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Value();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.Cpf.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see org.best_of_robotics.model.Cpf.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.Properties#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.best_of_robotics.model.Cpf.Properties#getDescription()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.Cpf.Properties#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple</em>'.
	 * @see org.best_of_robotics.model.Cpf.Properties#getSimple()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Simple();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.Properties#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.best_of_robotics.model.Cpf.Properties#getSequence()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.Cpf.Properties#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct</em>'.
	 * @see org.best_of_robotics.model.Cpf.Properties#getStruct()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Struct();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.Cpf.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.best_of_robotics.model.Cpf.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.Sequence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.best_of_robotics.model.Cpf.Sequence#getDescription()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.Cpf.Sequence#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple</em>'.
	 * @see org.best_of_robotics.model.Cpf.Sequence#getSimple()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Simple();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.Cpf.Sequence#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct</em>'.
	 * @see org.best_of_robotics.model.Cpf.Sequence#getStruct()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Struct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.Cpf.Sequence#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see org.best_of_robotics.model.Cpf.Sequence#getSequence()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.Cpf.Sequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.Cpf.Sequence#getName()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.Cpf.Sequence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.best_of_robotics.model.Cpf.Sequence#getType()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Type();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.Cpf.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see org.best_of_robotics.model.Cpf.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.Simple#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.best_of_robotics.model.Cpf.Simple#getDescription()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.Simple#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.best_of_robotics.model.Cpf.Simple#getValue()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.Simple#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choices</em>'.
	 * @see org.best_of_robotics.model.Cpf.Simple#getChoices()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Choices();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.Simple#getDefaultvalue <em>Defaultvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaultvalue</em>'.
	 * @see org.best_of_robotics.model.Cpf.Simple#getDefaultvalue()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Defaultvalue();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.Cpf.Simple#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.Cpf.Simple#getName()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.Cpf.Simple#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.best_of_robotics.model.Cpf.Simple#getType()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Type();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.Cpf.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see org.best_of_robotics.model.Cpf.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.Struct#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.best_of_robotics.model.Cpf.Struct#getDescription()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.Cpf.Struct#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple</em>'.
	 * @see org.best_of_robotics.model.Cpf.Struct#getSimple()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Simple();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.Cpf.Struct#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see org.best_of_robotics.model.Cpf.Struct#getSequence()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.Cpf.Struct#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct</em>'.
	 * @see org.best_of_robotics.model.Cpf.Struct#getStruct()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Struct();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.Cpf.Struct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.Cpf.Struct#getName()
	 * @see #getStruct()
	 * @generated
	 */
	EAttribute getStruct_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.Cpf.Struct#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.best_of_robotics.model.Cpf.Struct#getType()
	 * @see #getStruct()
	 * @generated
	 */
	EAttribute getStruct_Type();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.Cpf.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.best_of_robotics.model.Cpf.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute list '{@link org.best_of_robotics.model.Cpf.Value#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.best_of_robotics.model.Cpf.Value#getMixed()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Mixed();

	/**
	 * Returns the meta object for enum '{@link org.best_of_robotics.model.Cpf.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Type</em>'.
	 * @see org.best_of_robotics.model.Cpf.SimpleType
	 * @generated
	 */
	EEnum getSimpleType();

	/**
	 * Returns the meta object for data type '{@link org.best_of_robotics.model.Cpf.SimpleType <em>Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Type Object</em>'.
	 * @see org.best_of_robotics.model.Cpf.SimpleType
	 * @model instanceClass="org.best_of_robotics.model.Cpf.SimpleType"
	 *        extendedMetaData="name='simpleType:Object' baseType='simpleType'"
	 * @generated
	 */
	EDataType getSimpleTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CpfFactory getCpfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.Cpf.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.impl.ChoiceImpl
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__MIXED = eINSTANCE.getChoice_Mixed();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.Cpf.impl.ChoicesImpl <em>Choices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.impl.ChoicesImpl
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getChoices()
		 * @generated
		 */
		EClass CHOICES = eINSTANCE.getChoices();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICES__CHOICE = eINSTANCE.getChoices_Choice();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.Cpf.impl.DefaultvalueImpl <em>Defaultvalue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.impl.DefaultvalueImpl
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getDefaultvalue()
		 * @generated
		 */
		EClass DEFAULTVALUE = eINSTANCE.getDefaultvalue();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULTVALUE__MIXED = eINSTANCE.getDefaultvalue_Mixed();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.Cpf.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.impl.DescriptionImpl
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__MIXED = eINSTANCE.getDescription_Mixed();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.Cpf.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.impl.DocumentRootImpl
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE
				.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE
				.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHOICE = eINSTANCE.getDocumentRoot_Choice();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHOICES = eINSTANCE.getDocumentRoot_Choices();

		/**
		 * The meta object literal for the '<em><b>Defaultvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEFAULTVALUE = eINSTANCE
				.getDocumentRoot_Defaultvalue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIPTION = eINSTANCE
				.getDocumentRoot_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTIES = eINSTANCE
				.getDocumentRoot_Properties();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SEQUENCE = eINSTANCE
				.getDocumentRoot_Sequence();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIMPLE = eINSTANCE.getDocumentRoot_Simple();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRUCT = eINSTANCE.getDocumentRoot_Struct();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE = eINSTANCE.getDocumentRoot_Value();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.Cpf.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.impl.PropertiesImpl
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__DESCRIPTION = eINSTANCE
				.getProperties_Description();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__SIMPLE = eINSTANCE.getProperties_Simple();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__SEQUENCE = eINSTANCE.getProperties_Sequence();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__STRUCT = eINSTANCE.getProperties_Struct();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.Cpf.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.impl.SequenceImpl
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__DESCRIPTION = eINSTANCE.getSequence_Description();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__SIMPLE = eINSTANCE.getSequence_Simple();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__STRUCT = eINSTANCE.getSequence_Struct();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__SEQUENCE = eINSTANCE.getSequence_Sequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__TYPE = eINSTANCE.getSequence_Type();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.Cpf.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.impl.SimpleImpl
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__DESCRIPTION = eINSTANCE.getSimple_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__VALUE = eINSTANCE.getSimple_Value();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__CHOICES = eINSTANCE.getSimple_Choices();

		/**
		 * The meta object literal for the '<em><b>Defaultvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__DEFAULTVALUE = eINSTANCE.getSimple_Defaultvalue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__NAME = eINSTANCE.getSimple_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__TYPE = eINSTANCE.getSimple_Type();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.Cpf.impl.StructImpl <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.impl.StructImpl
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__DESCRIPTION = eINSTANCE.getStruct_Description();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__SIMPLE = eINSTANCE.getStruct_Simple();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__SEQUENCE = eINSTANCE.getStruct_Sequence();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__STRUCT = eINSTANCE.getStruct_Struct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT__NAME = eINSTANCE.getStruct_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT__TYPE = eINSTANCE.getStruct_Type();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.Cpf.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.impl.ValueImpl
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__MIXED = eINSTANCE.getValue_Mixed();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.Cpf.SimpleType <em>Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.SimpleType
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getSimpleType()
		 * @generated
		 */
		EEnum SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '<em>Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.Cpf.SimpleType
		 * @see org.best_of_robotics.model.Cpf.impl.CpfPackageImpl#getSimpleTypeObject()
		 * @generated
		 */
		EDataType SIMPLE_TYPE_OBJECT = eINSTANCE.getSimpleTypeObject();

	}

} //CpfPackage
