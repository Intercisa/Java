package challenge;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// should return true
		System.out.println(checkForPalindrome("abccba"));
		// should return true
		System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
		// should return true
		System.out.println(checkForPalindrome("I did, did I?"));
		// should return false
		System.out.println(checkForPalindrome("hello"));
		// should return true
		System.out.println(checkForPalindrome("Don't nod"));

	}

	public static boolean checkForPalindrome(String string) {
		Queue<Character> queue = new LinkedList<Character>();
		LinkedList<Character> stack = new LinkedList<Character>();
 		
		for (Character c : string.toLowerCase().toCharArray()) {
			if(Character.isLetter(c)) {
				queue.add(c);
				stack.push(c);
			} 
		}
		
		while (!stack.isEmpty())
			if(stack.poll() != queue.poll()) return false;

		return true;
	}
}