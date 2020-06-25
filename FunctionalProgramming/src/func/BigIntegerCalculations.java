package func;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BigIntegerCalculations {
	public static void main(String[] args) {
		System.out.println(IntStream
				.rangeClosed(1, 50)
				.reduce(1, (x,y) -> x*y)); //exceeds the limit of Integer capacity -> result = 0
		
		
		System.out.println(LongStream
				.rangeClosed(1, 50)
				.reduce(1L, (x,y) -> x*y)); //still not working 
		
		
		System.out.println(LongStream
				.rangeClosed(1, 50)
				.mapToObj(BigInteger::valueOf)
				.reduce(BigInteger.ONE, BigInteger::multiply)); //it is working  
	}
}
