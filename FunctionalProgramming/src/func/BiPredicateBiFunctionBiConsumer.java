package func;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntBinaryOperator;

public class BiPredicateBiFunctionBiConsumer {
	public static void main(String[] args) {
		
			List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
			List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
					"Azure", "Docker", "Kubernetes");
			
			//BiPredicate 
			BiPredicate<Integer, String> biPredicate = (num, str) -> str.length() > num ? true : false; 
			System.out.println(biPredicate.test(5, "testing"));
			System.out.println(biPredicate.test(5, "test"));
			
			//BiFunction
			BiFunction<Integer, String, String> biFunction = 
					(num, str) -> str.length() > num ? str+" is bigger than "+ num :  str+" is smaller than "+ num;
			
			System.out.println(biFunction.apply(5, "testing"));
			System.out.println(biFunction.apply(5, "test"));
			
			//BiConsumer
			BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + " * " + s2);
			
			biConsumer.accept("title", "headline");
			
			//no boxing 
			IntBinaryOperator numBinary = (x,y) -> x+y;
			
			
	}
}
