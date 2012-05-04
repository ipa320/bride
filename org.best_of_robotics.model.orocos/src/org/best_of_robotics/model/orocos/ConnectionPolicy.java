/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.orocos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.orocos.OrocosPackage#getConnectionPolicy()
 * @model
 * @generated
 */
public interface ConnectionPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.best_of_robotics.model.orocos.InputPort#getInputConnectionPolicy <em>Input Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' reference.
	 * @see #setInputPort(InputPort)
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getConnectionPolicy_InputPort()
	 * @see org.best_of_robotics.model.orocos.InputPort#getInputConnectionPolicy
	 * @model opposite="inputConnectionPolicy" required="true"
	 * @generated
	 */
	InputPort getInputPort();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getInputPort <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(InputPort value);

	/**
	 * Returns the value of the '<em><b>Output Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.best_of_robotics.model.orocos.OutputPort#getOutputConnectionPolicy <em>Output Connection Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port</em>' reference.
	 * @see #setOutputPort(OutputPort)
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getConnectionPolicy_OutputPort()
	 * @see org.best_of_robotics.model.orocos.OutputPort#getOutputConnectionPolicy
	 * @model opposite="outputConnectionPolicy" required="true"
	 * @generated
	 */
	OutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getOutputPort <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(OutputPort value);

	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(short)
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getConnectionPolicy_BufferSize()
	 * @model
	 * @generated
	 */
	short getBufferSize();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(short value);

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
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getConnectionPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lock Policy</b></em>' attribute.
	 * The default value is <code>"LOCK_FREE"</code>.
	 * The literals are from the enumeration {@link org.best_of_robotics.model.orocos.ConnectionPolicyLockPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Policy</em>' attribute.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicyLockPolicy
	 * @see #setLockPolicy(ConnectionPolicyLockPolicy)
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getConnectionPolicy_LockPolicy()
	 * @model default="LOCK_FREE"
	 * @generated
	 */
	ConnectionPolicyLockPolicy getLockPolicy();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getLockPolicy <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Policy</em>' attribute.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicyLockPolicy
	 * @see #getLockPolicy()
	 * @generated
	 */
	void setLockPolicy(ConnectionPolicyLockPolicy value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"DATA"</code>.
	 * The literals are from the enumeration {@link org.best_of_robotics.model.orocos.ConnectionPolicyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicyType
	 * @see #setType(ConnectionPolicyType)
	 * @see org.best_of_robotics.model.orocos.OrocosPackage#getConnectionPolicy_Type()
	 * @model default="DATA"
	 * @generated
	 */
	ConnectionPolicyType getType();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.orocos.ConnectionPolicy#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.best_of_robotics.model.orocos.ConnectionPolicyType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectionPolicyType value);

} // ConnectionPolicy
