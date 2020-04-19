package main;

import searchinrotatedsortedarray.SearchInRotatedSortedArray;

/*
 *Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
	(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
	You are given a target value to search. If found in the array return its index, otherwise return -1.
	You may assume no duplicate exists in the array.
	Your algorithm's runtime complexity must be in the order of O(log n).
 */

public class Main {

	public static void main(String[] args) {
		
		int nums[] = new  int[] {4,5,6,7,0,1,2};
		int target = 0;
		
		SearchInRotatedSortedArray rotatedSortedArray = new SearchInRotatedSortedArray();
		System.out.println(rotatedSortedArray.search(nums, target));
		

	}
}
