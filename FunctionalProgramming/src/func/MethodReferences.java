package func;

import java.util.List;
import java.util.function.Supplier;

public class MethodReferences {
	
	public static void main(String[] args) {
		List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		
		courses.stream()
		.map(String::toUpperCase)
		.forEach(MethodReferences::print);
		
		Supplier<String> supplier = String::new;

		
	}

	private static <T> void print(T t) {
		System.out.println(t);
	}
	
}
