package main;

import duplicatezeros.DuplicateZeros;

/*
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
	Note that elements beyond the length of the original array are not written.
	Do the above modifications to the input array in place, do not return anything from your function.
 */


public class Main {

	public static void main(String[] args) {
		int arr[] = new int[]{1,0,2,3,0,4,5,0};
		DuplicateZeros zeros = new DuplicateZeros();
		zeros.duplicateZeros(arr);
		
	}
}
