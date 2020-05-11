package main;

import plusone.PlusOne;

/*
 * 
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		PlusOne plusOne = new PlusOne();
		int[] res = plusOne.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
		for (int i : res) 
			System.out.println(i);
		
	}
}
