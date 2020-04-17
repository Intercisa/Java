package main;

import contiguousarray.ContiguousArray;
//Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1. 

public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[]{0,1,0};
		
		ContiguousArray contiguousArray = new ContiguousArray();
		
		System.out.println(contiguousArray.findMaxLength(arr));
		
		System.out.println(contiguousArray.findMaxLengthFasster(arr));
		

	}

}
