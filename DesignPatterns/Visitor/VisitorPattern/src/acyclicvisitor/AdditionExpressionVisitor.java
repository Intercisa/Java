package acyclicvisitor;

interface AdditionExpressionVisitor extends Visitor {
	void visit(AdditionExpression obj);
}