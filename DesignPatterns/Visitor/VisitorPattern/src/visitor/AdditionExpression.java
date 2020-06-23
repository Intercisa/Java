package visitor;

public class AdditionExpression extends Expression {
	
	public Expression left, right;

	public AdditionExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
}
