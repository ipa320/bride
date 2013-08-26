package org.best_of_robotics.transform.service.parameter;

import org.best_of_robotics.internal.transform.service.parameter.EglTransformParameter;
import org.best_of_robotics.internal.transform.service.parameter.EtlTransformParameter;

public class TransformParameterFactory {

	private TransformParameterFactory() {
	}
	
	public static final IEglTransformParameter createEglTransformParameter() {
		return new EglTransformParameter();
	}
	
	public static final IEtlTransformParameter createEtlTransformParameter() {
		return new EtlTransformParameter();
	}

}
