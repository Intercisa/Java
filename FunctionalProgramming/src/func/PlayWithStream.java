package func;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PlayWithStream {
	public static void main(String[] args) {
		List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		
		System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).count());
		System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).reduce(0, Integer::sum));
		
		
		System.out.println("-------------------------------------------------------------------------");
		
		int[] numberArray = {12, 9, 13, 4, 6, 2, 4, 12, 15};
		Arrays.stream(numberArray).sum();
		Arrays.stream(numberArray).average();
		Arrays.stream(numberArray).min();
		Arrays.stream(numberArray).max();
		
		//stream for the first 100 num 
		IntStream.range(1, 10).sum();
		IntStream.rangeClosed(1, 10).sum();
		
		IntStream.iterate(1,  e -> e+2).limit(10).peek(System.out::println).sum();
		
		
		System.out.println("-------------------------------------------------------------------------");
		
		IntStream.iterate(0, e -> e+2).limit(10).peek(System.out::println).sum();
		
		System.out.println("-------------------------------------------------------------------------");
		IntStream.iterate(2, e -> 2*e).limit(10).peek(System.out::println).sum();
		
		System.out.println("-------------------------------------------------------------------------");
		List<Integer> numListPow2 = IntStream.iterate(2, e -> 2*e).limit(10).boxed().collect(Collectors.toList());
		
		
		System.out.println("-------------------------------------------------------------------------");

		System.out.println(courses.stream()
		.collect(Collectors.joining(", ")));
		
		System.out.println("-------------------------------------------------------------------------");
		
		List<String> flatCoursesList = courses.stream()
		.map(c -> c.split(""))
		.flatMap(Arrays::stream)
		.collect(Collectors.toList());
		
		flatCoursesList.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------");
		
		List<String> flatCoursesListDistinct = courses.stream()
				.map(c -> c.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList());
				
		flatCoursesListDistinct.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------");
		
		List<String> courses2 = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		

		List<List<String>> joinedCourseList = courses.stream()
				.flatMap(course -> courses2.stream()
						.map(course2 -> List.of(course,course2)))
				.collect(Collectors.toList());
		
		joinedCourseList.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------");

		List<List<String>> notSameCourseList = courses.stream()
				.flatMap(course -> courses2.stream()
						.map(course2 -> List.of(course,course2)))
				.filter(list -> !list.get(0).equals(list.get(1)))
				.collect(Collectors.toList());
		
		notSameCourseList.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------");

		List<List<String>> sameLengthCourseList = courses.stream()
				.flatMap(course -> courses2.stream()
						.filter(course2 -> course2.length() == course.length())
						.map(course2 -> List.of(course,course2)))
				.filter(list -> !list.get(0).equals(list.get(1)))
				.collect(Collectors.toList());
		
		sameLengthCourseList.forEach(System.out::println);
		
		
	}
}
