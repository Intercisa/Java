package visitor;

/*
 * 
 * Visitor
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		//(1+(2+3))
		AdditionExpression e = new AdditionExpression(new DoubleExpression(1),
				new AdditionExpression(new DoubleExpression(2), new DoubleExpression(3)));
		
		StringBuilder sb = new StringBuilder();
		ExpressionPrinter.print(e, sb);
		System.out.println(sb);
	}
}
