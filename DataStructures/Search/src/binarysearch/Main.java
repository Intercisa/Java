package binarysearch;

import java.util.Arrays;

public class Main {

	/*
	 * Data must be sorted chooses the element in the middle of the array and
	 * compares it against the serach value if the element is equal to the value
	 * we're done if greater search the left of the array if smaller search the
	 * right of the array
	 * 
	 * int mid = (low + high) >>> 1; -> faster
	 */

	private static int[] array = { 20, 35, -15, 7, 55, 1, 22 };

	public static void main(String[] args) {
		int start = 0;
		int end = array.length;
		Arrays.sort(array);
		boolean isPresent = binarySearchIterative(start, end, 1);
		System.out.println(isPresent);
		isPresent = binarySearchRecursive(start, end - 1, 1);
		System.out.println(isPresent);
	}

	private static boolean binarySearchIterative(int start, int end, int value) {
		
		while (start < end) {
			int mid = (start + end) >>> 1;
			
			if(array[mid] == value) return true;
			
			else if(array[mid] < value)
				start = mid++;
			else
				end = mid--;
		}
		return false;
	}
	
	private static boolean binarySearchRecursive(int start, int end, int value) {

		if (end < start)return false;

		int mid = (start + end) >>> 1;

		if (value == array[mid])return true;

		else if (value < array[mid])
			return binarySearchRecursive(start, mid - 1, value);
		else
			return binarySearchRecursive(mid + 1, end, value);
	}
}
