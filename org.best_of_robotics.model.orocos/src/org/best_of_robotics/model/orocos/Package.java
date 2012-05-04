/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.orocos;

import org.best_of_robotics.model.datatypes.TypesLibrary;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.orocos.Package#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.Package#getTaskContext <em>Task Context</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.Package#getConnectionPolicy <em>Connection Policy</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.Package#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.Package#getTypesLibrary <em>Types Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.orocos.OrocosPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Task Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.orocos.TaskContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Context</em>' containment reference list.
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getPackage_TaskContext()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskContext> getTaskContext();

	/**
	 * Returns the value of the '<em><b>Connection Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.orocos.ConnectionPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Policy</em>' containment reference list.
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getPackage_ConnectionPolicy()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionPolicy> getConnectionPolicy();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.orocos.IActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getPackage_Activity()
	 * @model containment="true"
	 * @generated
	 */
	EList<IActivity> getActivity();

	/**
	 * Returns the value of the '<em><b>Types Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Library</em>' reference.
	 * @see #setTypesLibrary(TypesLibrary)
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getPackage_TypesLibrary()
	 * @model
	 * @generated
	 */
	TypesLibrary getTypesLibrary();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.Package#getTypesLibrary <em>Types Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types Library</em>' reference.
	 * @see #getTypesLibrary()
	 * @generated
	 */
	void setTypesLibrary(TypesLibrary value);

} // Package
