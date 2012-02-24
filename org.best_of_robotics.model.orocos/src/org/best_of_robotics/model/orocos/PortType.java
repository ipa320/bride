/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.orocos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Port Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.best_of_robotics.model.orocos.OrocosPackage#getPortType()
 * @model
 * @generated
 */
public enum PortType implements Enumerator {
	/**
	 * The '<em><b>Char</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	CHAR(0, "char", "char"),

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(1, "int", "int"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(2, "float", "float"),

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(3, "double", "double"),

	/**
	 * The '<em><b>Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT(4, "short", "short"),

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(5, "long", "long"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(6, "string", "string"),

	/**
	 * The '<em><b>Unsigned char</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_CHAR(7, "unsigned_char", "unsigned char"),

	/**
	 * The '<em><b>Unsigned int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_INT(8, "unsigned_int", "unsigned int"),

	/**
	 * The '<em><b>Unsigned float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_FLOAT(9, "unsigned_float", "unsigned float"),

	/**
	 * The '<em><b>Unsigned double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_DOUBLE(10, "unsigned_double", "unsigned double"),

	/**
	 * The '<em><b>Unsigned short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_SHORT(11, "unsigned_short", "unsigned short"),

	/**
	 * The '<em><b>Unsigned long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_LONG(12, "unsigned_long", "unsigned long"),

	/**
	 * The '<em><b>Vector of char</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_CHAR(13, "vector_of_char", "std::vector<char>"),

	/**
	 * The '<em><b>Vector of int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_INT_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_INT(14, "vector_of_int", "std::vector<int>"),

	/**
	 * The '<em><b>Vector of float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_FLOAT(15, "vector_of_float", "std::vector<float>"),

	/**
	 * The '<em><b>Vector of double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_DOUBLE(16, "vector_of_double", "std::vector<double>"),

	/**
	 * The '<em><b>Vector of short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_SHORT(17, "vector_of_short", "std::vector<short>"),

	/**
	 * The '<em><b>Vector of long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_LONG(18, "vector_of_long", "std::vector<long>"),

	/**
	 * The '<em><b>Vector of unsigned char</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_UNSIGNED_CHAR(19, "vector_of_unsigned_char", "std::vector<unsigened char>"),

	/**
	 * The '<em><b>Vector of unsigned int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_INT_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_UNSIGNED_INT(20, "vector_of_unsigned_int", "std::vector<unsigned int>"),

	/**
	 * The '<em><b>Vector of unsigned float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_UNSIGNED_FLOAT(21, "vector_of_unsigned_float", "std::vector<unsigned float>"),

	/**
	 * The '<em><b>Vector of unsigned double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_UNSIGNED_DOUBLE(22, "vector_of_unsigned_double", "std::vector<unsigned double>"),

	/**
	 * The '<em><b>Vector of unsigned short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_UNSIGNED_SHORT(23, "vector_of_unsigned_short", "std::vector<unsigned short>"),

	/**
	 * The '<em><b>Vector of unsigned long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_OF_UNSIGNED_LONG(24, "vector_of_unsigned_long", "std::vector<unsigned long>");

	/**
	 * The '<em><b>Char</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Char</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAR
	 * @model name="char"
	 * @generated
	 * @ordered
	 */
	public static final int CHAR_VALUE = 0;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 1;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 2;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model name="double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 3;

	/**
	 * The '<em><b>Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORT
	 * @model name="short"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_VALUE = 4;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model name="long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 5;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 6;

	/**
	 * The '<em><b>Unsigned char</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned char</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_CHAR
	 * @model name="unsigned_char" literal="unsigned char"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_CHAR_VALUE = 7;

	/**
	 * The '<em><b>Unsigned int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT
	 * @model name="unsigned_int" literal="unsigned int"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_INT_VALUE = 8;

	/**
	 * The '<em><b>Unsigned float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_FLOAT
	 * @model name="unsigned_float" literal="unsigned float"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_FLOAT_VALUE = 9;

	/**
	 * The '<em><b>Unsigned double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_DOUBLE
	 * @model name="unsigned_double" literal="unsigned double"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_DOUBLE_VALUE = 10;

	/**
	 * The '<em><b>Unsigned short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_SHORT
	 * @model name="unsigned_short" literal="unsigned short"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_SHORT_VALUE = 11;

	/**
	 * The '<em><b>Unsigned long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG
	 * @model name="unsigned_long" literal="unsigned long"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_LONG_VALUE = 12;

	/**
	 * The '<em><b>Vector of char</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of char</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_CHAR
	 * @model name="vector_of_char" literal="std::vector<char>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_CHAR_VALUE = 13;

	/**
	 * The '<em><b>Vector of int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_INT
	 * @model name="vector_of_int" literal="std::vector<int>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_INT_VALUE = 14;

	/**
	 * The '<em><b>Vector of float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_FLOAT
	 * @model name="vector_of_float" literal="std::vector<float>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_FLOAT_VALUE = 15;

	/**
	 * The '<em><b>Vector of double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_DOUBLE
	 * @model name="vector_of_double" literal="std::vector<double>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_DOUBLE_VALUE = 16;

	/**
	 * The '<em><b>Vector of short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_SHORT
	 * @model name="vector_of_short" literal="std::vector<short>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_SHORT_VALUE = 17;

	/**
	 * The '<em><b>Vector of long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_LONG
	 * @model name="vector_of_long" literal="std::vector<long>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_LONG_VALUE = 18;

	/**
	 * The '<em><b>Vector of unsigned char</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of unsigned char</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_CHAR
	 * @model name="vector_of_unsigned_char" literal="std::vector<unsigened char>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_UNSIGNED_CHAR_VALUE = 19;

	/**
	 * The '<em><b>Vector of unsigned int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of unsigned int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_INT
	 * @model name="vector_of_unsigned_int" literal="std::vector<unsigned int>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_UNSIGNED_INT_VALUE = 20;

	/**
	 * The '<em><b>Vector of unsigned float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of unsigned float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_FLOAT
	 * @model name="vector_of_unsigned_float" literal="std::vector<unsigned float>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_UNSIGNED_FLOAT_VALUE = 21;

	/**
	 * The '<em><b>Vector of unsigned double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of unsigned double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_DOUBLE
	 * @model name="vector_of_unsigned_double" literal="std::vector<unsigned double>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_UNSIGNED_DOUBLE_VALUE = 22;

	/**
	 * The '<em><b>Vector of unsigned short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of unsigned short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_SHORT
	 * @model name="vector_of_unsigned_short" literal="std::vector<unsigned short>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_UNSIGNED_SHORT_VALUE = 23;

	/**
	 * The '<em><b>Vector of unsigned long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector of unsigned long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_OF_UNSIGNED_LONG
	 * @model name="vector_of_unsigned_long" literal="std::vector<unsigned long>"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_OF_UNSIGNED_LONG_VALUE = 24;

	/**
	 * An array of all the '<em><b>Port Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PortType[] VALUES_ARRAY =
		new PortType[] {
			CHAR,
			INT,
			FLOAT,
			DOUBLE,
			SHORT,
			LONG,
			STRING,
			UNSIGNED_CHAR,
			UNSIGNED_INT,
			UNSIGNED_FLOAT,
			UNSIGNED_DOUBLE,
			UNSIGNED_SHORT,
			UNSIGNED_LONG,
			VECTOR_OF_CHAR,
			VECTOR_OF_INT,
			VECTOR_OF_FLOAT,
			VECTOR_OF_DOUBLE,
			VECTOR_OF_SHORT,
			VECTOR_OF_LONG,
			VECTOR_OF_UNSIGNED_CHAR,
			VECTOR_OF_UNSIGNED_INT,
			VECTOR_OF_UNSIGNED_FLOAT,
			VECTOR_OF_UNSIGNED_DOUBLE,
			VECTOR_OF_UNSIGNED_SHORT,
			VECTOR_OF_UNSIGNED_LONG,
		};

	/**
	 * A public read-only list of all the '<em><b>Port Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PortType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Port Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortType get(int value) {
		switch (value) {
			case CHAR_VALUE: return CHAR;
			case INT_VALUE: return INT;
			case FLOAT_VALUE: return FLOAT;
			case DOUBLE_VALUE: return DOUBLE;
			case SHORT_VALUE: return SHORT;
			case LONG_VALUE: return LONG;
			case STRING_VALUE: return STRING;
			case UNSIGNED_CHAR_VALUE: return UNSIGNED_CHAR;
			case UNSIGNED_INT_VALUE: return UNSIGNED_INT;
			case UNSIGNED_FLOAT_VALUE: return UNSIGNED_FLOAT;
			case UNSIGNED_DOUBLE_VALUE: return UNSIGNED_DOUBLE;
			case UNSIGNED_SHORT_VALUE: return UNSIGNED_SHORT;
			case UNSIGNED_LONG_VALUE: return UNSIGNED_LONG;
			case VECTOR_OF_CHAR_VALUE: return VECTOR_OF_CHAR;
			case VECTOR_OF_INT_VALUE: return VECTOR_OF_INT;
			case VECTOR_OF_FLOAT_VALUE: return VECTOR_OF_FLOAT;
			case VECTOR_OF_DOUBLE_VALUE: return VECTOR_OF_DOUBLE;
			case VECTOR_OF_SHORT_VALUE: return VECTOR_OF_SHORT;
			case VECTOR_OF_LONG_VALUE: return VECTOR_OF_LONG;
			case VECTOR_OF_UNSIGNED_CHAR_VALUE: return VECTOR_OF_UNSIGNED_CHAR;
			case VECTOR_OF_UNSIGNED_INT_VALUE: return VECTOR_OF_UNSIGNED_INT;
			case VECTOR_OF_UNSIGNED_FLOAT_VALUE: return VECTOR_OF_UNSIGNED_FLOAT;
			case VECTOR_OF_UNSIGNED_DOUBLE_VALUE: return VECTOR_OF_UNSIGNED_DOUBLE;
			case VECTOR_OF_UNSIGNED_SHORT_VALUE: return VECTOR_OF_UNSIGNED_SHORT;
			case VECTOR_OF_UNSIGNED_LONG_VALUE: return VECTOR_OF_UNSIGNED_LONG;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PortType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PortType
