package main;

import subarraysumequalsk.SubarraySumEqualsK;

//Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.


public class Main {

	public static void main(String[] args) {
		int arr[] = new int[]{1,1,1};
		
		SubarraySumEqualsK subarraySumEquals = new SubarraySumEqualsK();
		System.out.println(subarraySumEquals.subarraySum(arr, 2));
	}
}
