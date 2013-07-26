package org.eclipse.example.calc;

import org.eclipse.example.calc.internal.operations.AbstractOperation;

public class Divide extends AbstractOperation implements BinaryOperation{

	public Divide() {
		super();
	}

	@Override
	public String getName() {
		return "/";
	}

	@Override
	public float perform(float arg1, float arg2) {
		return arg1 / arg2;
	}
	
}
