package sort;

public class Recursion {
	
	public static void main(String[] args) {
		System.out.println(getFactorialIterative(5));
		System.out.println(getFactorialRecursion(5));
	}
	
	
	/*
	 * 
	 * Factorial algorithm 
	 * 
	 * if num is equal to 0 the factorial is 1 
	 * stop
	 * we have the result
	 * otherwise
	 * set multiplier to 1
	 * set factorial to 1
	 * 
	 * while multiplier is not equal to num do steps 5 and 6
	 * multiply factorial by multiplier and assign the result to factorial 
	 * add 1 to multiplier 
	 * stop
	 * the result is factorial 
	 * 
	 * 
	 * 
	 */
	
	
	private static int getFactorialIterative(int num) {
		if(num == 0) return 1;
		
		int factorial = 1;
		for (int i = 1; i <= num; i++) factorial *= i;
		
		return factorial;
		
		
	}
	
	private static int getFactorialRecursion(int num) {
		if(num == 0) return 1;
		
		return num * getFactorialRecursion(num -1 );
	}
}
