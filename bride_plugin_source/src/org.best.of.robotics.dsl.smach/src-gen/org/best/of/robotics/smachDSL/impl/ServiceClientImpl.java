/**
 */
package org.best.of.robotics.smachDSL.impl;

import org.best.of.robotics.smachDSL.ServiceClient;
import org.best.of.robotics.smachDSL.SmachDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.ServiceClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.ServiceClientImpl#getServicename <em>Servicename</em>}</li>
 *   <li>{@link org.best.of.robotics.smachDSL.impl.ServiceClientImpl#getServicesrv <em>Servicesrv</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceClientImpl extends MinimalEObjectImpl.Container implements ServiceClient
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
   * The default value of the '{@link #getServicename() <em>Servicename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicename()
   * @generated
   * @ordered
   */
  protected static final String SERVICENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServicename() <em>Servicename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicename()
   * @generated
   * @ordered
   */
  protected String servicename = SERVICENAME_EDEFAULT;

  /**
   * The default value of the '{@link #getServicesrv() <em>Servicesrv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicesrv()
   * @generated
   * @ordered
   */
  protected static final String SERVICESRV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServicesrv() <em>Servicesrv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicesrv()
   * @generated
   * @ordered
   */
  protected String servicesrv = SERVICESRV_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceClientImpl()
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
    return SmachDSLPackage.Literals.SERVICE_CLIENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.SERVICE_CLIENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServicename()
  {
    return servicename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServicename(String newServicename)
  {
    String oldServicename = servicename;
    servicename = newServicename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.SERVICE_CLIENT__SERVICENAME, oldServicename, servicename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServicesrv()
  {
    return servicesrv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServicesrv(String newServicesrv)
  {
    String oldServicesrv = servicesrv;
    servicesrv = newServicesrv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmachDSLPackage.SERVICE_CLIENT__SERVICESRV, oldServicesrv, servicesrv));
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
      case SmachDSLPackage.SERVICE_CLIENT__NAME:
        return getName();
      case SmachDSLPackage.SERVICE_CLIENT__SERVICENAME:
        return getServicename();
      case SmachDSLPackage.SERVICE_CLIENT__SERVICESRV:
        return getServicesrv();
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
      case SmachDSLPackage.SERVICE_CLIENT__NAME:
        setName((String)newValue);
        return;
      case SmachDSLPackage.SERVICE_CLIENT__SERVICENAME:
        setServicename((String)newValue);
        return;
      case SmachDSLPackage.SERVICE_CLIENT__SERVICESRV:
        setServicesrv((String)newValue);
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
      case SmachDSLPackage.SERVICE_CLIENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmachDSLPackage.SERVICE_CLIENT__SERVICENAME:
        setServicename(SERVICENAME_EDEFAULT);
        return;
      case SmachDSLPackage.SERVICE_CLIENT__SERVICESRV:
        setServicesrv(SERVICESRV_EDEFAULT);
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
      case SmachDSLPackage.SERVICE_CLIENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmachDSLPackage.SERVICE_CLIENT__SERVICENAME:
        return SERVICENAME_EDEFAULT == null ? servicename != null : !SERVICENAME_EDEFAULT.equals(servicename);
      case SmachDSLPackage.SERVICE_CLIENT__SERVICESRV:
        return SERVICESRV_EDEFAULT == null ? servicesrv != null : !SERVICESRV_EDEFAULT.equals(servicesrv);
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
    result.append(", servicename: ");
    result.append(servicename);
    result.append(", servicesrv: ");
    result.append(servicesrv);
    result.append(')');
    return result.toString();
  }

} //ServiceClientImpl
