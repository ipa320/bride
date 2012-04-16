/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.best_of_robotics.model.datatypes.DatatypesPackage
 * @generated
 */
public interface DatatypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesFactory eINSTANCE = org.best_of_robotics.model.datatypes.impl.DatatypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Types Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types Library</em>'.
	 * @generated
	 */
	TypesLibrary createTypesLibrary();

	/**
	 * Returns a new object of class '<em>Ros Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Type</em>'.
	 * @generated
	 */
	RosType createRosType();

	/**
	 * Returns a new object of class '<em>Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector Type</em>'.
	 * @generated
	 */
	VectorType createVectorType();

	/**
	 * Returns a new object of class '<em>Custom Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Type</em>'.
	 * @generated
	 */
	CustomType createCustomType();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int</em>'.
	 * @generated
	 */
	Int createInt();

	/**
	 * Returns a new object of class '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double</em>'.
	 * @generated
	 */
	Double createDouble();

	/**
	 * Returns a new object of class '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char</em>'.
	 * @generated
	 */
	Char createChar();

	/**
	 * Returns a new object of class '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float</em>'.
	 * @generated
	 */
	Float createFloat();

	/**
	 * Returns a new object of class '<em>Short</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short</em>'.
	 * @generated
	 */
	Short createShort();

	/**
	 * Returns a new object of class '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String</em>'.
	 * @generated
	 */
	String createString();

	/**
	 * Returns a new object of class '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long</em>'.
	 * @generated
	 */
	Long createLong();

	/**
	 * Returns a new object of class '<em>Unsigned Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsigned Int</em>'.
	 * @generated
	 */
	UnsignedInt createUnsignedInt();

	/**
	 * Returns a new object of class '<em>Unsigned Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsigned Char</em>'.
	 * @generated
	 */
	UnsignedChar createUnsignedChar();

	/**
	 * Returns a new object of class '<em>Unsigned Short</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsigned Short</em>'.
	 * @generated
	 */
	UnsignedShort createUnsignedShort();

	/**
	 * Returns a new object of class '<em>Unsigned Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsigned Long</em>'.
	 * @generated
	 */
	UnsignedLong createUnsignedLong();

	/**
	 * Returns a new object of class '<em>Bool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool</em>'.
	 * @generated
	 */
	Bool createBool();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatatypesPackage getDatatypesPackage();

} //DatatypesFactory
