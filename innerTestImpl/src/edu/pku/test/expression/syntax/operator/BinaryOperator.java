package edu.pku.test.expression.syntax.operator;

public abstract class BinaryOperator extends Operator {

	public BinaryOperator(String operator) {
		super(operator);
	}

	public final int getArgumentNum() {
		return 2;
	}

}
