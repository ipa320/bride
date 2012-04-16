/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes.impl;

import org.best_of_robotics.model.datatypes.Bool;
import org.best_of_robotics.model.datatypes.Char;
import org.best_of_robotics.model.datatypes.ComplexType;
import org.best_of_robotics.model.datatypes.CustomType;
import org.best_of_robotics.model.datatypes.DataType;
import org.best_of_robotics.model.datatypes.DatatypesFactory;
import org.best_of_robotics.model.datatypes.DatatypesPackage;
import org.best_of_robotics.model.datatypes.Field;
import org.best_of_robotics.model.datatypes.Int;
import org.best_of_robotics.model.datatypes.RosType;
import org.best_of_robotics.model.datatypes.SimpleType;
import org.best_of_robotics.model.datatypes.TypesLibrary;
import org.best_of_robotics.model.datatypes.UnsignedChar;
import org.best_of_robotics.model.datatypes.UnsignedInt;
import org.best_of_robotics.model.datatypes.UnsignedLong;
import org.best_of_robotics.model.datatypes.UnsignedShort;
import org.best_of_robotics.model.datatypes.VectorType;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesPackageImpl extends EPackageImpl implements DatatypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedShortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolEClass = null;

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
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesPackageImpl() {
		super(eNS_URI, DatatypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatatypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesPackage init() {
		if (isInited) return (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, theDatatypesPackage);
		return theDatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypesLibrary() {
		return typesLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_Types() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_Bool() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_Char() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_Double() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_Float() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_Int() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_Long() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_Short() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_String() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_UnsignedChar() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_UnsignedInt() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_UnsignedLong() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesLibrary_UnsignedShort() {
		return (EReference)typesLibraryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypesLibrary_Name() {
		return (EAttribute)typesLibraryEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Name() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleType() {
		return simpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexType() {
		return complexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosType() {
		return rosTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosType_Include() {
		return (EAttribute)rosTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosType_Namespace() {
		return (EAttribute)rosTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosType_RosPackage() {
		return (EAttribute)rosTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorType() {
		return vectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorType_Template() {
		return (EReference)vectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomType() {
		return customTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomType_Fields() {
		return (EReference)customTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Type() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Description() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_MeasureUnit() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt() {
		return intEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble() {
		return doubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChar() {
		return charEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat() {
		return floatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShort() {
		return shortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong() {
		return longEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedInt() {
		return unsignedIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedChar() {
		return unsignedCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedShort() {
		return unsignedShortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedLong() {
		return unsignedLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBool() {
		return boolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactory getDatatypesFactory() {
		return (DatatypesFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		typesLibraryEClass = createEClass(TYPES_LIBRARY);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__TYPES);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__BOOL);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__CHAR);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__DOUBLE);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__FLOAT);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__INT);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__LONG);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__SHORT);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__STRING);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__UNSIGNED_CHAR);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__UNSIGNED_INT);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__UNSIGNED_LONG);
		createEReference(typesLibraryEClass, TYPES_LIBRARY__UNSIGNED_SHORT);
		createEAttribute(typesLibraryEClass, TYPES_LIBRARY__NAME);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__NAME);

		simpleTypeEClass = createEClass(SIMPLE_TYPE);

		complexTypeEClass = createEClass(COMPLEX_TYPE);

		rosTypeEClass = createEClass(ROS_TYPE);
		createEAttribute(rosTypeEClass, ROS_TYPE__INCLUDE);
		createEAttribute(rosTypeEClass, ROS_TYPE__NAMESPACE);
		createEAttribute(rosTypeEClass, ROS_TYPE__ROS_PACKAGE);

		vectorTypeEClass = createEClass(VECTOR_TYPE);
		createEReference(vectorTypeEClass, VECTOR_TYPE__TEMPLATE);

		customTypeEClass = createEClass(CUSTOM_TYPE);
		createEReference(customTypeEClass, CUSTOM_TYPE__FIELDS);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEReference(fieldEClass, FIELD__TYPE);
		createEAttribute(fieldEClass, FIELD__DESCRIPTION);
		createEAttribute(fieldEClass, FIELD__MEASURE_UNIT);

		intEClass = createEClass(INT);

		doubleEClass = createEClass(DOUBLE);

		charEClass = createEClass(CHAR);

		floatEClass = createEClass(FLOAT);

		shortEClass = createEClass(SHORT);

		stringEClass = createEClass(STRING);

		longEClass = createEClass(LONG);

		unsignedIntEClass = createEClass(UNSIGNED_INT);

		unsignedCharEClass = createEClass(UNSIGNED_CHAR);

		unsignedShortEClass = createEClass(UNSIGNED_SHORT);

		unsignedLongEClass = createEClass(UNSIGNED_LONG);

		boolEClass = createEClass(BOOL);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleTypeEClass.getESuperTypes().add(this.getDataType());
		complexTypeEClass.getESuperTypes().add(this.getDataType());
		rosTypeEClass.getESuperTypes().add(this.getComplexType());
		vectorTypeEClass.getESuperTypes().add(this.getComplexType());
		customTypeEClass.getESuperTypes().add(this.getComplexType());
		intEClass.getESuperTypes().add(this.getSimpleType());
		doubleEClass.getESuperTypes().add(this.getSimpleType());
		charEClass.getESuperTypes().add(this.getSimpleType());
		floatEClass.getESuperTypes().add(this.getSimpleType());
		shortEClass.getESuperTypes().add(this.getSimpleType());
		stringEClass.getESuperTypes().add(this.getSimpleType());
		longEClass.getESuperTypes().add(this.getSimpleType());
		unsignedIntEClass.getESuperTypes().add(this.getSimpleType());
		unsignedCharEClass.getESuperTypes().add(this.getSimpleType());
		unsignedShortEClass.getESuperTypes().add(this.getSimpleType());
		unsignedLongEClass.getESuperTypes().add(this.getSimpleType());
		boolEClass.getESuperTypes().add(this.getSimpleType());

		// Initialize classes and features; add operations and parameters
		initEClass(typesLibraryEClass, TypesLibrary.class, "TypesLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypesLibrary_Types(), this.getComplexType(), null, "types", null, 0, -1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_Bool(), this.getBool(), null, "bool", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_Char(), this.getChar(), null, "char", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_Double(), this.getDouble(), null, "double", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_Float(), this.getFloat(), null, "float", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_Int(), this.getInt(), null, "int", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_Long(), this.getLong(), null, "long", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_Short(), this.getShort(), null, "short", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_String(), this.getString(), null, "string", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_UnsignedChar(), this.getUnsignedChar(), null, "unsignedChar", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_UnsignedInt(), this.getUnsignedInt(), null, "unsignedInt", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_UnsignedLong(), this.getUnsignedLong(), null, "unsignedLong", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesLibrary_UnsignedShort(), this.getUnsignedShort(), null, "unsignedShort", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypesLibrary_Name(), ecorePackage.getEString(), "name", null, 1, 1, TypesLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexTypeEClass, ComplexType.class, "ComplexType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(complexTypeEClass, ecorePackage.getEString(), "getLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rosTypeEClass, RosType.class, "RosType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRosType_Include(), ecorePackage.getEString(), "include", null, 1, 1, RosType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosType_Namespace(), ecorePackage.getEString(), "namespace", null, 1, 1, RosType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosType_RosPackage(), ecorePackage.getEString(), "rosPackage", null, 1, 1, RosType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorTypeEClass, VectorType.class, "VectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVectorType_Template(), this.getDataType(), null, "template", null, 1, 1, VectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customTypeEClass, CustomType.class, "CustomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomType_Fields(), this.getField(), null, "fields", null, 1, -1, CustomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Type(), this.getDataType(), null, "type", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Description(), ecorePackage.getEString(), "description", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_MeasureUnit(), ecorePackage.getEString(), "measureUnit", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intEClass, Int.class, "Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doubleEClass, org.best_of_robotics.model.datatypes.Double.class, "Double", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(charEClass, Char.class, "Char", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatEClass, org.best_of_robotics.model.datatypes.Float.class, "Float", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shortEClass, org.best_of_robotics.model.datatypes.Short.class, "Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringEClass, org.best_of_robotics.model.datatypes.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longEClass, org.best_of_robotics.model.datatypes.Long.class, "Long", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unsignedIntEClass, UnsignedInt.class, "UnsignedInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unsignedCharEClass, UnsignedChar.class, "UnsignedChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unsignedShortEClass, UnsignedShort.class, "UnsignedShort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unsignedLongEClass, UnsignedLong.class, "UnsignedLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolEClass, Bool.class, "Bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DatatypesPackageImpl
