package adddigits;

import java.util.Stack;

public class AddDigits {
	
	 public int addDigits(int num) {
		 return 1 + (num - 1) % 9;
	 }
	
	public int addDigitsII(int num) {
		return rootDigits(num);
	}

	private int rootDigits(int num) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int mod, sum = 0;
		stack.push(num);
		
		while (!stack.isEmpty()) {
			sum = 0;
			int temp = stack.pop();
			while (temp > 0) {
				mod= temp%10;
				temp/=10;
				sum += mod;
			}

			if(sum%10==sum) break;
			else stack.push(sum);
		}
		return sum;
	}
}
