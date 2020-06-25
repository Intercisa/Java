package func;

import java.util.List;
import java.util.stream.LongStream;

public class Parallelizing {
	public static void main(String[] args) {
		List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		
		
		//0, 1000000000
		long time = System.currentTimeMillis();
		//System.out.println(LongStream.range(0, 1000000000).sum());
		System.out.println(LongStream.range(0, 1000000000).parallel().sum());
		
		
		System.out.println(System.currentTimeMillis()-time);
		
		
		time = System.currentTimeMillis();
		System.out.println(nums.stream()
		.parallel()
		.reduce(0, Integer::sum));
		
		System.out.println(System.currentTimeMillis()-time);
		
		time = System.currentTimeMillis();
		System.out.println(nums.stream()
		.reduce(0, Integer::sum));
		
		System.out.println(System.currentTimeMillis()-time);
		
		
		time = System.currentTimeMillis();
		System.out.println(nums.parallelStream()
				.reduce(0, Integer::sum));
		
		System.out.println(System.currentTimeMillis()-time);
		
	}
}
