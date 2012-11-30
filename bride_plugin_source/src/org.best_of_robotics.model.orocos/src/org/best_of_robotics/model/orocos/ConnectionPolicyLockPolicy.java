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
 * A representation of the literals of the enumeration '<em><b>Connection Policy Lock Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.best_of_robotics.model.orocos.OrocosPackage#getConnectionPolicyLockPolicy()
 * @model
 * @generated
 */
public enum ConnectionPolicyLockPolicy implements Enumerator {
	/**
	 * The '<em><b>UNSYNC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSYNC_VALUE
	 * @generated
	 * @ordered
	 */
	UNSYNC(0, "UNSYNC", "UNSYNC"),

	/**
	 * The '<em><b>LOCKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	LOCKED(1, "LOCKED", "LOCKED"),

	/**
	 * The '<em><b>LOCK FREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCK_FREE_VALUE
	 * @generated
	 * @ordered
	 */
	LOCK_FREE(2, "LOCK_FREE", "LOCK_FREE");

	/**
	 * The '<em><b>UNSYNC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSYNC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSYNC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSYNC_VALUE = 0;

	/**
	 * The '<em><b>LOCKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCKED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCKED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCKED_VALUE = 1;

	/**
	 * The '<em><b>LOCK FREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCK FREE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCK_FREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCK_FREE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Connection Policy Lock Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConnectionPolicyLockPolicy[] VALUES_ARRAY =
		new ConnectionPolicyLockPolicy[] {
			UNSYNC,
			LOCKED,
			LOCK_FREE,
		};

	/**
	 * A public read-only list of all the '<em><b>Connection Policy Lock Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConnectionPolicyLockPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connection Policy Lock Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectionPolicyLockPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectionPolicyLockPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connection Policy Lock Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectionPolicyLockPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectionPolicyLockPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connection Policy Lock Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectionPolicyLockPolicy get(int value) {
		switch (value) {
			case UNSYNC_VALUE: return UNSYNC;
			case LOCKED_VALUE: return LOCKED;
			case LOCK_FREE_VALUE: return LOCK_FREE;
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
	private ConnectionPolicyLockPolicy(int value, String name, String literal) {
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
	
} //ConnectionPolicyLockPolicy
