/**
 */
package org.best.of.robotics.smachDSL.impl;

import org.best.of.robotics.smachDSL.SmachDSLPackage;
import org.best.of.robotics.smachDSL.Test;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.TestImpl#getRos <em>Ros</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestImpl extends MinimalEObjectImpl.Container implements Test
{
  /**
   * The default value of the '{@link #getRos() <em>Ros</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRos()
   * @generated
   * @ordered
   */
  protected static final String ROS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRos() <em>Ros</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRos()
   * @generated
   * @ordered
   */
  protected String ros = ROS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestImpl()
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
    return SmachDSLPackage.Literals.TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRos()
  {
    return ros;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRos(String newRos)
  {
    String oldRos = ros;
    ros = newRos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.TEST__ROS, oldRos, ros));
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
      case SmachDSLPackage.TEST__ROS:
        return getRos();
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
      case SmachDSLPackage.TEST__ROS:
        setRos((String)newValue);
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
      case SmachDSLPackage.TEST__ROS:
        setRos(ROS_EDEFAULT);
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
      case SmachDSLPackage.TEST__ROS:
        return ROS_EDEFAULT == null ? ros != null : !ROS_EDEFAULT.equals(ros);
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
    result.append(" (ros: ");
    result.append(ros);
    result.append(')');
    return result.toString();
  }

} //TestImpl
