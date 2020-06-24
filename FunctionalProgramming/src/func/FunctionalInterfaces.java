package func;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
	public static void main(String[] args) {
		List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		
		
		Predicate<? super Integer> eventPredicate = x -> x % 2 == 0;
		Predicate<? super Integer> eventPredicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer x) {
				return x % 2 == 0;
			}
			
		};
		Function<? super Integer, ? extends Integer> squareFunction = x -> x * x;
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer x) {
				return x*x;
			}
		};
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		};
		
		nums.stream()
		.filter(eventPredicate2)
		.map(squareFunction2)
		.forEach(sysoutConsumer2);
		
		
	}

}
