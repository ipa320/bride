/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes.impl;

import java.util.Collection;

import org.best_of_robotics.model.datatypes.Bool;
import org.best_of_robotics.model.datatypes.Char;
import org.best_of_robotics.model.datatypes.ComplexType;
import org.best_of_robotics.model.datatypes.DatatypesPackage;
import org.best_of_robotics.model.datatypes.Int;
import org.best_of_robotics.model.datatypes.TypesLibrary;
import org.best_of_robotics.model.datatypes.UnsignedChar;
import org.best_of_robotics.model.datatypes.UnsignedDouble;
import org.best_of_robotics.model.datatypes.UnsignedFloat;
import org.best_of_robotics.model.datatypes.UnsignedInt;
import org.best_of_robotics.model.datatypes.UnsignedLong;
import org.best_of_robotics.model.datatypes.UnsignedShort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getChar <em>Char</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getDouble <em>Double</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getLong <em>Long</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getShort <em>Short</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getString <em>String</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getUnsignedChar <em>Unsigned Char</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getUnsignedDouble <em>Unsigned Double</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getUnsignedFloat <em>Unsigned Float</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getUnsignedInt <em>Unsigned Int</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getUnsignedLong <em>Unsigned Long</em>}</li>
 *   <li>{@link org.best_of_robotics.model.datatypes.impl.TypesLibraryImpl#getUnsignedShort <em>Unsigned Short</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypesLibraryImpl extends EObjectImpl implements TypesLibrary {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexType> types;

	/**
	 * The cached value of the '{@link #getBool() <em>Bool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBool()
	 * @generated
	 * @ordered
	 */
	protected Bool bool;

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected Char char_;

	/**
	 * The cached value of the '{@link #getDouble() <em>Double</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected org.best_of_robotics.model.datatypes.Double double_;

	/**
	 * The cached value of the '{@link #getFloat() <em>Float</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected org.best_of_robotics.model.datatypes.Float float_;

	/**
	 * The cached value of the '{@link #getInt() <em>Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt()
	 * @generated
	 * @ordered
	 */
	protected Int int_;

	/**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected org.best_of_robotics.model.datatypes.Long long_;

	/**
	 * The cached value of the '{@link #getShort() <em>Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort()
	 * @generated
	 * @ordered
	 */
	protected org.best_of_robotics.model.datatypes.Short short_;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected org.best_of_robotics.model.datatypes.String string;

	/**
	 * The cached value of the '{@link #getUnsignedChar() <em>Unsigned Char</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsignedChar()
	 * @generated
	 * @ordered
	 */
	protected UnsignedChar unsignedChar;

	/**
	 * The cached value of the '{@link #getUnsignedDouble() <em>Unsigned Double</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsignedDouble()
	 * @generated
	 * @ordered
	 */
	protected UnsignedDouble unsignedDouble;

	/**
	 * The cached value of the '{@link #getUnsignedFloat() <em>Unsigned Float</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsignedFloat()
	 * @generated
	 * @ordered
	 */
	protected UnsignedFloat unsignedFloat;

	/**
	 * The cached value of the '{@link #getUnsignedInt() <em>Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt unsignedInt;

	/**
	 * The cached value of the '{@link #getUnsignedLong() <em>Unsigned Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsignedLong()
	 * @generated
	 * @ordered
	 */
	protected UnsignedLong unsignedLong;

	/**
	 * The cached value of the '{@link #getUnsignedShort() <em>Unsigned Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsignedShort()
	 * @generated
	 * @ordered
	 */
	protected UnsignedShort unsignedShort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.TYPES_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<ComplexType>(ComplexType.class, this, DatatypesPackage.TYPES_LIBRARY__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bool getBool() {
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBool(Bool newBool, NotificationChain msgs) {
		Bool oldBool = bool;
		bool = newBool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__BOOL, oldBool, newBool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBool(Bool newBool) {
		if (newBool != bool) {
			NotificationChain msgs = null;
			if (bool != null)
				msgs = ((InternalEObject)bool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__BOOL, null, msgs);
			if (newBool != null)
				msgs = ((InternalEObject)newBool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__BOOL, null, msgs);
			msgs = basicSetBool(newBool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__BOOL, newBool, newBool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Char getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChar(Char newChar, NotificationChain msgs) {
		Char oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__CHAR, oldChar, newChar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChar(Char newChar) {
		if (newChar != char_) {
			NotificationChain msgs = null;
			if (char_ != null)
				msgs = ((InternalEObject)char_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__CHAR, null, msgs);
			if (newChar != null)
				msgs = ((InternalEObject)newChar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__CHAR, null, msgs);
			msgs = basicSetChar(newChar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__CHAR, newChar, newChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.best_of_robotics.model.datatypes.Double getDouble() {
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDouble(org.best_of_robotics.model.datatypes.Double newDouble, NotificationChain msgs) {
		org.best_of_robotics.model.datatypes.Double oldDouble = double_;
		double_ = newDouble;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__DOUBLE, oldDouble, newDouble);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble(org.best_of_robotics.model.datatypes.Double newDouble) {
		if (newDouble != double_) {
			NotificationChain msgs = null;
			if (double_ != null)
				msgs = ((InternalEObject)double_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__DOUBLE, null, msgs);
			if (newDouble != null)
				msgs = ((InternalEObject)newDouble).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__DOUBLE, null, msgs);
			msgs = basicSetDouble(newDouble, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__DOUBLE, newDouble, newDouble));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.best_of_robotics.model.datatypes.Float getFloat() {
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloat(org.best_of_robotics.model.datatypes.Float newFloat, NotificationChain msgs) {
		org.best_of_robotics.model.datatypes.Float oldFloat = float_;
		float_ = newFloat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__FLOAT, oldFloat, newFloat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat(org.best_of_robotics.model.datatypes.Float newFloat) {
		if (newFloat != float_) {
			NotificationChain msgs = null;
			if (float_ != null)
				msgs = ((InternalEObject)float_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__FLOAT, null, msgs);
			if (newFloat != null)
				msgs = ((InternalEObject)newFloat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__FLOAT, null, msgs);
			msgs = basicSetFloat(newFloat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__FLOAT, newFloat, newFloat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int getInt() {
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInt(Int newInt, NotificationChain msgs) {
		Int oldInt = int_;
		int_ = newInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__INT, oldInt, newInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt(Int newInt) {
		if (newInt != int_) {
			NotificationChain msgs = null;
			if (int_ != null)
				msgs = ((InternalEObject)int_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__INT, null, msgs);
			if (newInt != null)
				msgs = ((InternalEObject)newInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__INT, null, msgs);
			msgs = basicSetInt(newInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__INT, newInt, newInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.best_of_robotics.model.datatypes.Long getLong() {
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLong(org.best_of_robotics.model.datatypes.Long newLong, NotificationChain msgs) {
		org.best_of_robotics.model.datatypes.Long oldLong = long_;
		long_ = newLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__LONG, oldLong, newLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong(org.best_of_robotics.model.datatypes.Long newLong) {
		if (newLong != long_) {
			NotificationChain msgs = null;
			if (long_ != null)
				msgs = ((InternalEObject)long_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__LONG, null, msgs);
			if (newLong != null)
				msgs = ((InternalEObject)newLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__LONG, null, msgs);
			msgs = basicSetLong(newLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__LONG, newLong, newLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.best_of_robotics.model.datatypes.Short getShort() {
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShort(org.best_of_robotics.model.datatypes.Short newShort, NotificationChain msgs) {
		org.best_of_robotics.model.datatypes.Short oldShort = short_;
		short_ = newShort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__SHORT, oldShort, newShort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShort(org.best_of_robotics.model.datatypes.Short newShort) {
		if (newShort != short_) {
			NotificationChain msgs = null;
			if (short_ != null)
				msgs = ((InternalEObject)short_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__SHORT, null, msgs);
			if (newShort != null)
				msgs = ((InternalEObject)newShort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__SHORT, null, msgs);
			msgs = basicSetShort(newShort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__SHORT, newShort, newShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.best_of_robotics.model.datatypes.String getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetString(org.best_of_robotics.model.datatypes.String newString, NotificationChain msgs) {
		org.best_of_robotics.model.datatypes.String oldString = string;
		string = newString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__STRING, oldString, newString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(org.best_of_robotics.model.datatypes.String newString) {
		if (newString != string) {
			NotificationChain msgs = null;
			if (string != null)
				msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__STRING, null, msgs);
			if (newString != null)
				msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__STRING, null, msgs);
			msgs = basicSetString(newString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__STRING, newString, newString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedChar getUnsignedChar() {
		return unsignedChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsignedChar(UnsignedChar newUnsignedChar, NotificationChain msgs) {
		UnsignedChar oldUnsignedChar = unsignedChar;
		unsignedChar = newUnsignedChar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_CHAR, oldUnsignedChar, newUnsignedChar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsignedChar(UnsignedChar newUnsignedChar) {
		if (newUnsignedChar != unsignedChar) {
			NotificationChain msgs = null;
			if (unsignedChar != null)
				msgs = ((InternalEObject)unsignedChar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_CHAR, null, msgs);
			if (newUnsignedChar != null)
				msgs = ((InternalEObject)newUnsignedChar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_CHAR, null, msgs);
			msgs = basicSetUnsignedChar(newUnsignedChar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_CHAR, newUnsignedChar, newUnsignedChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedDouble getUnsignedDouble() {
		return unsignedDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsignedDouble(UnsignedDouble newUnsignedDouble, NotificationChain msgs) {
		UnsignedDouble oldUnsignedDouble = unsignedDouble;
		unsignedDouble = newUnsignedDouble;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_DOUBLE, oldUnsignedDouble, newUnsignedDouble);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsignedDouble(UnsignedDouble newUnsignedDouble) {
		if (newUnsignedDouble != unsignedDouble) {
			NotificationChain msgs = null;
			if (unsignedDouble != null)
				msgs = ((InternalEObject)unsignedDouble).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_DOUBLE, null, msgs);
			if (newUnsignedDouble != null)
				msgs = ((InternalEObject)newUnsignedDouble).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_DOUBLE, null, msgs);
			msgs = basicSetUnsignedDouble(newUnsignedDouble, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_DOUBLE, newUnsignedDouble, newUnsignedDouble));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedFloat getUnsignedFloat() {
		return unsignedFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsignedFloat(UnsignedFloat newUnsignedFloat, NotificationChain msgs) {
		UnsignedFloat oldUnsignedFloat = unsignedFloat;
		unsignedFloat = newUnsignedFloat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_FLOAT, oldUnsignedFloat, newUnsignedFloat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsignedFloat(UnsignedFloat newUnsignedFloat) {
		if (newUnsignedFloat != unsignedFloat) {
			NotificationChain msgs = null;
			if (unsignedFloat != null)
				msgs = ((InternalEObject)unsignedFloat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_FLOAT, null, msgs);
			if (newUnsignedFloat != null)
				msgs = ((InternalEObject)newUnsignedFloat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_FLOAT, null, msgs);
			msgs = basicSetUnsignedFloat(newUnsignedFloat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_FLOAT, newUnsignedFloat, newUnsignedFloat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getUnsignedInt() {
		return unsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsignedInt(UnsignedInt newUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldUnsignedInt = unsignedInt;
		unsignedInt = newUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_INT, oldUnsignedInt, newUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsignedInt(UnsignedInt newUnsignedInt) {
		if (newUnsignedInt != unsignedInt) {
			NotificationChain msgs = null;
			if (unsignedInt != null)
				msgs = ((InternalEObject)unsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_INT, null, msgs);
			if (newUnsignedInt != null)
				msgs = ((InternalEObject)newUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_INT, null, msgs);
			msgs = basicSetUnsignedInt(newUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_INT, newUnsignedInt, newUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedLong getUnsignedLong() {
		return unsignedLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsignedLong(UnsignedLong newUnsignedLong, NotificationChain msgs) {
		UnsignedLong oldUnsignedLong = unsignedLong;
		unsignedLong = newUnsignedLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_LONG, oldUnsignedLong, newUnsignedLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsignedLong(UnsignedLong newUnsignedLong) {
		if (newUnsignedLong != unsignedLong) {
			NotificationChain msgs = null;
			if (unsignedLong != null)
				msgs = ((InternalEObject)unsignedLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_LONG, null, msgs);
			if (newUnsignedLong != null)
				msgs = ((InternalEObject)newUnsignedLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_LONG, null, msgs);
			msgs = basicSetUnsignedLong(newUnsignedLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_LONG, newUnsignedLong, newUnsignedLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedShort getUnsignedShort() {
		return unsignedShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsignedShort(UnsignedShort newUnsignedShort, NotificationChain msgs) {
		UnsignedShort oldUnsignedShort = unsignedShort;
		unsignedShort = newUnsignedShort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_SHORT, oldUnsignedShort, newUnsignedShort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsignedShort(UnsignedShort newUnsignedShort) {
		if (newUnsignedShort != unsignedShort) {
			NotificationChain msgs = null;
			if (unsignedShort != null)
				msgs = ((InternalEObject)unsignedShort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_SHORT, null, msgs);
			if (newUnsignedShort != null)
				msgs = ((InternalEObject)newUnsignedShort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TYPES_LIBRARY__UNSIGNED_SHORT, null, msgs);
			msgs = basicSetUnsignedShort(newUnsignedShort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TYPES_LIBRARY__UNSIGNED_SHORT, newUnsignedShort, newUnsignedShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case DatatypesPackage.TYPES_LIBRARY__BOOL:
				return basicSetBool(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__CHAR:
				return basicSetChar(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__DOUBLE:
				return basicSetDouble(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__FLOAT:
				return basicSetFloat(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__INT:
				return basicSetInt(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__LONG:
				return basicSetLong(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__SHORT:
				return basicSetShort(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__STRING:
				return basicSetString(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_CHAR:
				return basicSetUnsignedChar(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_DOUBLE:
				return basicSetUnsignedDouble(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_FLOAT:
				return basicSetUnsignedFloat(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_INT:
				return basicSetUnsignedInt(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_LONG:
				return basicSetUnsignedLong(null, msgs);
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_SHORT:
				return basicSetUnsignedShort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
				return getTypes();
			case DatatypesPackage.TYPES_LIBRARY__BOOL:
				return getBool();
			case DatatypesPackage.TYPES_LIBRARY__CHAR:
				return getChar();
			case DatatypesPackage.TYPES_LIBRARY__DOUBLE:
				return getDouble();
			case DatatypesPackage.TYPES_LIBRARY__FLOAT:
				return getFloat();
			case DatatypesPackage.TYPES_LIBRARY__INT:
				return getInt();
			case DatatypesPackage.TYPES_LIBRARY__LONG:
				return getLong();
			case DatatypesPackage.TYPES_LIBRARY__SHORT:
				return getShort();
			case DatatypesPackage.TYPES_LIBRARY__STRING:
				return getString();
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_CHAR:
				return getUnsignedChar();
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_DOUBLE:
				return getUnsignedDouble();
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_FLOAT:
				return getUnsignedFloat();
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_INT:
				return getUnsignedInt();
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_LONG:
				return getUnsignedLong();
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_SHORT:
				return getUnsignedShort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends ComplexType>)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__BOOL:
				setBool((Bool)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__CHAR:
				setChar((Char)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__DOUBLE:
				setDouble((org.best_of_robotics.model.datatypes.Double)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__FLOAT:
				setFloat((org.best_of_robotics.model.datatypes.Float)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__INT:
				setInt((Int)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__LONG:
				setLong((org.best_of_robotics.model.datatypes.Long)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__SHORT:
				setShort((org.best_of_robotics.model.datatypes.Short)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__STRING:
				setString((org.best_of_robotics.model.datatypes.String)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_CHAR:
				setUnsignedChar((UnsignedChar)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_DOUBLE:
				setUnsignedDouble((UnsignedDouble)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_FLOAT:
				setUnsignedFloat((UnsignedFloat)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_INT:
				setUnsignedInt((UnsignedInt)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_LONG:
				setUnsignedLong((UnsignedLong)newValue);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_SHORT:
				setUnsignedShort((UnsignedShort)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
				getTypes().clear();
				return;
			case DatatypesPackage.TYPES_LIBRARY__BOOL:
				setBool((Bool)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__CHAR:
				setChar((Char)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__DOUBLE:
				setDouble((org.best_of_robotics.model.datatypes.Double)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__FLOAT:
				setFloat((org.best_of_robotics.model.datatypes.Float)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__INT:
				setInt((Int)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__LONG:
				setLong((org.best_of_robotics.model.datatypes.Long)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__SHORT:
				setShort((org.best_of_robotics.model.datatypes.Short)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__STRING:
				setString((org.best_of_robotics.model.datatypes.String)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_CHAR:
				setUnsignedChar((UnsignedChar)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_DOUBLE:
				setUnsignedDouble((UnsignedDouble)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_FLOAT:
				setUnsignedFloat((UnsignedFloat)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_INT:
				setUnsignedInt((UnsignedInt)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_LONG:
				setUnsignedLong((UnsignedLong)null);
				return;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_SHORT:
				setUnsignedShort((UnsignedShort)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatatypesPackage.TYPES_LIBRARY__TYPES:
				return types != null && !types.isEmpty();
			case DatatypesPackage.TYPES_LIBRARY__BOOL:
				return bool != null;
			case DatatypesPackage.TYPES_LIBRARY__CHAR:
				return char_ != null;
			case DatatypesPackage.TYPES_LIBRARY__DOUBLE:
				return double_ != null;
			case DatatypesPackage.TYPES_LIBRARY__FLOAT:
				return float_ != null;
			case DatatypesPackage.TYPES_LIBRARY__INT:
				return int_ != null;
			case DatatypesPackage.TYPES_LIBRARY__LONG:
				return long_ != null;
			case DatatypesPackage.TYPES_LIBRARY__SHORT:
				return short_ != null;
			case DatatypesPackage.TYPES_LIBRARY__STRING:
				return string != null;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_CHAR:
				return unsignedChar != null;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_DOUBLE:
				return unsignedDouble != null;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_FLOAT:
				return unsignedFloat != null;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_INT:
				return unsignedInt != null;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_LONG:
				return unsignedLong != null;
			case DatatypesPackage.TYPES_LIBRARY__UNSIGNED_SHORT:
				return unsignedShort != null;
		}
		return super.eIsSet(featureID);
	}

} //TypesLibraryImpl
