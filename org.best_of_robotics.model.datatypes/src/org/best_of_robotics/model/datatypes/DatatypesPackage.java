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
	 * The feature id for the '<em><b>Bool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__BOOL = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Double</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__DOUBLE = 3;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__FLOAT = 4;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__INT = 5;

	/**
	 * The feature id for the '<em><b>Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__LONG = 6;

	/**
	 * The feature id for the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__SHORT = 7;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__STRING = 8;

	/**
	 * The feature id for the '<em><b>Unsigned Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__UNSIGNED_CHAR = 9;

	/**
	 * The feature id for the '<em><b>Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__UNSIGNED_INT = 10;

	/**
	 * The feature id for the '<em><b>Unsigned Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__UNSIGNED_LONG = 11;

	/**
	 * The feature id for the '<em><b>Unsigned Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__UNSIGNED_SHORT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY__NAME = 13;

	/**
	 * The number of structural features of the '<em>Types Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIBRARY_FEATURE_COUNT = 14;

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
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.SimpleType <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.SimpleType
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
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.RosTypeImpl <em>Ros Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.RosTypeImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getRosType()
	 * @generated
	 */
	int ROS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TYPE__NAME = COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TYPE__INCLUDE = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TYPE__NAMESPACE = COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ros Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TYPE__ROS_PACKAGE = COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ros Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.IntImpl <em>Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.IntImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getInt()
	 * @generated
	 */
	int INT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.DoubleImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.CharImpl <em>Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.CharImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getChar()
	 * @generated
	 */
	int CHAR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.FloatImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.ShortImpl <em>Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.ShortImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getShort()
	 * @generated
	 */
	int SHORT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.StringImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getString()
	 * @generated
	 */
	int STRING = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.LongImpl <em>Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.LongImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.UnsignedIntImpl <em>Unsigned Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.UnsignedIntImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getUnsignedInt()
	 * @generated
	 */
	int UNSIGNED_INT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Unsigned Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.UnsignedCharImpl <em>Unsigned Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.UnsignedCharImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getUnsignedChar()
	 * @generated
	 */
	int UNSIGNED_CHAR = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_CHAR__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Unsigned Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_CHAR_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.UnsignedShortImpl <em>Unsigned Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.UnsignedShortImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getUnsignedShort()
	 * @generated
	 */
	int UNSIGNED_SHORT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_SHORT__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Unsigned Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_SHORT_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.UnsignedLongImpl <em>Unsigned Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.UnsignedLongImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getUnsignedLong()
	 * @generated
	 */
	int UNSIGNED_LONG = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_LONG__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Unsigned Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_LONG_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.best_of_robotics.model.datatypes.impl.BoolImpl <em>Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.best_of_robotics.model.datatypes.impl.BoolImpl
	 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getBool()
	 * @generated
	 */
	int BOOL = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL__NAME = SIMPLE_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;


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
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getBool()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_Bool();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getChar()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_Char();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Double</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getDouble()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_Double();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getFloat()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_Float();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getInt()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_Int();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Long</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getLong()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_Long();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getShort()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_Short();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getString()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_String();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedChar <em>Unsigned Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned Char</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedChar()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_UnsignedChar();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedInt <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned Int</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedInt()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_UnsignedInt();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedLong <em>Unsigned Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned Long</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedLong()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_UnsignedLong();

	/**
	 * Returns the meta object for the containment reference '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedShort <em>Unsigned Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unsigned Short</em>'.
	 * @see org.best_of_robotics.model.datatypes.TypesLibrary#getUnsignedShort()
	 * @see #getTypesLibrary()
	 * @generated
	 */
	EReference getTypesLibrary_UnsignedShort();

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
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.RosType <em>Ros Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Type</em>'.
	 * @see org.best_of_robotics.model.datatypes.RosType
	 * @generated
	 */
	EClass getRosType();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.datatypes.RosType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include</em>'.
	 * @see org.best_of_robotics.model.datatypes.RosType#getInclude()
	 * @see #getRosType()
	 * @generated
	 */
	EAttribute getRosType_Include();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.datatypes.RosType#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.best_of_robotics.model.datatypes.RosType#getNamespace()
	 * @see #getRosType()
	 * @generated
	 */
	EAttribute getRosType_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.best_of_robotics.model.datatypes.RosType#getRosPackage <em>Ros Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ros Package</em>'.
	 * @see org.best_of_robotics.model.datatypes.RosType#getRosPackage()
	 * @see #getRosType()
	 * @generated
	 */
	EAttribute getRosType_RosPackage();

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
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int</em>'.
	 * @see org.best_of_robotics.model.datatypes.Int
	 * @generated
	 */
	EClass getInt();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see org.best_of_robotics.model.datatypes.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char</em>'.
	 * @see org.best_of_robotics.model.datatypes.Char
	 * @generated
	 */
	EClass getChar();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see org.best_of_robotics.model.datatypes.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.Short <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short</em>'.
	 * @see org.best_of_robotics.model.datatypes.Short
	 * @generated
	 */
	EClass getShort();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.best_of_robotics.model.datatypes.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long</em>'.
	 * @see org.best_of_robotics.model.datatypes.Long
	 * @generated
	 */
	EClass getLong();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.UnsignedInt <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Int</em>'.
	 * @see org.best_of_robotics.model.datatypes.UnsignedInt
	 * @generated
	 */
	EClass getUnsignedInt();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.UnsignedChar <em>Unsigned Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Char</em>'.
	 * @see org.best_of_robotics.model.datatypes.UnsignedChar
	 * @generated
	 */
	EClass getUnsignedChar();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.UnsignedShort <em>Unsigned Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Short</em>'.
	 * @see org.best_of_robotics.model.datatypes.UnsignedShort
	 * @generated
	 */
	EClass getUnsignedShort();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.UnsignedLong <em>Unsigned Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Long</em>'.
	 * @see org.best_of_robotics.model.datatypes.UnsignedLong
	 * @generated
	 */
	EClass getUnsignedLong();

	/**
	 * Returns the meta object for class '{@link org.best_of_robotics.model.datatypes.Bool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool</em>'.
	 * @see org.best_of_robotics.model.datatypes.Bool
	 * @generated
	 */
	EClass getBool();

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
		 * The meta object literal for the '<em><b>Bool</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__BOOL = eINSTANCE.getTypesLibrary_Bool();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__CHAR = eINSTANCE.getTypesLibrary_Char();

		/**
		 * The meta object literal for the '<em><b>Double</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__DOUBLE = eINSTANCE.getTypesLibrary_Double();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__FLOAT = eINSTANCE.getTypesLibrary_Float();

		/**
		 * The meta object literal for the '<em><b>Int</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__INT = eINSTANCE.getTypesLibrary_Int();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__LONG = eINSTANCE.getTypesLibrary_Long();

		/**
		 * The meta object literal for the '<em><b>Short</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__SHORT = eINSTANCE.getTypesLibrary_Short();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__STRING = eINSTANCE.getTypesLibrary_String();

		/**
		 * The meta object literal for the '<em><b>Unsigned Char</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__UNSIGNED_CHAR = eINSTANCE.getTypesLibrary_UnsignedChar();

		/**
		 * The meta object literal for the '<em><b>Unsigned Int</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__UNSIGNED_INT = eINSTANCE.getTypesLibrary_UnsignedInt();

		/**
		 * The meta object literal for the '<em><b>Unsigned Long</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__UNSIGNED_LONG = eINSTANCE.getTypesLibrary_UnsignedLong();

		/**
		 * The meta object literal for the '<em><b>Unsigned Short</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIBRARY__UNSIGNED_SHORT = eINSTANCE.getTypesLibrary_UnsignedShort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPES_LIBRARY__NAME = eINSTANCE.getTypesLibrary_Name();

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
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.SimpleType <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.SimpleType
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
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.RosTypeImpl <em>Ros Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.RosTypeImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getRosType()
		 * @generated
		 */
		EClass ROS_TYPE = eINSTANCE.getRosType();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_TYPE__INCLUDE = eINSTANCE.getRosType_Include();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_TYPE__NAMESPACE = eINSTANCE.getRosType_Namespace();

		/**
		 * The meta object literal for the '<em><b>Ros Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_TYPE__ROS_PACKAGE = eINSTANCE.getRosType_RosPackage();

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
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.IntImpl <em>Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.IntImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getInt()
		 * @generated
		 */
		EClass INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.DoubleImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.CharImpl <em>Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.CharImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getChar()
		 * @generated
		 */
		EClass CHAR = eINSTANCE.getChar();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.FloatImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.ShortImpl <em>Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.ShortImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getShort()
		 * @generated
		 */
		EClass SHORT = eINSTANCE.getShort();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.StringImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.LongImpl <em>Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.LongImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getLong()
		 * @generated
		 */
		EClass LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.UnsignedIntImpl <em>Unsigned Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.UnsignedIntImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getUnsignedInt()
		 * @generated
		 */
		EClass UNSIGNED_INT = eINSTANCE.getUnsignedInt();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.UnsignedCharImpl <em>Unsigned Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.UnsignedCharImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getUnsignedChar()
		 * @generated
		 */
		EClass UNSIGNED_CHAR = eINSTANCE.getUnsignedChar();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.UnsignedShortImpl <em>Unsigned Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.UnsignedShortImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getUnsignedShort()
		 * @generated
		 */
		EClass UNSIGNED_SHORT = eINSTANCE.getUnsignedShort();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.UnsignedLongImpl <em>Unsigned Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.UnsignedLongImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getUnsignedLong()
		 * @generated
		 */
		EClass UNSIGNED_LONG = eINSTANCE.getUnsignedLong();

		/**
		 * The meta object literal for the '{@link org.best_of_robotics.model.datatypes.impl.BoolImpl <em>Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.best_of_robotics.model.datatypes.impl.BoolImpl
		 * @see org.best_of_robotics.model.datatypes.impl.DatatypesPackageImpl#getBool()
		 * @generated
		 */
		EClass BOOL = eINSTANCE.getBool();

	}

} //DatatypesPackage
