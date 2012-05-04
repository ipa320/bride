/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.datatypes.CustomType#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getCustomType()
 * @model
 * @generated
 */
public interface CustomType extends ComplexType {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.datatypes.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getCustomType_Fields()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Field> getFields();

} // CustomType
