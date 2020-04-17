package main;

import singlenum.SingleNumber;

/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
	Note:
	Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */


public class Main {

	public static void main(String[] args) {
		
		int[] arr = {2,2,1};
		
		SingleNumber singleNumber = new SingleNumber();
		
		singleNumber.singleNumber(arr);

	}

}
