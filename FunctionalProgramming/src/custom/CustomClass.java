package custom;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Course{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	public Course() {}

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getCategory() {return category;}
	public void setCategory(String category) {this.category = category;}
	public int getReviewScore() {return reviewScore;}
	public void setReviewScore(int reviewScore) {this.reviewScore = reviewScore;}
	public int getNoOfStudents() {return noOfStudents;}
	public void setNoOfStudents(int noOfStudents) {this.noOfStudents = noOfStudents;}

	@Override
	public String toString() {
		return String.format("Course [name=%s, noOfStudents=%s, reviewScore=%s ]", name, noOfStudents,
				reviewScore);
	}
}



public class CustomClass {

	public static void main(String[] args) {
		
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));
		
		//allMatch, noneMatch, anyMatch
		Predicate<? super Course> reviewScoreGreaterThan95Predicate = c -> c.getReviewScore() > 95;
		Predicate<? super Course> reviewScoreGreaterThan90Predicate = c -> c.getReviewScore() > 90;
		Predicate<? super Course> reviewScoreLessThan90Predicate = c -> c.getReviewScore() < 90;
		Predicate<? super Course> reviewScoreGreaterThan100Predicate = c -> c.getReviewScore() > 100;
		
		
		System.out.println(courses.stream()
								.allMatch(reviewScoreGreaterThan90Predicate));
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
								.noneMatch(reviewScoreGreaterThan100Predicate));
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
								.anyMatch(reviewScoreGreaterThan95Predicate));
		
		
		System.out.println("-------------------------------------------------------------------------");
		
		Comparator<Course> comparingByNoOfStudentsInc = Comparator.comparing(Course::getNoOfStudents);
		Comparator<Course> comparingByNoOfStudentsDec = Comparator.comparing(Course::getNoOfStudents).reversed();
		
		
		courses.stream()
		.sorted(comparingByNoOfStudentsDec)
		.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------");
		
		courses.stream()
		.sorted(Comparator.comparingInt(Course::getReviewScore).reversed())
		.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------");
		
		
		Comparator<Course> comparingByNoOfStudentsAndNoOfReviews = 
				Comparator.comparingInt(Course::getNoOfStudents)
				.thenComparingInt(Course::getReviewScore).reversed();
		
		courses.stream()
		.sorted(comparingByNoOfStudentsAndNoOfReviews)
		.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------");
		
		courses.stream()
		.sorted(Comparator.comparingInt(
				Course::getReviewScore)
				.thenComparingInt(
						Course::getNoOfStudents)
				.reversed())
		.forEach(System.out::println);
		
		
		System.out.println("-------------------------------------------------------------------------");
		
		courses.stream()
		.sorted(comparingByNoOfStudentsAndNoOfReviews)
		.limit(5)
		.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------");
		
		courses.stream()
		.sorted(comparingByNoOfStudentsAndNoOfReviews)
		.skip(3)
		.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------");
		
		courses.stream()
		.sorted(comparingByNoOfStudentsAndNoOfReviews)
		.skip(3)
		.limit(5)
		.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------");
		
		courses.stream()
		.takeWhile(c -> c.getReviewScore() >= 95)
		.forEach(System.out::println);

		System.out.println("-------------------------------------------------------------------------");
		
		courses.stream()
		.dropWhile(c -> c.getReviewScore() >= 95)
		.forEach(System.out::println);

		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
		.max(comparingByNoOfStudentsAndNoOfReviews));
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
				.min(comparingByNoOfStudentsAndNoOfReviews));
				
		System.out.println("-------------------------------------------------------------------------");
		
		Supplier<Course> defaultCourse = () ->  new Course("NO DATA", "NO DATA", -1, -1);
		
		System.out.println(courses.stream()
		.filter(reviewScoreLessThan90Predicate)
		.min(comparingByNoOfStudentsAndNoOfReviews)
		.orElse(defaultCourse.get()));
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
		.filter(reviewScoreLessThan90Predicate)
		.findFirst());
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.findFirst());
				
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.findAny());
				
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
		.filter(reviewScoreGreaterThan95Predicate)
		.mapToInt(Course::getNoOfStudents)
		.sum());
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.average());
				
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.count());
				
		System.out.println("-------------------------------------------------------------------------");
		
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.max());
				
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.min());
				
		System.out.println("-------------------------------------------------------------------------");
		
		//Grouping Courses 
		
		System.out.println(courses.stream()
		.collect(Collectors.groupingBy(Course::getCategory)));
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
				.collect(Collectors.groupingBy(
								Course::getCategory, 
								Collectors.maxBy(
										Comparator.comparingInt(Course::getReviewScore)))));
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(courses.stream()
				.collect(Collectors.groupingBy(
								Course::getCategory, 
								Collectors.mapping(Course::getName, Collectors.toList()))));
		
		
	}
}
