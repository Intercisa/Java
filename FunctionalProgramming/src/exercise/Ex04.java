package exercise;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex04 {

	// do behavior parameterization for the mapping logic -> List squareNums = nums.stream().map(x -> x*x).collect(Collectors.toList());

	private static List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

	public static void main(String[] args) {
		
		//nums.stream().map(x -> x*x).collect(Collectors.toList());
		
		mapNums(nums, x -> x*x).forEach(System.out::println);
		mapNums(nums, x -> x*x*x).forEach(System.out::println);
		
	}
	
	private static List<Integer> mapNums(List<Integer> nums, Function<Integer, Integer> mapper){
		return nums.stream()
		.map(mapper)
		.collect(Collectors.toList());
	}
}
