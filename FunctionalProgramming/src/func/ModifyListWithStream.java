package func;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModifyListWithStream {
	public static void main(String[] args) {
		List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		
		List<String> upperCourse = courses.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		upperCourse.forEach(System.out::println);
		
		System.out.println();
		List<String> modifyableCourses = new ArrayList(courses);
		
		modifyableCourses.replaceAll(String::toUpperCase);
		modifyableCourses.forEach(System.out::println);
		
		System.out.println();
		modifyableCourses.removeIf(c -> c.length() < 6);
		modifyableCourses.forEach(System.out::println);
		
	}
}
