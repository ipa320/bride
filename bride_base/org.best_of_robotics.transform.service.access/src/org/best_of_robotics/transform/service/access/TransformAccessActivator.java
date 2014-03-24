package org.best_of_robotics.transform.service.access;

import org.best_of_robotics.transform.service.ITransformService;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public class TransformAccessActivator implements BundleActivator {
	
	public static final String PLUGIN_ID = "";

	private static BundleContext context;
	
	private static TransformAccessActivator plugin;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		TransformAccessActivator.context = bundleContext;
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
		TransformAccessActivator.context = null;
	}
	
	public static TransformAccessActivator getDefault() {
		return plugin;
	}
	
	public ITransformService getTransformService() {	
		ServiceReference<?> ref = context.getServiceReference(ITransformService.class.getName());
		if( ref == null ) {
			Bundle bundle = FrameworkUtil.getBundle(ITransformService.class);
			try {
				bundle.start();
			} catch (BundleException e) {
				e.printStackTrace();
			}
			ref = context.getServiceReference(ITransformService.class.getName());
		}
		return (ITransformService) context.getService(ref);
	}

}
