package org.best_of_robotics.transform.service.parameter;


public interface IEglTransformParameter extends ITransformParameter {
	
	public String getPluginID();

	public void setPluginID(String pluginID);

	public String getEglTransformation();

	public void setEglTransform(String eglTransformation);

	public String getSourceName();

	public void setSourceName(String sourceName);

	public String getSourceMetaModelURI();

	public void setSourceMetaModelURI(String sourceMetaModelURI);

	public String getSourceModelFilePath();
	
	public void setSourceModelFilePath(String sourceModelFilePath);

	public boolean isSourceReadOnLoad();

	public void setSourceReadOnLoad(boolean sourceReadOnLoad);
	
	public boolean isSourceStoreOnDisposal();

	public void setSourceStoreOnDisposal(boolean sourceStoreOnDisposal);

	public String getOutputRoot();

	public void setOutputRoot(String outputRoot);

}
