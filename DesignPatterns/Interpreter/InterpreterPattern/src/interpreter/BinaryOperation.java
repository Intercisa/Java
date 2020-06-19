package interpreter;

public class BinaryOperation implements Element {

	public enum Type {
		ADDITION, SUBTRACTION
	}

	public Type type;
	Element left, right;

	@Override
	public int eval() {
		switch (type) {
		case ADDITION:
			return left.eval() + right.eval();
		case SUBTRACTION:
			return left.eval() - right.eval();
		default:
			return 0;

		}
	}

}
