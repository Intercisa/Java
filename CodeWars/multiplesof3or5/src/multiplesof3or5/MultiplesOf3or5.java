package multiplesof3or5;

import java.util.stream.IntStream;

public class MultiplesOf3or5 {

	public int solutionForLoop(int number) {
		int ans = 0;
		for (int i = 1; i < number; i++)
			if (i % 3 == 0 || i % 5 == 0)
				ans += i;

		return ans;
	}
	
	//intStream
	public int solution(int number) {
		return IntStream.range(1, number)
				.filter(num -> num%3==0 || num%5==0)
				.sum();
	}
	
	
}
