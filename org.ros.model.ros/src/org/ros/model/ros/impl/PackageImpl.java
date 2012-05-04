/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ros.model.ros.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ros.model.ros.Node;
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.Service;
import org.ros.model.ros.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ros.model.ros.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PackageImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PackageImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PackageImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PackageImpl#getDepend <em>Depend</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PackageImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PackageImpl#getRosdep <em>Rosdep</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PackageImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.ros.model.ros.impl.PackageImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends EObjectImpl implements org.ros.model.ros.Package {
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
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepend() <em>Depend</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepend()
	 * @generated
	 * @ordered
	 */
	protected EList<String> depend;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRosdep() <em>Rosdep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosdep()
	 * @generated
	 * @ordered
	 */
	protected static final String ROSDEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRosdep() <em>Rosdep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosdep()
	 * @generated
	 * @ordered
	 */
	protected String rosdep = ROSDEP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topic;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, RosPackage.PACKAGE__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PACKAGE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PACKAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PACKAGE__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDepend() {
		if (depend == null) {
			depend = new EDataTypeUniqueEList<String>(String.class, this, RosPackage.PACKAGE__DEPEND);
		}
		return depend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PACKAGE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRosdep() {
		return rosdep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRosdep(String newRosdep) {
		String oldRosdep = rosdep;
		rosdep = newRosdep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PACKAGE__ROSDEP, oldRosdep, rosdep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<Topic>(Topic.class, this, RosPackage.PACKAGE__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, RosPackage.PACKAGE__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RosPackage.PACKAGE__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case RosPackage.PACKAGE__TOPIC:
				return ((InternalEList<?>)getTopic()).basicRemove(otherEnd, msgs);
			case RosPackage.PACKAGE__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
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
			case RosPackage.PACKAGE__NAME:
				return getName();
			case RosPackage.PACKAGE__NODE:
				return getNode();
			case RosPackage.PACKAGE__AUTHOR:
				return getAuthor();
			case RosPackage.PACKAGE__DESCRIPTION:
				return getDescription();
			case RosPackage.PACKAGE__LICENSE:
				return getLicense();
			case RosPackage.PACKAGE__DEPEND:
				return getDepend();
			case RosPackage.PACKAGE__URL:
				return getUrl();
			case RosPackage.PACKAGE__ROSDEP:
				return getRosdep();
			case RosPackage.PACKAGE__TOPIC:
				return getTopic();
			case RosPackage.PACKAGE__SERVICE:
				return getService();
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
			case RosPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case RosPackage.PACKAGE__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case RosPackage.PACKAGE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case RosPackage.PACKAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RosPackage.PACKAGE__LICENSE:
				setLicense((String)newValue);
				return;
			case RosPackage.PACKAGE__DEPEND:
				getDepend().clear();
				getDepend().addAll((Collection<? extends String>)newValue);
				return;
			case RosPackage.PACKAGE__URL:
				setUrl((String)newValue);
				return;
			case RosPackage.PACKAGE__ROSDEP:
				setRosdep((String)newValue);
				return;
			case RosPackage.PACKAGE__TOPIC:
				getTopic().clear();
				getTopic().addAll((Collection<? extends Topic>)newValue);
				return;
			case RosPackage.PACKAGE__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
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
			case RosPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RosPackage.PACKAGE__NODE:
				getNode().clear();
				return;
			case RosPackage.PACKAGE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case RosPackage.PACKAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RosPackage.PACKAGE__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case RosPackage.PACKAGE__DEPEND:
				getDepend().clear();
				return;
			case RosPackage.PACKAGE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case RosPackage.PACKAGE__ROSDEP:
				setRosdep(ROSDEP_EDEFAULT);
				return;
			case RosPackage.PACKAGE__TOPIC:
				getTopic().clear();
				return;
			case RosPackage.PACKAGE__SERVICE:
				getService().clear();
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
			case RosPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RosPackage.PACKAGE__NODE:
				return node != null && !node.isEmpty();
			case RosPackage.PACKAGE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case RosPackage.PACKAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RosPackage.PACKAGE__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case RosPackage.PACKAGE__DEPEND:
				return depend != null && !depend.isEmpty();
			case RosPackage.PACKAGE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case RosPackage.PACKAGE__ROSDEP:
				return ROSDEP_EDEFAULT == null ? rosdep != null : !ROSDEP_EDEFAULT.equals(rosdep);
			case RosPackage.PACKAGE__TOPIC:
				return topic != null && !topic.isEmpty();
			case RosPackage.PACKAGE__SERVICE:
				return service != null && !service.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", author: ");
		result.append(author);
		result.append(", description: ");
		result.append(description);
		result.append(", license: ");
		result.append(license);
		result.append(", depend: ");
		result.append(depend);
		result.append(", url: ");
		result.append(url);
		result.append(", rosdep: ");
		result.append(rosdep);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
