package func;

import java.util.List;

public class FuncStructuredFunctional {

	public static void main(String[] args) {
		List<Integer> list = List.of(12,9,13,4,6,2,4,12,15);
		printEvenNumbersInListStructured(list);
		printEvenNumbersInListFunctional(list);
		
	}

	private static void printAllNumbersInListStructured(List<Integer> nums) {
		//traditional
		for (Integer num : nums) {
			System.out.println(num);
		}
	}
	
	
	private static void printEvenNumbersInListStructured(List<Integer> nums) {
		//traditional
		for (Integer num : nums) {
			if(num % 2 == 0)
			System.out.println(num);
		}
	}
	
	
	
	private static void printAllNumbersInListFunctional(List<Integer> nums) {
		//functional
		
		//with stream
		nums.stream()
		.forEach(FuncStructuredFunctional::print);
		
		//without stream
		//nums.forEach(System.out::println);
		
		//even nums
		nums.forEach(System.out::println);
		
	}
	
	
	private static void printEvenNumbersInListFunctional(List<Integer> nums) {
		
		//even nums
		nums.stream()
		.filter(FuncStructuredFunctional::isEven)
		.forEach(System.out::println);
		
		//or
		nums.stream()
		.filter(n -> n % 2 == 0 )
		.forEach(System.out::println);
		
		
	}

	private static boolean isEven(int n) {
		return n%2 ==0;
	}
	
	
	private static void print(int n) {
		System.out.print(n + " ");
	}
	

	
	
}
