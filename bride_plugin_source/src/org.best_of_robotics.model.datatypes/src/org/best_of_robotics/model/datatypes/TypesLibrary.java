/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes;

import java.lang.String;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getTypes <em>Types</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getName <em>Name</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.TypesLibrary#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary()
 * @model
 * @generated
 */
public interface TypesLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.datatypes.DataType}.
	 * It is bidirectional and its opposite is '{@link org.best_of_robotics.model.datatypes.DataType#getTypesLibrary <em>Types Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Types()
	 * @see org.best_of_robotics.model.datatypes.DataType#getTypesLibrary
	 * @model opposite="typesLibrary" containment="true"
	 * @generated
	 */
	EList<DataType> getTypes();

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
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.best_of_robotics.model.datatypes.TypesLibrary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link org.best_of_robotics.model.datatypes.TypesLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see org.best_of_robotics.model.datatypes.DatatypesPackage#getTypesLibrary_Includes()
	 * @model
	 * @generated
	 */
	EList<TypesLibrary> getIncludes();

} // TypesLibrary
