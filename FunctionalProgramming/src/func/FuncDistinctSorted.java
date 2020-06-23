package func;

import java.util.Comparator;
import java.util.List;

public class FuncDistinctSorted {
	public static void main(String[] args) {
		List<Integer> list = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");

			distinct(list);
			sorted(list);
			sortedDesc(list);
			sortedDistinct(list);
			
			sorted(courses);
			
	}

	private static <T> void sorted(List<T> list) {
		list.stream()
		.sorted()
		.forEach(System.out::println);
		
	}

	private static <T> void sortedDistinct(List<T> list) {
		list.stream()
		.distinct()
		.sorted()
		.forEach(System.out::println);
	}

	private static <T> void sortedDesc(List<T> list) {
		list.stream()
		.sorted((Comparator<? super T>) Comparator.reverseOrder())
		.forEach(System.out::println);
		
	}

	private static <T> void distinct(List<T> list) {
		list.stream()
		.distinct()
		.forEach(System.out::println);
	}
}
