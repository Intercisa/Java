package main;

import countingelements.CountingElements;

/*
 * Given an integer array arr, count element x such that x + 1 is also in arr.
   If there're duplicates in arr, count them seperately.
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		int[] countArr = {1,1,2,2};
		
		CountingElements elems = new CountingElements();
		elems.countElements(countArr);
		

	}

}
