package acyclicvisitor;

interface ExpressionVisitor extends Visitor {
	void visit(Expression obj);
}