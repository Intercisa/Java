package main;

import majorityelement.MajorityElement;

/*
 *Given an array of size n, find the majority element. 
 *The majority element is the element that appears more than L n/2 ⌋ times 
 *You may assume that the array is non-empty and the majority element always exist in the array.
 */

public class Main {

	public static void main(String[] args) {
	
		MajorityElement elem = new MajorityElement();
		System.out.println(elem.majorityElement(new int[] {3,2,3}));
	}
}
