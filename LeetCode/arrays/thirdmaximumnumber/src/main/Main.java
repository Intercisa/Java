package main;

/*
 * 
 * Given a non-empty array of integers, return the third maximum number in this array. 
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 * 
 * 
 *   Use a TreeSet, as it is kind of like a Set and PriorityQueue combined
 *       the Set part will remove duplicates for us
 *       the PriorityQueue part will keep our elements in sorted order
 *   If TreeSet size grows beyond 3, remove the first (smallest) element in it, 
 *   so that the 3rd element is always our third maximum number.
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
	}
}
