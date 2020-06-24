package func;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviorParameterization {
	
	public static void main(String[] args) {
		List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		
		/*
		nums.stream()
		.filter(evenPredicate)
		.forEach(System.out::println);
		*/
		
		
		/*
		nums.stream()
		.filter(oddPredicate)
		.forEach(System.out::println);
		*/
		
		fileterAndPrintNums(nums,  x -> x%2 == 0);
		fileterAndPrintNums(nums,  x -> x%2 != 0);
		fileterAndPrintNums(nums,  x -> x%3 == 0);
		
		Function<Integer, String> stringOutPutFunction = x  -> x+"$";
		mappingNumsToString(nums, stringOutPutFunction).forEach(System.out::println);
		
		
		
	}

	private static void fileterAndPrintNums(List<Integer>nums, Predicate<? super Integer> filterPredicate) {
		nums.stream()
		.filter(filterPredicate)
		.forEach(System.out::println);
	}
	
	
	private static List<String> mappingNumsToString(List<Integer> nums, Function<Integer, String> mapper){
		return nums.stream()
		.map(mapper)
		.collect(Collectors.toList());
}
	
}
