/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.research.brsu.comm.communicationmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.research.brsu.comm.communicationmodel.Protocol#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.research.brsu.comm.communicationmodel.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.best_of_robotics.research.brsu.comm.communicationmodel.CommunicationmodelPackage#getProtocol_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // Protocol
