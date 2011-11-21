/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.research.brsu.comm.communicationmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getTransport <em>Transport</em>}</li>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getSource <em>Source</em>}</li>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' containment reference.
	 * @see #setDistribution(Distribution)
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage#getConnector_Distribution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Distribution getDistribution();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getDistribution <em>Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' containment reference.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(Distribution value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference.
	 * @see #setInteraction(Interaction)
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage#getConnector_Interaction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getInteraction <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' containment reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport</em>' containment reference.
	 * @see #setTransport(Transport)
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage#getConnector_Transport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Transport getTransport();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getTransport <em>Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport</em>' containment reference.
	 * @see #getTransport()
	 * @generated
	 */
	void setTransport(Transport value);

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
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage#getConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Port)
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage#getConnector_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Port getSource();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Port value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Port)
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage#getConnector_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Port getTarget();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Connector#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Port value);

} // Connector
