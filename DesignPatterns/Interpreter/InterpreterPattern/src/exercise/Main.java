package exercise;

public class Main {

	public static void main(String[] args) {
		
		ExpressionProcessor ep = new ExpressionProcessor();
		ep.variables.put('x', 3);
		System.out.println(ep.calculate("10-2-x"));
	}
}
