/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.orocos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.orocos.TaskContext#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.TaskContext#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.TaskContext#getType <em>Type</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.TaskContext#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.TaskContext#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.TaskContext#getProperty <em>Property</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.TaskContext#getOperacion <em>Operacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.orocos.OrocosPackage#getTaskContext()
 * @model
 * @generated
 */
public interface TaskContext extends EObject {
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
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getTaskContext_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.TaskContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getTaskContext_Namespace()
	 * @model required="true"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.TaskContext#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getTaskContext_Type()
	 * @model default="" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.TaskContext#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.orocos.InputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' containment reference list.
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getTaskContext_InputPort()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPort> getInputPort();

	/**
	 * Returns the value of the '<em><b>Output Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.orocos.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port</em>' containment reference list.
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getTaskContext_OutputPort()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPort> getOutputPort();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.orocos.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getTaskContext_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Operacion</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.orocos.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operacion</em>' containment reference list.
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getTaskContext_Operacion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperacion();

} // TaskContext
