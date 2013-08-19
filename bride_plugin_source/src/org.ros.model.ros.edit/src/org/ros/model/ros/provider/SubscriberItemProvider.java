/**
 */
package org.ros.model.ros.provider;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ros.model.ros.Publisher;
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.Subscriber;

/**
 * This is the item provider adapter for a {@link org.ros.model.ros.Subscriber} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubscriberItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriberItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addQueueSizePropertyDescriptor(object);
			addEventHandlerPropertyDescriptor(object);
			addMsgPropertyDescriptor(object);
			addEventPortPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subscriber_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subscriber_name_feature", "_UI_Subscriber_type"),
				 RosPackage.Literals.SUBSCRIBER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Queue Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueueSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subscriber_queueSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subscriber_queueSize_feature", "_UI_Subscriber_type"),
				 RosPackage.Literals.SUBSCRIBER__QUEUE_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Handler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventHandlerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subscriber_eventHandler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subscriber_eventHandler_feature", "_UI_Subscriber_type"),
				 RosPackage.Literals.SUBSCRIBER__EVENT_HANDLER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * Manual coded Property for pull down menu
	 */
	protected void addMsgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subscriber_msg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subscriber_msg_feature", "_UI_Subscriber_type"),
				 RosPackage.Literals.SUBSCRIBER__MSG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null){
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					Subscriber subscriber = (Subscriber) object;
					org.ros.model.ros.Package pack = (org.ros.model.ros.Package) subscriber.eContainer().eContainer();
					System.out.println(pack.getName());
					
								
					List<String> strings = new ArrayList<String>(); // Copy the students to a temporary list
					for (String item: pack.getDepend()) {
						String cmd = "rosmsg package " + item;
						Runtime run = Runtime.getRuntime();
						Process pr;
						try {
							pr = run.exec(cmd);
							pr.waitFor();
							BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
							String line = "";
							while ((line=buf.readLine())!=null) {
								strings.add(line.replace("/", "::"));
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//strings.add(item);
					}
					//Check for messages in the own project
					String cmd = "rosmsg package " + pack.getName();
					Runtime run = Runtime.getRuntime();
					Process pr;
					try {
						pr = run.exec(cmd);
						pr.waitFor();
						BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
						String line = "";
						while ((line=buf.readLine())!=null) {
							strings.add(line.replace("/", "::"));
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return strings;
				}
				});
	}

	/**
	 * This adds a property descriptor for the Event Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subscriber_eventPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subscriber_eventPort_feature", "_UI_Subscriber_type"),
				 RosPackage.Literals.SUBSCRIBER__EVENT_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Subscriber.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Subscriber"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Subscriber)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Subscriber_type") :
			getString("_UI_Subscriber_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Subscriber.class)) {
			case RosPackage.SUBSCRIBER__NAME:
			case RosPackage.SUBSCRIBER__QUEUE_SIZE:
			case RosPackage.SUBSCRIBER__EVENT_HANDLER:
			case RosPackage.SUBSCRIBER__MSG:
			case RosPackage.SUBSCRIBER__EVENT_PORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RosEditPlugin.INSTANCE;
	}

}
