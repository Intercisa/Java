package exercise;

import java.util.List;

public class Ex01 {

	private static List<Integer> list = List.of(12,9,13,4,6,2,4,12,15);
	private static List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
	
	//print only odd numbers from the list
	//print all courses individually 
	//print courses containing the word "spring"
	//print courses whose name has at least 4 letters
	//print cubes of odd numbers
	//print the number of characters in each course name
	
	public static void main(String[] args) {
		printAllOdd(list);
		System.out.println("------------------------");
		
		printAllCourse(courses);
		System.out.println("------------------------");
		
		printAllCourseWithSpring(courses);
		System.out.println("------------------------");
		
		printAllAtLeast4LetterLong(courses);
		System.out.println("------------------------");
		
		printCubesOfAllOddNumbers(list);
		System.out.println("------------------------");
		
		printNumOfCharsInAllCourse(courses);
	}

	private static void printNumOfCharsInAllCourse(List<String> courses) {
		courses.stream()
		.map(c ->c + " " +c.length())
		.forEach(System.out::println);
	}

	private static void printCubesOfAllOddNumbers(List<Integer> list) {
		list.stream()
		.filter(n -> n%2 != 0)
		.map(n -> n * n * n)
		.forEach(System.out::println);
	}

	private static void printAllAtLeast4LetterLong(List<String> courses) {
		courses.stream()
		.filter(c -> c.length() >= 4)
		.forEach(System.out::println);
		
	}

	private static void printAllCourseWithSpring(List<String> courses) {
		courses.stream()
		.filter(c -> c.contains("Spring"))
		.forEach(System.out::println);
		
	}

	private static void printAllCourse(List<String> courses) {
		courses.forEach(System.out::println);
	}

	private static void printAllOdd(List<Integer> nums) {
		nums.stream()
		.filter(n -> n%2 != 0)
		.forEach(System.out::println);
	}

	
	
}
