package main;

import subarraymax.MaximumSubarray;

/*
 * 
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray subarray = new MaximumSubarray();
		
		System.out.println(subarray.maxSubArray(arr));
	}

}
