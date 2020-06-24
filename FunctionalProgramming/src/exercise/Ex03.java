package exercise;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Ex03 {

	// create a list with even numbers filtered from numbers list
	// create a list with lengths of all course titles
	// find functional interface of reduce method -> int sum =
	// nums.stream().reduce(0, Integer::sum);

	private static List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
	private static List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
			"Azure", "Docker", "Kubernetes");

	public static void main(String[] args) {

		getEvenNumList(nums);
		getAllCourseLength(courses);

		BinaryOperator<Integer> binaryOperatorSum = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer x, Integer y) {
				return x + y;
			}
		};
		int sum = nums.stream()
				.reduce(0, binaryOperatorSum);
		System.out.println(sum);

	}

	private static List<Integer> getAllCourseLength(List<String> courses) {
		return courses.stream()
				.map(c -> c.length())
				.collect(Collectors.toList());

	}

	private static List<Integer> getEvenNumList(List<Integer> nums) {
		return nums.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
	}

}
