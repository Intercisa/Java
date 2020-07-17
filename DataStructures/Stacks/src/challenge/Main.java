package challenge;

import java.util.LinkedList;

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
		LinkedList<Character> stack = new LinkedList<Character>();

		for (char c : string.toLowerCase().toCharArray()) 
			if (Character.isLetter(c)) stack.push(c);
		
		for (char c : string.toLowerCase().toCharArray()) 
			if (Character.isLetter(c) && c != stack.poll()) return false;

		return true;
	}
}
