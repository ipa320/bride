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
 * A representation of the model object '<em><b>Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Transport#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage#getTransport()
 * @model
 * @generated
 */
public interface Transport extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(Protocol)
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage#getTransport_Protocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Transport#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

} // Transport
