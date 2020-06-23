package visitor;

public class ExpressionPrinter {
	
	public static void print(Expression e, StringBuilder sb) {
		if(e instanceof DoubleExpression) 
			sb.append(((DoubleExpression) e).value);
		else if(e instanceof AdditionExpression) {
			AdditionExpression ae = (AdditionExpression)e;
			sb.append("(");
			print(ae.left, sb);
			sb.append("+");
			print(ae.right, sb);
			sb.append(")");
		}
	}
}
