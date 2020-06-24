package func;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierUnaryOperator {
	public static List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF",
				"Azure", "Docker", "Kubernetes");
		
		//no input -> return something 
		Supplier<Integer> notRandomIntegerSupp = () -> 2; 
		Supplier<Integer> randomIntegerSupp = () -> {
			Random rnd = new Random();
			return rnd.nextInt(1000);
		};
		
		Supplier<Integer> numsSumSupp = () -> {
			return SupplierUnaryOperator.nums.stream().reduce(0, Integer::sum);
		}; 
		
		System.out.println(randomIntegerSupp.get());
		System.out.println(numsSumSupp.get());
		
		
		UnaryOperator<Integer> unaryOperator = x -> 3 * x;
		System.out.println(unaryOperator.apply(10));
		
		
	}
	

}
