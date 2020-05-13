package removeKdigits;

import java.util.LinkedList;
import java.util.Stack;

public class RemoveKDigits {
	// Greedy Algorithm

	//LinkedList
	public String removeKdigits(String num, int k) {
		LinkedList<Character> stack = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		for (char digit : num.toCharArray()) {
			while (stack.size() > 0 && k > 0 && stack.peekLast() > digit) {
				stack.removeLast();
				k--;
			}
			stack.addLast(digit);
		}	
		
		//remove remaining  digits from the tail
		for(int i = 0; i<k; i++) 
			stack.removeLast();
		
		boolean isLeadingZero = true;
		for (char digit : stack) {
			if(isLeadingZero && digit == '0') continue;
			isLeadingZero = false;
			sb.append(digit);
		}
		
		if(sb.length() == 0) return "0";
		return sb.toString();
	}
	
	
	public String removeKdigitsStack(String num, int k) {
		int N = num.length();
		if (k == N) return "0";
		
		StringBuilder sb = new StringBuilder();

		Stack<Character> stack = new Stack<>();

		int counter = 0;
		while (counter < N) {

			while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(counter)) {
				stack.pop();
				k--;
			}

			stack.push(num.charAt(counter));
			counter++;
		}

		// edge case if the num is all repeating >> 1111
		while (k > 0) {
			stack.pop();
			k--;
		}

		while (!stack.isEmpty()) {
			char currCh = stack.pop();
			sb.append(currCh);
		}

		sb.reverse(); //need this because we use stack 

		while (sb.length() > 1 && sb.charAt(0) == '0') { //if there is a zero on the front of our number  
			sb.deleteCharAt(0);
		}

		return sb.toString();

	}
}
