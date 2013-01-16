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
 *   <li>{@link org.best.of.robotics.smachDSL.impl.ActionClientImpl#getActioname <em>Actioname</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.ActionClientImpl#getActiotype <em>Actiotype</em>}</li>
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
   * The default value of the '{@link #getActioname() <em>Actioname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActioname()
   * @generated
   * @ordered
   */
  protected static final String ACTIONAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActioname() <em>Actioname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActioname()
   * @generated
   * @ordered
   */
  protected String actioname = ACTIONAME_EDEFAULT;

  /**
   * The default value of the '{@link #getActiotype() <em>Actiotype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActiotype()
   * @generated
   * @ordered
   */
  protected static final String ACTIOTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActiotype() <em>Actiotype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActiotype()
   * @generated
   * @ordered
   */
  protected String actiotype = ACTIOTYPE_EDEFAULT;

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
  public String getActioname()
  {
    return actioname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActioname(String newActioname)
  {
    String oldActioname = actioname;
    actioname = newActioname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.ACTION_CLIENT__ACTIONAME, oldActioname, actioname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActiotype()
  {
    return actiotype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActiotype(String newActiotype)
  {
    String oldActiotype = actiotype;
    actiotype = newActiotype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.ACTION_CLIENT__ACTIOTYPE, oldActiotype, actiotype));
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
      case SmachDSLPackage.ACTION_CLIENT__ACTIONAME:
        return getActioname();
      case SmachDSLPackage.ACTION_CLIENT__ACTIOTYPE:
        return getActiotype();
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
      case SmachDSLPackage.ACTION_CLIENT__ACTIONAME:
        setActioname((String)newValue);
        return;
      case SmachDSLPackage.ACTION_CLIENT__ACTIOTYPE:
        setActiotype((String)newValue);
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
      case SmachDSLPackage.ACTION_CLIENT__ACTIONAME:
        setActioname(ACTIONAME_EDEFAULT);
        return;
      case SmachDSLPackage.ACTION_CLIENT__ACTIOTYPE:
        setActiotype(ACTIOTYPE_EDEFAULT);
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
      case SmachDSLPackage.ACTION_CLIENT__ACTIONAME:
        return ACTIONAME_EDEFAULT == null ? actioname != null : !ACTIONAME_EDEFAULT.equals(actioname);
      case SmachDSLPackage.ACTION_CLIENT__ACTIOTYPE:
        return ACTIOTYPE_EDEFAULT == null ? actiotype != null : !ACTIOTYPE_EDEFAULT.equals(actiotype);
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
    result.append(", actioname: ");
    result.append(actioname);
    result.append(", actiotype: ");
    result.append(actiotype);
    result.append(')');
    return result.toString();
  }

} //ActionClientImpl
