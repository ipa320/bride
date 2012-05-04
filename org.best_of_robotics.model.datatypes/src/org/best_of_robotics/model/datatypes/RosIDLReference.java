/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros IDL Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.datatypes.RosIDLReference#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.RosIDLReference#getRosPackage <em>Ros Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getRosIDLReference()
 * @model
 * @generated
 */
public interface RosIDLReference extends IDLReference {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getRosIDLReference_Namespace()
	 * @model required="true"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.RosIDLReference#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Ros Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Package</em>' attribute.
	 * @see #setRosPackage(String)
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getRosIDLReference_RosPackage()
	 * @model required="true"
	 * @generated
	 */
	String getRosPackage();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.RosIDLReference#getRosPackage <em>Ros Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ros Package</em>' attribute.
	 * @see #getRosPackage()
	 * @generated
	 */
	void setRosPackage(String value);

} // RosIDLReference
