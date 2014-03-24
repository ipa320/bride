package org.best_of_robotics.internal.transform.service.parameter;

import org.best_of_robotics.transform.service.parameter.ITransformParameter;


public class AbstractTransformParameter implements ITransformParameter {

	private String transformName;

	public AbstractTransformParameter() {
	}

	@Override
	public String getTransformName() {
		return transformName;
	}

	@Override
	public void setTransformName(String transformName) {
		this.transformName = transformName;
	}

}
