package classicvisitor;

public interface ExpressionVisitor {
	void visit(DoubleExpression e);
	void visit(AdditionExpression e);
}
