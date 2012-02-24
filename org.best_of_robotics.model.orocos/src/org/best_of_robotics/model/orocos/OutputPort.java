/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.orocos;

import org.best_of_robotics.model.datatypes.DataType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.orocos.OutputPort#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.OutputPort#getOutputConnectionPolicy <em>Output Connection Policy</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.OutputPort#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.orocos.OrocosPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends EObject {
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
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getOutputPort_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.OutputPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Output Connection Policy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Connection Policy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Connection Policy</em>' reference.
	 * @see #setOutputConnectionPolicy(ConnectionPolicy)
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getOutputPort_OutputConnectionPolicy()
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicy#getOutputPort
	 * @model opposite="outputPort" required="true"
	 * @generated
	 */
	ConnectionPolicy getOutputConnectionPolicy();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.OutputPort#getOutputConnectionPolicy <em>Output Connection Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Connection Policy</em>' reference.
	 * @see #getOutputConnectionPolicy()
	 * @generated
	 */
	void setOutputConnectionPolicy(ConnectionPolicy value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getOutputPort_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.OutputPort#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // OutputPort
