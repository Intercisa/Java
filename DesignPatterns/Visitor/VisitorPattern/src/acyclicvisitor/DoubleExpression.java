package acyclicvisitor;

class DoubleExpression extends Expression {
	public double value;

	public DoubleExpression(double value) {
		this.value = value;
	}

	@Override
	public void accept(Visitor visitor) {
		if (visitor instanceof ExpressionVisitor) {
			((ExpressionVisitor) visitor).visit(this);
		}
	}
}