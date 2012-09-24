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
 * A representation of the literals of the enumeration '<em><b>Scheduler</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.best_of_robotics.model.orocos.OrocosPackage#getScheduler()
 * @model
 * @generated
 */
public enum Scheduler implements Enumerator {
	/**
	 * The '<em><b>ORO SCHED OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORO_SCHED_OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	ORO_SCHED_OTHER(0, "ORO_SCHED_OTHER", "ORO_SCHED_OTHER"),

	/**
	 * The '<em><b>ORO SCHED RT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORO_SCHED_RT_VALUE
	 * @generated
	 * @ordered
	 */
	ORO_SCHED_RT(1, "ORO_SCHED_RT", "ORO_SCHED_RT");

	/**
	 * The '<em><b>ORO SCHED OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORO SCHED OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORO_SCHED_OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORO_SCHED_OTHER_VALUE = 0;

	/**
	 * The '<em><b>ORO SCHED RT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORO SCHED RT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORO_SCHED_RT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORO_SCHED_RT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Scheduler</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Scheduler[] VALUES_ARRAY =
		new Scheduler[] {
			ORO_SCHED_OTHER,
			ORO_SCHED_RT,
		};

	/**
	 * A public read-only list of all the '<em><b>Scheduler</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Scheduler> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scheduler</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Scheduler get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scheduler result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduler</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Scheduler getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scheduler result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduler</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Scheduler get(int value) {
		switch (value) {
			case ORO_SCHED_OTHER_VALUE: return ORO_SCHED_OTHER;
			case ORO_SCHED_RT_VALUE: return ORO_SCHED_RT;
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
	private Scheduler(int value, String name, String literal) {
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
	
} //Scheduler
