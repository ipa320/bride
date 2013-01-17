/**
 */
package org.best.of.robotics.smachDSL.impl;

import org.best.of.robotics.smachDSL.ActionClient;
import org.best.of.robotics.smachDSL.SmachDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.ActionClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.ActionClientImpl#getActionname <em>Actionname</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.ActionClientImpl#getActiontype <em>Actiontype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionClientImpl extends MinimalEObjectImpl.Container implements ActionClient
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getActionname() <em>Actionname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionname()
   * @generated
   * @ordered
   */
  protected static final String ACTIONNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActionname() <em>Actionname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionname()
   * @generated
   * @ordered
   */
  protected String actionname = ACTIONNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getActiontype() <em>Actiontype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActiontype()
   * @generated
   * @ordered
   */
  protected static final String ACTIONTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActiontype() <em>Actiontype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActiontype()
   * @generated
   * @ordered
   */
  protected String actiontype = ACTIONTYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionClientImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SmachDSLPackage.Literals.ACTION_CLIENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.ACTION_CLIENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActionname()
  {
    return actionname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionname(String newActionname)
  {
    String oldActionname = actionname;
    actionname = newActionname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.ACTION_CLIENT__ACTIONNAME, oldActionname, actionname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActiontype()
  {
    return actiontype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActiontype(String newActiontype)
  {
    String oldActiontype = actiontype;
    actiontype = newActiontype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.ACTION_CLIENT__ACTIONTYPE, oldActiontype, actiontype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SmachDSLPackage.ACTION_CLIENT__NAME:
        return getName();
      case SmachDSLPackage.ACTION_CLIENT__ACTIONNAME:
        return getActionname();
      case SmachDSLPackage.ACTION_CLIENT__ACTIONTYPE:
        return getActiontype();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmachDSLPackage.ACTION_CLIENT__NAME:
        setName((String)newValue);
        return;
      case SmachDSLPackage.ACTION_CLIENT__ACTIONNAME:
        setActionname((String)newValue);
        return;
      case SmachDSLPackage.ACTION_CLIENT__ACTIONTYPE:
        setActiontype((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SmachDSLPackage.ACTION_CLIENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmachDSLPackage.ACTION_CLIENT__ACTIONNAME:
        setActionname(ACTIONNAME_EDEFAULT);
        return;
      case SmachDSLPackage.ACTION_CLIENT__ACTIONTYPE:
        setActiontype(ACTIONTYPE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SmachDSLPackage.ACTION_CLIENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmachDSLPackage.ACTION_CLIENT__ACTIONNAME:
        return ACTIONNAME_EDEFAULT == null ? actionname != null : !ACTIONNAME_EDEFAULT.equals(actionname);
      case SmachDSLPackage.ACTION_CLIENT__ACTIONTYPE:
        return ACTIONTYPE_EDEFAULT == null ? actiontype != null : !ACTIONTYPE_EDEFAULT.equals(actiontype);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", actionname: ");
    result.append(actionname);
    result.append(", actiontype: ");
    result.append(actiontype);
    result.append(')');
    return result.toString();
  }

} //ActionClientImpl
