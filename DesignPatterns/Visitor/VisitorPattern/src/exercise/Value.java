package exercise;

class Value extends Expression {
	public int value;

	public Value(int value) {
		this.value = value;
	}

	@Override
	void accept(ExpressionVisitor ev) {
		ev.visit(this);
	}
}
