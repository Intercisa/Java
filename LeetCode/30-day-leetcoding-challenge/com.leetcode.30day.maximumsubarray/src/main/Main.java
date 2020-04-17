package main;

import subarraymax.MaximumSubarray;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray subarray = new MaximumSubarray();
		
		System.out.println(subarray.maxSubArray(arr));
	}

}
