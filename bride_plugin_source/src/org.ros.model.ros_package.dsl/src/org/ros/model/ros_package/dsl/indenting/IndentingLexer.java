package org.ros.model.ros_package.dsl.indenting;

import org.antlr.runtime.CharStream;
import org.ros.model.ros_package.dsl.parser.antlr.internal.InternalRosPackageLexer;

public class IndentingLexer extends InternalRosPackageLexer {

	public IndentingLexer() {
	}

	public IndentingLexer(CharStream input) {
		super(new IndentingStream(input));
	}

	@Override
	public void setCharStream(CharStream arg0) {
		super.setCharStream(new IndentingStream(arg0));
	}
}
