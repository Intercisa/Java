package func;

import java.util.List;

public class PerformaceTest {
	public static void main(String[] args) {
		List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		
		
		String upperMaxLengthStr = courses.stream()
		.filter(c -> c.length() > 11)
		.map(String::toUpperCase)
		.findFirst()
		.get();
		
		
		courses.stream()
		.peek(System.out::println)
		.filter(c -> c.length() > 11)
		.map(String::toUpperCase)
		.peek(System.out::println)
		.findFirst();
		
		//won't execute because the intermediate operations(peek, filter...) are lazy -> only executed if there is a terminal operation(findFirst...) 
		courses.stream()
		.peek(System.out::println)
		.filter(c -> c.length() > 11)
		.map(String::toUpperCase)
		.peek(System.out::println);
		
		
	}
}
