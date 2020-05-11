package main;

import intersection.IntersectionTwoArrays;

/*
 * Given two arrays, write a function to compute their intersection.
 * 
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * 
 * 
 *    What if the given array is already sorted? How would you optimize your algorithm?
 *    What if nums1's size is small compared to nums2's size? Which algorithm is better?
 *    What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		IntersectionTwoArrays twoArrays = new IntersectionTwoArrays();
		int[] res = twoArrays.intersect(new int[] {1,2,2,1}, new int[] {2,2}); 
		for (int i : res) 
			System.out.println(i);
	}
}
