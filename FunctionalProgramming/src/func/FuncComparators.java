package func;

import java.util.Comparator;
import java.util.List;

public class FuncComparators {
	public static void main(String[] args) {
		List<Integer> nums = List.of(12,9,13,4,6,2,4,12,15);
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		
		
		sortCoursesNaturalOrder(courses);
		sortCoursesReversedOrder(courses);
		sortCoursesCostumOrderLength(courses);
		
		
		
	}

	private static void sortCoursesCostumOrderLength(List<String> courses) {
		courses.stream()
		.sorted(Comparator.comparing(str -> str.length()))
		.forEach(System.out::println);
		
	}

	private static void sortCoursesReversedOrder(List<String> courses) {
		courses.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
	}

	private static void sortCoursesNaturalOrder(List<String> courses) {
		courses.stream()
		.sorted(Comparator.naturalOrder())
		.forEach(System.out::println);
	}
}
