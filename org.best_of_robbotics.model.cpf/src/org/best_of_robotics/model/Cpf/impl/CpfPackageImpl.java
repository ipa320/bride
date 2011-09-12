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
package org.best_of_robotics.model.Cpf.impl;

import org.best_of_robotics.model.Cpf.Choice;
import org.best_of_robotics.model.Cpf.Choices;
import org.best_of_robotics.model.Cpf.CpfFactory;
import org.best_of_robotics.model.Cpf.CpfPackage;
import org.best_of_robotics.model.Cpf.Defaultvalue;
import org.best_of_robotics.model.Cpf.Description;
import org.best_of_robotics.model.Cpf.DocumentRoot;
import org.best_of_robotics.model.Cpf.Properties;
import org.best_of_robotics.model.Cpf.Sequence;
import org.best_of_robotics.model.Cpf.Simple;
import org.best_of_robotics.model.Cpf.SimpleType;
import org.best_of_robotics.model.Cpf.Struct;
import org.best_of_robotics.model.Cpf.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpfPackageImpl extends EPackageImpl implements CpfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultvalueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.best_of_robotics.model.Cpf.CpfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CpfPackageImpl() {
		super(eNS_URI, CpfFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CpfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CpfPackage init() {
		if (isInited)
			return (CpfPackage) EPackage.Registry.INSTANCE
					.getEPackage(CpfPackage.eNS_URI);

		// Obtain or create and register package
		CpfPackageImpl theCpfPackage = (CpfPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CpfPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new CpfPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCpfPackage.createPackageContents();

		// Initialize created meta-data
		theCpfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCpfPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CpfPackage.eNS_URI, theCpfPackage);
		return theCpfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoice_Mixed() {
		return (EAttribute) choiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoices() {
		return choicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoices_Choice() {
		return (EReference) choicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultvalue() {
		return defaultvalueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultvalue_Mixed() {
		return (EAttribute) defaultvalueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Mixed() {
		return (EAttribute) descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Choice() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Choices() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Defaultvalue() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Description() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Properties() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sequence() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Simple() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Struct() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Value() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Description() {
		return (EReference) propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Simple() {
		return (EReference) propertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Sequence() {
		return (EReference) propertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Struct() {
		return (EReference) propertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Description() {
		return (EReference) sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Simple() {
		return (EReference) sequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Struct() {
		return (EReference) sequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Sequence() {
		return (EReference) sequenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequence_Name() {
		return (EAttribute) sequenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequence_Type() {
		return (EAttribute) sequenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimple() {
		return simpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_Description() {
		return (EReference) simpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_Value() {
		return (EReference) simpleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_Choices() {
		return (EReference) simpleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_Defaultvalue() {
		return (EReference) simpleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimple_Name() {
		return (EAttribute) simpleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimple_Type() {
		return (EAttribute) simpleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStruct() {
		return structEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStruct_Description() {
		return (EReference) structEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStruct_Simple() {
		return (EReference) structEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStruct_Sequence() {
		return (EReference) structEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStruct_Struct() {
		return (EReference) structEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStruct_Name() {
		return (EAttribute) structEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStruct_Type() {
		return (EAttribute) structEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Mixed() {
		return (EAttribute) valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSimpleType() {
		return simpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimpleTypeObject() {
		return simpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpfFactory getCpfFactory() {
		return (CpfFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		choiceEClass = createEClass(CHOICE);
		createEAttribute(choiceEClass, CHOICE__MIXED);

		choicesEClass = createEClass(CHOICES);
		createEReference(choicesEClass, CHOICES__CHOICE);

		defaultvalueEClass = createEClass(DEFAULTVALUE);
		createEAttribute(defaultvalueEClass, DEFAULTVALUE__MIXED);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__MIXED);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHOICE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHOICES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEFAULTVALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SEQUENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIMPLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STRUCT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__DESCRIPTION);
		createEReference(propertiesEClass, PROPERTIES__SIMPLE);
		createEReference(propertiesEClass, PROPERTIES__SEQUENCE);
		createEReference(propertiesEClass, PROPERTIES__STRUCT);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__DESCRIPTION);
		createEReference(sequenceEClass, SEQUENCE__SIMPLE);
		createEReference(sequenceEClass, SEQUENCE__STRUCT);
		createEReference(sequenceEClass, SEQUENCE__SEQUENCE);
		createEAttribute(sequenceEClass, SEQUENCE__NAME);
		createEAttribute(sequenceEClass, SEQUENCE__TYPE);

		simpleEClass = createEClass(SIMPLE);
		createEReference(simpleEClass, SIMPLE__DESCRIPTION);
		createEReference(simpleEClass, SIMPLE__VALUE);
		createEReference(simpleEClass, SIMPLE__CHOICES);
		createEReference(simpleEClass, SIMPLE__DEFAULTVALUE);
		createEAttribute(simpleEClass, SIMPLE__NAME);
		createEAttribute(simpleEClass, SIMPLE__TYPE);

		structEClass = createEClass(STRUCT);
		createEReference(structEClass, STRUCT__DESCRIPTION);
		createEReference(structEClass, STRUCT__SIMPLE);
		createEReference(structEClass, STRUCT__SEQUENCE);
		createEReference(structEClass, STRUCT__STRUCT);
		createEAttribute(structEClass, STRUCT__NAME);
		createEAttribute(structEClass, STRUCT__TYPE);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__MIXED);

		// Create enums
		simpleTypeEEnum = createEEnum(SIMPLE_TYPE);

		// Create data types
		simpleTypeObjectEDataType = createEDataType(SIMPLE_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoice_Mixed(), ecorePackage.getEFeatureMapEntry(),
				"mixed", null, 0, -1, Choice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choicesEClass, Choices.class, "Choices", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoices_Choice(), this.getChoice(), null, "choice",
				null, 0, -1, Choices.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultvalueEClass, Defaultvalue.class, "Defaultvalue",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultvalue_Mixed(),
				ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1,
				Defaultvalue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Mixed(),
				ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1,
				Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(),
				ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(),
				ecorePackage.getEStringToStringMapEntry(), null,
				"xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(),
				ecorePackage.getEStringToStringMapEntry(), null,
				"xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Choice(), this.getChoice(), null,
				"choice", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Choices(), this.getChoices(), null,
				"choices", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Defaultvalue(), this.getDefaultvalue(),
				null, "defaultvalue", null, 0, -2, null, IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Description(), this.getDescription(),
				null, "description", null, 0, -2, null, IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Properties(), this.getProperties(),
				null, "properties", null, 0, -2, null, IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sequence(), this.getSequence(), null,
				"sequence", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Simple(), this.getSimple(), null,
				"simple", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Struct(), this.getStruct(), null,
				"struct", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Value(), this.getValue(), null, "value",
				null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_Description(), this.getDescription(),
				null, "description", null, 0, 1, Properties.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getProperties_Simple(), this.getSimple(), null,
				"simple", null, 0, -1, Properties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperties_Sequence(), this.getSequence(), null,
				"sequence", null, 0, 1, Properties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperties_Struct(), this.getStruct(), null,
				"struct", null, 0, -1, Properties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_Description(), this.getDescription(), null,
				"description", null, 0, 1, Sequence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequence_Simple(), this.getSimple(), null, "simple",
				null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequence_Struct(), this.getStruct(), null, "struct",
				null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequence_Sequence(), this.getSequence(), null,
				"sequence", null, 0, -1, Sequence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequence_Name(), theXMLTypePackage.getString(),
				"name", null, 0, 1, Sequence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequence_Type(), theXMLTypePackage.getString(),
				"type", null, 1, 1, Sequence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimple_Description(), this.getDescription(), null,
				"description", null, 0, 1, Simple.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_Value(), this.getValue(), null, "value", null,
				1, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_Choices(), this.getChoices(), null, "choices",
				null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_Defaultvalue(), this.getDefaultvalue(), null,
				"defaultvalue", null, 0, 1, Simple.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimple_Name(), theXMLTypePackage.getString(), "name",
				null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSimple_Type(), this.getSimpleType(), "type", null, 1,
				1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStruct_Description(), this.getDescription(), null,
				"description", null, 0, 1, Struct.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStruct_Simple(), this.getSimple(), null, "simple",
				null, 0, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStruct_Sequence(), this.getSequence(), null,
				"sequence", null, 0, 1, Struct.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStruct_Struct(), this.getStruct(), null, "struct",
				null, 0, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStruct_Name(), theXMLTypePackage.getString(), "name",
				null, 0, 1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getStruct_Type(), theXMLTypePackage.getString(), "type",
				null, 1, 1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Mixed(), ecorePackage.getEFeatureMapEntry(),
				"mixed", null, 0, -1, Value.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(simpleTypeEEnum, SimpleType.class, "SimpleType");
		addEEnumLiteral(simpleTypeEEnum, SimpleType.BOOLEAN);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.CHAR);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.DOUBLE);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.FLOAT);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.SHORT);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.LONG);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.OBJREF);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.OCTET);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.STRING);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.ULONG);
		addEEnumLiteral(simpleTypeEEnum, SimpleType.USHORT);

		// Initialize data types
		initEDataType(simpleTypeObjectEDataType, SimpleType.class,
				"SimpleTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(this, source, new String[] { "qualified", "false" });
		addAnnotation(choiceEClass, source, new String[] { "name", "choice",
				"kind", "mixed" });
		addAnnotation(getChoice_Mixed(), source, new String[] { "kind",
				"elementWildcard", "name", ":mixed" });
		addAnnotation(choicesEClass, source, new String[] { "name", "choices",
				"kind", "elementOnly" });
		addAnnotation(getChoices_Choice(), source, new String[] { "kind",
				"element", "name", "choice", "namespace", "##targetNamespace" });
		addAnnotation(defaultvalueEClass, source, new String[] { "name",
				"defaultvalue", "kind", "mixed" });
		addAnnotation(getDefaultvalue_Mixed(), source, new String[] { "kind",
				"elementWildcard", "name", ":mixed" });
		addAnnotation(descriptionEClass, source, new String[] { "name",
				"description", "kind", "mixed" });
		addAnnotation(getDescription_Mixed(), source, new String[] { "kind",
				"elementWildcard", "name", ":mixed" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "",
				"kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind",
				"elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] {
				"kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source,
				new String[] { "kind", "attribute", "name",
						"xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_Choice(), source, new String[] { "kind",
				"element", "name", "choice", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_Choices(), source,
				new String[] { "kind", "element", "name", "choices",
						"namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_Defaultvalue(), source, new String[] {
				"kind", "element", "name", "defaultvalue", "namespace",
				"##targetNamespace" });
		addAnnotation(getDocumentRoot_Description(), source, new String[] {
				"kind", "element", "name", "description", "namespace",
				"##targetNamespace" });
		addAnnotation(getDocumentRoot_Properties(), source, new String[] {
				"kind", "element", "name", "properties", "namespace",
				"##targetNamespace" });
		addAnnotation(getDocumentRoot_Sequence(), source, new String[] {
				"kind", "element", "name", "sequence", "namespace",
				"##targetNamespace" });
		addAnnotation(getDocumentRoot_Simple(), source, new String[] { "kind",
				"element", "name", "simple", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_Struct(), source, new String[] { "kind",
				"element", "name", "struct", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_Value(), source, new String[] { "kind",
				"element", "name", "value", "namespace", "##targetNamespace" });
		addAnnotation(propertiesEClass, source, new String[] { "name",
				"properties", "kind", "elementOnly" });
		addAnnotation(getProperties_Description(), source, new String[] {
				"kind", "element", "name", "description", "namespace",
				"##targetNamespace" });
		addAnnotation(getProperties_Simple(), source, new String[] { "kind",
				"element", "name", "simple", "namespace", "##targetNamespace" });
		addAnnotation(getProperties_Sequence(), source,
				new String[] { "kind", "element", "name", "sequence",
						"namespace", "##targetNamespace" });
		addAnnotation(getProperties_Struct(), source, new String[] { "kind",
				"element", "name", "struct", "namespace", "##targetNamespace" });
		addAnnotation(sequenceEClass, source, new String[] { "name",
				"sequence", "kind", "elementOnly" });
		addAnnotation(getSequence_Description(), source, new String[] { "kind",
				"element", "name", "description", "namespace",
				"##targetNamespace" });
		addAnnotation(getSequence_Simple(), source, new String[] { "kind",
				"element", "name", "simple", "namespace", "##targetNamespace" });
		addAnnotation(getSequence_Struct(), source, new String[] { "kind",
				"element", "name", "struct", "namespace", "##targetNamespace" });
		addAnnotation(getSequence_Sequence(), source,
				new String[] { "kind", "element", "name", "sequence",
						"namespace", "##targetNamespace" });
		addAnnotation(getSequence_Name(), source, new String[] { "kind",
				"attribute", "name", "name", "namespace", "##targetNamespace" });
		addAnnotation(getSequence_Type(), source, new String[] { "kind",
				"attribute", "name", "type", "namespace", "##targetNamespace" });
		addAnnotation(simpleEClass, source, new String[] { "name", "simple",
				"kind", "elementOnly" });
		addAnnotation(getSimple_Description(), source, new String[] { "kind",
				"element", "name", "description", "namespace",
				"##targetNamespace" });
		addAnnotation(getSimple_Value(), source, new String[] { "kind",
				"element", "name", "value", "namespace", "##targetNamespace" });
		addAnnotation(getSimple_Choices(), source,
				new String[] { "kind", "element", "name", "choices",
						"namespace", "##targetNamespace" });
		addAnnotation(getSimple_Defaultvalue(), source, new String[] { "kind",
				"element", "name", "defaultvalue", "namespace",
				"##targetNamespace" });
		addAnnotation(getSimple_Name(), source, new String[] { "kind",
				"attribute", "name", "name", "namespace", "##targetNamespace" });
		addAnnotation(getSimple_Type(), source, new String[] { "kind",
				"attribute", "name", "type", "namespace", "##targetNamespace" });
		addAnnotation(simpleTypeEEnum, source, new String[] { "name",
				"simpleType" });
		addAnnotation(simpleTypeObjectEDataType, source, new String[] { "name",
				"simpleType:Object", "baseType", "simpleType" });
		addAnnotation(structEClass, source, new String[] { "name", "struct",
				"kind", "elementOnly" });
		addAnnotation(getStruct_Description(), source, new String[] { "kind",
				"element", "name", "description", "namespace",
				"##targetNamespace" });
		addAnnotation(getStruct_Simple(), source, new String[] { "kind",
				"element", "name", "simple", "namespace", "##targetNamespace" });
		addAnnotation(getStruct_Sequence(), source,
				new String[] { "kind", "element", "name", "sequence",
						"namespace", "##targetNamespace" });
		addAnnotation(getStruct_Struct(), source, new String[] { "kind",
				"element", "name", "struct", "namespace", "##targetNamespace" });
		addAnnotation(getStruct_Name(), source, new String[] { "kind",
				"attribute", "name", "name", "namespace", "##targetNamespace" });
		addAnnotation(getStruct_Type(), source, new String[] { "kind",
				"attribute", "name", "type", "namespace", "##targetNamespace" });
		addAnnotation(valueEClass, source, new String[] { "name", "value",
				"kind", "mixed" });
		addAnnotation(getValue_Mixed(), source, new String[] { "kind",
				"elementWildcard", "name", ":mixed" });
	}

} //CpfPackageImpl
