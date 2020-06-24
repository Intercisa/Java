package func;

import java.util.List;
import java.util.stream.Collectors;

public class FuncCollectingToList {
	public static void main(String[] args) {
		List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		
		squaresOfNums(nums).forEach(System.out::println);
		
	}

	private static List<Integer> squaresOfNums(List<Integer> nums) {
			return nums.stream()
			.map(n -> n * n)
			.collect(Collectors.toList());
		
	}
}