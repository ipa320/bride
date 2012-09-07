/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ros.model.ros;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ros.model.ros.RosFactory
 * @model kind="package"
 * @generated
 */
public interface RosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ros";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ros/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ros";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RosPackage eINSTANCE = org.ros.model.ros.impl.RosPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.NodeImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Loop Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LOOP_RATE = 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUBSCRIBER = 3;

	/**
	 * The feature id for the '<em><b>Service Client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SERVICE_CLIENT = 4;

	/**
	 * The feature id for the '<em><b>Service Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SERVICE_SERVER = 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Actionserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ACTIONSERVER = 7;

	/**
	 * The feature id for the '<em><b>Actionclient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ACTIONCLIENT = 8;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.PackageImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NODE = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LICENSE = 4;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DEPEND = 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__URL = 6;

	/**
	 * The feature id for the '<em><b>Rosdep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ROSDEP = 7;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TOPIC = 8;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SERVICE = 9;

	/**
	 * The feature id for the '<em><b>Types Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TYPES_LIBRARY = 10;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ACTION = 11;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.PublisherImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__QUEUE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Latch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__LATCH = 2;

	/**
	 * The feature id for the '<em><b>Event Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__EVENT_HANDLER = 3;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__MSG = 4;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.SubscriberImpl <em>Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.SubscriberImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__QUEUE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Event Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__EVENT_HANDLER = 2;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__MSG = 3;

	/**
	 * The number of structural features of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.TopicImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__PUBLISHER = 1;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__SUBSCRIBER = 2;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.ServiceImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Serviceserver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICESERVER = 1;

	/**
	 * The feature id for the '<em><b>Serviceclient</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICECLIENT = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.ServiceServerImpl <em>Service Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.ServiceServerImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getServiceServer()
	 * @generated
	 */
	int SERVICE_SERVER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER__MSG = 1;

	/**
	 * The number of structural features of the '<em>Service Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.ServiceClientImpl <em>Service Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.ServiceClientImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getServiceClient()
	 * @generated
	 */
	int SERVICE_CLIENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT__MSG = 1;

	/**
	 * The number of structural features of the '<em>Service Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.ParameterImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.ActionImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actionserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIONSERVER = 1;

	/**
	 * The feature id for the '<em><b>Actionclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIONCLIENT = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.ActionServerImpl <em>Action Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.ActionServerImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getActionServer()
	 * @generated
	 */
	int ACTION_SERVER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SERVER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SERVER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.ActionClientImpl <em>Action Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.ActionClientImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getActionClient()
	 * @generated
	 */
	int ACTION_CLIENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLIENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLIENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.impl.ArchitectureImpl
	 * @see org.ros.model.ros.impl.RosPackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 12;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__PACKAGES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ros.model.ros.StandardMessageType <em>Standard Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.ros.StandardMessageType
	 * @see org.ros.model.ros.impl.RosPackageImpl#getStandardMessageType()
	 * @generated
	 */
	int STANDARD_MESSAGE_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.ros.model.ros.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Node#getLoopRate <em>Loop Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Rate</em>'.
	 * @see org.ros.model.ros.Node#getLoopRate()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_LoopRate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Node#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publisher</em>'.
	 * @see org.ros.model.ros.Node#getPublisher()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Node#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscriber</em>'.
	 * @see org.ros.model.ros.Node#getSubscriber()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subscriber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Node#getServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Client</em>'.
	 * @see org.ros.model.ros.Node#getServiceClient()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ServiceClient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Node#getServiceServer <em>Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Server</em>'.
	 * @see org.ros.model.ros.Node#getServiceServer()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ServiceServer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Node#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.ros.model.ros.Node#getParameter()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Node#getActionserver <em>Actionserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionserver</em>'.
	 * @see org.ros.model.ros.Node#getActionserver()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Actionserver();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Node#getActionclient <em>Actionclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionclient</em>'.
	 * @see org.ros.model.ros.Node#getActionclient()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Actionclient();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.ros.model.ros.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Package#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see org.ros.model.ros.Package#getNode()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Package#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.ros.model.ros.Package#getAuthor()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Package#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.ros.model.ros.Package#getDescription()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Package#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.ros.model.ros.Package#getLicense()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_License();

	/**
	 * Returns the meta object for the attribute list '{@link org.ros.model.ros.Package#getDepend <em>Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Depend</em>'.
	 * @see org.ros.model.ros.Package#getDepend()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Depend();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Package#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.ros.model.ros.Package#getUrl()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Package#getRosdep <em>Rosdep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rosdep</em>'.
	 * @see org.ros.model.ros.Package#getRosdep()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Rosdep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Package#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topic</em>'.
	 * @see org.ros.model.ros.Package#getTopic()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Topic();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Package#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.ros.model.ros.Package#getService()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Service();

	/**
	 * Returns the meta object for the reference '{@link org.ros.model.ros.Package#getTypesLibrary <em>Types Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Types Library</em>'.
	 * @see org.ros.model.ros.Package#getTypesLibrary()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_TypesLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Package#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.ros.model.ros.Package#getAction()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Action();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see org.ros.model.ros.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Publisher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.Publisher#getName()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Name();

	/**
	 * Returns the meta object for the reference '{@link org.ros.model.ros.Publisher#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Msg</em>'.
	 * @see org.ros.model.ros.Publisher#getMsg()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Msg();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Publisher#getQueueSize <em>Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Size</em>'.
	 * @see org.ros.model.ros.Publisher#getQueueSize()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_QueueSize();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Publisher#isLatch <em>Latch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latch</em>'.
	 * @see org.ros.model.ros.Publisher#isLatch()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Latch();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Publisher#getEventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Handler</em>'.
	 * @see org.ros.model.ros.Publisher#getEventHandler()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_EventHandler();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscriber</em>'.
	 * @see org.ros.model.ros.Subscriber
	 * @generated
	 */
	EClass getSubscriber();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Subscriber#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.Subscriber#getName()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_Name();

	/**
	 * Returns the meta object for the reference '{@link org.ros.model.ros.Subscriber#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Msg</em>'.
	 * @see org.ros.model.ros.Subscriber#getMsg()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_Msg();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Subscriber#getQueueSize <em>Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Size</em>'.
	 * @see org.ros.model.ros.Subscriber#getQueueSize()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_QueueSize();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Subscriber#getEventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Handler</em>'.
	 * @see org.ros.model.ros.Subscriber#getEventHandler()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_EventHandler();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see org.ros.model.ros.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.Topic#getName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Name();

	/**
	 * Returns the meta object for the reference '{@link org.ros.model.ros.Topic#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher</em>'.
	 * @see org.ros.model.ros.Topic#getPublisher()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Publisher();

	/**
	 * Returns the meta object for the reference '{@link org.ros.model.ros.Topic#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscriber</em>'.
	 * @see org.ros.model.ros.Topic#getSubscriber()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Subscriber();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.ros.model.ros.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.ros.model.ros.Service#getServiceserver <em>Serviceserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Serviceserver</em>'.
	 * @see org.ros.model.ros.Service#getServiceserver()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Serviceserver();

	/**
	 * Returns the meta object for the reference list '{@link org.ros.model.ros.Service#getServiceclient <em>Serviceclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Serviceclient</em>'.
	 * @see org.ros.model.ros.Service#getServiceclient()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Serviceclient();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.ServiceServer <em>Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Server</em>'.
	 * @see org.ros.model.ros.ServiceServer
	 * @generated
	 */
	EClass getServiceServer();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.ServiceServer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.ServiceServer#getName()
	 * @see #getServiceServer()
	 * @generated
	 */
	EAttribute getServiceServer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.ServiceServer#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg</em>'.
	 * @see org.ros.model.ros.ServiceServer#getMsg()
	 * @see #getServiceServer()
	 * @generated
	 */
	EAttribute getServiceServer_Msg();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.ServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Client</em>'.
	 * @see org.ros.model.ros.ServiceClient
	 * @generated
	 */
	EClass getServiceClient();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.ServiceClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.ServiceClient#getName()
	 * @see #getServiceClient()
	 * @generated
	 */
	EAttribute getServiceClient_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.ServiceClient#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg</em>'.
	 * @see org.ros.model.ros.ServiceClient#getMsg()
	 * @see #getServiceClient()
	 * @generated
	 */
	EAttribute getServiceClient_Msg();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.ros.model.ros.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ros.model.ros.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ros.model.ros.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.ros.model.ros.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the reference '{@link org.ros.model.ros.Action#getActionserver <em>Actionserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actionserver</em>'.
	 * @see org.ros.model.ros.Action#getActionserver()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actionserver();

	/**
	 * Returns the meta object for the reference '{@link org.ros.model.ros.Action#getActionclient <em>Actionclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actionclient</em>'.
	 * @see org.ros.model.ros.Action#getActionclient()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actionclient();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.ActionServer <em>Action Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Server</em>'.
	 * @see org.ros.model.ros.ActionServer
	 * @generated
	 */
	EClass getActionServer();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.ActionServer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.ActionServer#getName()
	 * @see #getActionServer()
	 * @generated
	 */
	EAttribute getActionServer_Name();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.ActionClient <em>Action Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Client</em>'.
	 * @see org.ros.model.ros.ActionClient
	 * @generated
	 */
	EClass getActionClient();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.ActionClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.ActionClient#getName()
	 * @see #getActionClient()
	 * @generated
	 */
	EAttribute getActionClient_Name();

	/**
	 * Returns the meta object for class '{@link org.ros.model.ros.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see org.ros.model.ros.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.ros.Architecture#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.ros.model.ros.Architecture#getPackages()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Packages();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.ros.Architecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.ros.Architecture#getName()
	 * @see #getArchitecture()
	 * @generated
	 */
	EAttribute getArchitecture_Name();

	/**
	 * Returns the meta object for enum '{@link org.ros.model.ros.StandardMessageType <em>Standard Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standard Message Type</em>'.
	 * @see org.ros.model.ros.StandardMessageType
	 * @generated
	 */
	EEnum getStandardMessageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RosFactory getRosFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.NodeImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Loop Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LOOP_RATE = eINSTANCE.getNode_LoopRate();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PUBLISHER = eINSTANCE.getNode_Publisher();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUBSCRIBER = eINSTANCE.getNode_Subscriber();

		/**
		 * The meta object literal for the '<em><b>Service Client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SERVICE_CLIENT = eINSTANCE.getNode_ServiceClient();

		/**
		 * The meta object literal for the '<em><b>Service Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SERVICE_SERVER = eINSTANCE.getNode_ServiceServer();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARAMETER = eINSTANCE.getNode_Parameter();

		/**
		 * The meta object literal for the '<em><b>Actionserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ACTIONSERVER = eINSTANCE.getNode_Actionserver();

		/**
		 * The meta object literal for the '<em><b>Actionclient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ACTIONCLIENT = eINSTANCE.getNode_Actionclient();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.PackageImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NODE = eINSTANCE.getPackage_Node();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__AUTHOR = eINSTANCE.getPackage_Author();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__DESCRIPTION = eINSTANCE.getPackage_Description();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__LICENSE = eINSTANCE.getPackage_License();

		/**
		 * The meta object literal for the '<em><b>Depend</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__DEPEND = eINSTANCE.getPackage_Depend();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__URL = eINSTANCE.getPackage_Url();

		/**
		 * The meta object literal for the '<em><b>Rosdep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__ROSDEP = eINSTANCE.getPackage_Rosdep();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__TOPIC = eINSTANCE.getPackage_Topic();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SERVICE = eINSTANCE.getPackage_Service();

		/**
		 * The meta object literal for the '<em><b>Types Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__TYPES_LIBRARY = eINSTANCE.getPackage_TypesLibrary();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ACTION = eINSTANCE.getPackage_Action();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.PublisherImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__NAME = eINSTANCE.getPublisher_Name();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__MSG = eINSTANCE.getPublisher_Msg();

		/**
		 * The meta object literal for the '<em><b>Queue Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__QUEUE_SIZE = eINSTANCE.getPublisher_QueueSize();

		/**
		 * The meta object literal for the '<em><b>Latch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__LATCH = eINSTANCE.getPublisher_Latch();

		/**
		 * The meta object literal for the '<em><b>Event Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__EVENT_HANDLER = eINSTANCE.getPublisher_EventHandler();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.SubscriberImpl <em>Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.SubscriberImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getSubscriber()
		 * @generated
		 */
		EClass SUBSCRIBER = eINSTANCE.getSubscriber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__NAME = eINSTANCE.getSubscriber_Name();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__MSG = eINSTANCE.getSubscriber_Msg();

		/**
		 * The meta object literal for the '<em><b>Queue Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__QUEUE_SIZE = eINSTANCE.getSubscriber_QueueSize();

		/**
		 * The meta object literal for the '<em><b>Event Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__EVENT_HANDLER = eINSTANCE.getSubscriber_EventHandler();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.TopicImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__NAME = eINSTANCE.getTopic_Name();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__PUBLISHER = eINSTANCE.getTopic_Publisher();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__SUBSCRIBER = eINSTANCE.getTopic_Subscriber();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.ServiceImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Serviceserver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICESERVER = eINSTANCE.getService_Serviceserver();

		/**
		 * The meta object literal for the '<em><b>Serviceclient</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICECLIENT = eINSTANCE.getService_Serviceclient();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.ServiceServerImpl <em>Service Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.ServiceServerImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getServiceServer()
		 * @generated
		 */
		EClass SERVICE_SERVER = eINSTANCE.getServiceServer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SERVER__NAME = eINSTANCE.getServiceServer_Name();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SERVER__MSG = eINSTANCE.getServiceServer_Msg();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.ServiceClientImpl <em>Service Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.ServiceClientImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getServiceClient()
		 * @generated
		 */
		EClass SERVICE_CLIENT = eINSTANCE.getServiceClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CLIENT__NAME = eINSTANCE.getServiceClient_Name();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CLIENT__MSG = eINSTANCE.getServiceClient_Msg();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.ParameterImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.ActionImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Actionserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTIONSERVER = eINSTANCE.getAction_Actionserver();

		/**
		 * The meta object literal for the '<em><b>Actionclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTIONCLIENT = eINSTANCE.getAction_Actionclient();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.ActionServerImpl <em>Action Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.ActionServerImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getActionServer()
		 * @generated
		 */
		EClass ACTION_SERVER = eINSTANCE.getActionServer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_SERVER__NAME = eINSTANCE.getActionServer_Name();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.ActionClientImpl <em>Action Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.ActionClientImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getActionClient()
		 * @generated
		 */
		EClass ACTION_CLIENT = eINSTANCE.getActionClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_CLIENT__NAME = eINSTANCE.getActionClient_Name();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.impl.ArchitectureImpl
		 * @see org.ros.model.ros.impl.RosPackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__PACKAGES = eINSTANCE.getArchitecture_Packages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE__NAME = eINSTANCE.getArchitecture_Name();

		/**
		 * The meta object literal for the '{@link org.ros.model.ros.StandardMessageType <em>Standard Message Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.ros.StandardMessageType
		 * @see org.ros.model.ros.impl.RosPackageImpl#getStandardMessageType()
		 * @generated
		 */
		EEnum STANDARD_MESSAGE_TYPE = eINSTANCE.getStandardMessageType();

	}

} //RosPackage
