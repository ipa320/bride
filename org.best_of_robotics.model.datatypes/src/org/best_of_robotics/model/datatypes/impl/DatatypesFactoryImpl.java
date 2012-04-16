/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes.impl;

import org.best_of_robotics.model.datatypes.Bool;
import org.best_of_robotics.model.datatypes.Char;
import org.best_of_robotics.model.datatypes.CustomType;
import org.best_of_robotics.model.datatypes.DatatypesFactory;
import org.best_of_robotics.model.datatypes.DatatypesPackage;
import org.best_of_robotics.model.datatypes.Field;
import org.best_of_robotics.model.datatypes.Int;
import org.best_of_robotics.model.datatypes.RosType;
import org.best_of_robotics.model.datatypes.TypesLibrary;
import org.best_of_robotics.model.datatypes.UnsignedChar;
import org.best_of_robotics.model.datatypes.UnsignedInt;
import org.best_of_robotics.model.datatypes.UnsignedLong;
import org.best_of_robotics.model.datatypes.UnsignedShort;
import org.best_of_robotics.model.datatypes.VectorType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesFactoryImpl extends EFactoryImpl implements DatatypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypesFactory init() {
		try {
			DatatypesFactory theDatatypesFactory = (DatatypesFactory)EPackage.Registry.INSTANCE.getEFactory("http://datatypes/1.0"); 
			if (theDatatypesFactory != null) {
				return theDatatypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatatypesPackage.TYPES_LIBRARY: return createTypesLibrary();
			case DatatypesPackage.ROS_TYPE: return createRosType();
			case DatatypesPackage.VECTOR_TYPE: return createVectorType();
			case DatatypesPackage.CUSTOM_TYPE: return createCustomType();
			case DatatypesPackage.FIELD: return createField();
			case DatatypesPackage.INT: return createInt();
			case DatatypesPackage.DOUBLE: return createDouble();
			case DatatypesPackage.CHAR: return createChar();
			case DatatypesPackage.FLOAT: return createFloat();
			case DatatypesPackage.SHORT: return createShort();
			case DatatypesPackage.STRING: return createString();
			case DatatypesPackage.LONG: return createLong();
			case DatatypesPackage.UNSIGNED_INT: return createUnsignedInt();
			case DatatypesPackage.UNSIGNED_CHAR: return createUnsignedChar();
			case DatatypesPackage.UNSIGNED_SHORT: return createUnsignedShort();
			case DatatypesPackage.UNSIGNED_LONG: return createUnsignedLong();
			case DatatypesPackage.BOOL: return createBool();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesLibrary createTypesLibrary() {
		TypesLibraryImpl typesLibrary = new TypesLibraryImpl();
		return typesLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosType createRosType() {
		RosTypeImpl rosType = new RosTypeImpl();
		return rosType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType createVectorType() {
		VectorTypeImpl vectorType = new VectorTypeImpl();
		return vectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomType createCustomType() {
		CustomTypeImpl customType = new CustomTypeImpl();
		return customType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int createInt() {
		IntImpl int_ = new IntImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.best_of_robotics.model.datatypes.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Char createChar() {
		CharImpl char_ = new CharImpl();
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.best_of_robotics.model.datatypes.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.best_of_robotics.model.datatypes.Short createShort() {
		ShortImpl short_ = new ShortImpl();
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.best_of_robotics.model.datatypes.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.best_of_robotics.model.datatypes.Long createLong() {
		LongImpl long_ = new LongImpl();
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt createUnsignedInt() {
		UnsignedIntImpl unsignedInt = new UnsignedIntImpl();
		return unsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedChar createUnsignedChar() {
		UnsignedCharImpl unsignedChar = new UnsignedCharImpl();
		return unsignedChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedShort createUnsignedShort() {
		UnsignedShortImpl unsignedShort = new UnsignedShortImpl();
		return unsignedShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedLong createUnsignedLong() {
		UnsignedLongImpl unsignedLong = new UnsignedLongImpl();
		return unsignedLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bool createBool() {
		BoolImpl bool = new BoolImpl();
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesPackage getDatatypesPackage() {
		return (DatatypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatypesPackage getPackage() {
		return DatatypesPackage.eINSTANCE;
	}

} //DatatypesFactoryImpl
