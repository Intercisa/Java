package main;

/*
 * 
 * Given a non-negative integer num represented as a string, remove k digits from the number 
 * so that the new number is the smallest possible. 
 * 
 * 
 * num = 1432219
 *
 * stack = 1
 * 		1 >> 4 -> +3
 * 		stack 1 4
 * 	
 * 		4 >> 3 -> -1  !!!
 * 		stack 1 3
 * 	//whenever we found a decrease we pick the that
 * 
 * 		3 >> 2 -> -1
 * 		stack 1 2
 * 
 *		...
 * 
 */

public class Main {

	public static void main(String[] args) {
	}
}
