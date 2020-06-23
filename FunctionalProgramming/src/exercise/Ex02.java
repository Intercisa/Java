package exercise;

import java.util.List;

public class Ex02 {

	private static List<Integer> list = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
	private static List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
			"Azure", "Docker", "Kubernetes");

	//square every num in list and find the sum
	//cube every num in a list and find sum of cubes
	//Find sum of odd numbers in a list

	public static void main(String[] args) {
		
		System.out.println(squareSum(list));
		System.out.println(cubeSum(list));
		System.out.println(sumOfOddNums(list));
		
	}

	private static int cubeSum(List<Integer> nums) {
		return nums.stream()
				.map(n -> n*n*n)
				.reduce(0, Integer::sum);
	}

	private static int squareSum(List<Integer> nums) {
		return nums.stream()
				.map(n -> n*n)
				.reduce(0, Integer::sum);
		
	}

	private static int sumOfOddNums(List<Integer> nums) {
			return nums.stream()
					.filter(n -> n % 2 == 1)
					.reduce(0, Integer::sum);
	}
}
