package exercise;

abstract class Expression {
	abstract void accept(ExpressionVisitor ev);
}
