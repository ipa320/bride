/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.best_of_robotics.model.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datatypes/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl <em>Types Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getTypesLibrary()
	 * @generated
	 */
	int TYPES_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__INCLUDES = 2;

	/**
	 * The number of structural features of the '<em>Types Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.DataType <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.DataType
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Types Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPES_LIBRARY = 1;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.SimpleTypeImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Types Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__TYPES_LIBRARY = DATA_TYPE__TYPES_LIBRARY;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.ComplexType <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.ComplexType
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Types Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__TYPES_LIBRARY = DATA_TYPE__TYPES_LIBRARY;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.IDLReferenceImpl <em>IDL Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.IDLReferenceImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getIDLReference()
	 * @generated
	 */
	int IDL_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_REFERENCE__NAME = COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Types Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_REFERENCE__TYPES_LIBRARY = COMPLEX_TYPE__TYPES_LIBRARY;

	/**
	 * The number of structural features of the '<em>IDL Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_REFERENCE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.RosIDLReferenceImpl <em>Ros IDL Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.RosIDLReferenceImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getRosIDLReference()
	 * @generated
	 */
	int ROS_IDL_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_IDL_REFERENCE__NAME = IDL_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Types Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_IDL_REFERENCE__TYPES_LIBRARY = IDL_REFERENCE__TYPES_LIBRARY;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_IDL_REFERENCE__NAMESPACE = IDL_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ros Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_IDL_REFERENCE__ROS_PACKAGE = IDL_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ros IDL Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_IDL_REFERENCE_FEATURE_COUNT = IDL_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.VectorTypeImpl <em>Vector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.VectorTypeImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getVectorType()
	 * @generated
	 */
	int VECTOR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_TYPE__NAME = COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Types Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_TYPE__TYPES_LIBRARY = COMPLEX_TYPE__TYPES_LIBRARY;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_TYPE__TEMPLATE = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.CustomTypeImpl <em>Custom Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.CustomTypeImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getCustomType()
	 * @generated
	 */
	int CUSTOM_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__NAME = COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Types Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__TYPES_LIBRARY = COMPLEX_TYPE__TYPES_LIBRARY;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__FIELDS = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.FieldImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Measure Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MEASURE_UNIT = 3;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 4;

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.TypesLibrary <em>Types Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Library</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary
	 * @generated
	 */
	EClass getTypesLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getTypes()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_Types();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getName()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EAttribute getTypesLibrary_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getIncludes()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_Includes();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.best_of_robotics.model.datatypes.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.datatypes.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.datatypes.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.best_of_robotics.model.datatypes.DataType#getTypesLibrary <em>Types Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Types Library</em>'.
	 * @see org.best_of_robotics.model.datatypes.DataType#getTypesLibrary()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_TypesLibrary();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see org.best_of_robotics.model.datatypes.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see org.best_of_robotics.model.datatypes.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.RosIDLReference <em>Ros IDL Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros IDL Reference</em>'.
	 * @see org.best_of_robotics.model.datatypes.RosIDLReference
	 * @generated
	 */
	EClass getRosIDLReference();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.datatypes.RosIDLReference#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.best_of_robotics.model.datatypes.RosIDLReference#getNamespace()
	 * @see #getRosIDLReference()
	 * @generated
	 */
	EAttribute getRosIDLReference_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.datatypes.RosIDLReference#getRosPackage <em>Ros Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ros Package</em>'.
	 * @see org.best_of_robotics.model.datatypes.RosIDLReference#getRosPackage()
	 * @see #getRosIDLReference()
	 * @generated
	 */
	EAttribute getRosIDLReference_RosPackage();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.VectorType <em>Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Type</em>'.
	 * @see org.best_of_robotics.model.datatypes.VectorType
	 * @generated
	 */
	EClass getVectorType();

	/**
	 * Returns the meta object for the reference '{@link org.best_of_robotics.model.datatypes.VectorType#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see org.best_of_robotics.model.datatypes.VectorType#getTemplate()
	 * @see #getVectorType()
	 * @generated
	 */
	EReference getVectorType_Template();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.CustomType <em>Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Type</em>'.
	 * @see org.best_of_robotics.model.datatypes.CustomType
	 * @generated
	 */
	EClass getCustomType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.best_of_robotics.model.datatypes.CustomType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.best_of_robotics.model.datatypes.CustomType#getFields()
	 * @see #getCustomType()
	 * @generated
	 */
	EReference getCustomType_Fields();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.best_of_robotics.model.datatypes.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.datatypes.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.best_of_robotics.model.datatypes.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the reference '{@link org.best_of_robotics.model.datatypes.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.best_of_robotics.model.datatypes.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.datatypes.Field#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.best_of_robotics.model.datatypes.Field#getDescription()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.datatypes.Field#getMeasureUnit <em>Measure Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Unit</em>'.
	 * @see org.best_of_robotics.model.datatypes.Field#getMeasureUnit()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_MeasureUnit();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.IDLReference <em>IDL Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Reference</em>'.
	 * @see org.best_of_robotics.model.datatypes.IDLReference
	 * @generated
	 */
	EClass getIDLReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

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
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl <em>Types Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getTypesLibrary()
		 * @generated
		 */
		EClass TYPES_LIBRARY = eINSTANCE.getTypesLibrary();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__TYPES = eINSTANCE.getTypesLibrary_Types();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPES_LIBRARY__NAME = eINSTANCE.getTypesLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__INCLUDES = eINSTANCE.getTypesLibrary_Includes();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.DataType <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.DataType
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '<em><b>Types Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__TYPES_LIBRARY = eINSTANCE.getDataType_TypesLibrary();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.SimpleTypeImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.ComplexType <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.ComplexType
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.RosIDLReferenceImpl <em>Ros IDL Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.RosIDLReferenceImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getRosIDLReference()
		 * @generated
		 */
		EClass ROS_IDL_REFERENCE = eINSTANCE.getRosIDLReference();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_IDL_REFERENCE__NAMESPACE = eINSTANCE.getRosIDLReference_Namespace();

		/**
		 * The meta object literal for the '<em><b>Ros Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_IDL_REFERENCE__ROS_PACKAGE = eINSTANCE.getRosIDLReference_RosPackage();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.VectorTypeImpl <em>Vector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.VectorTypeImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getVectorType()
		 * @generated
		 */
		EClass VECTOR_TYPE = eINSTANCE.getVectorType();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_TYPE__TEMPLATE = eINSTANCE.getVectorType_Template();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.CustomTypeImpl <em>Custom Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.CustomTypeImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getCustomType()
		 * @generated
		 */
		EClass CUSTOM_TYPE = eINSTANCE.getCustomType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_TYPE__FIELDS = eINSTANCE.getCustomType_Fields();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.FieldImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__DESCRIPTION = eINSTANCE.getField_Description();

		/**
		 * The meta object literal for the '<em><b>Measure Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__MEASURE_UNIT = eINSTANCE.getField_MeasureUnit();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.IDLReferenceImpl <em>IDL Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.IDLReferenceImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getIDLReference()
		 * @generated
		 */
		EClass IDL_REFERENCE = eINSTANCE.getIDLReference();

	}

} //DatatypesPackage
