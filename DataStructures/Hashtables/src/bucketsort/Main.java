package bucketsort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	/*
	 * Bucket Sort
	 * 
	 * 54, 46, 83, 66, 95, 92, 43
	 * 
	 * Makes assumptions about the data, like radix and counting sort (insertion sort is used for the most)
	 * can sort in O(n) time
	 * 
	 * not in-place 
	 * 
	 * stability will depends on which sorting algorithm used to sort the buckets
	 * 
	 */
	
	
	public static void main(String[] args) {

		int[] array = {54, 46, 83, 66, 95, 92, 43};
		
		bucketSort(array);
		
		for (int num : array) 
			System.out.print(num + " ");
	}

	private static void bucketSort(int[] input) {
		List<Integer>[] buckets = new List[10];	 // we based our buckets on base 10	(10ths, 20ths, 30ths...)
		
		for (int i = 0; i < buckets.length; i++) 
			buckets[i] = new LinkedList<Integer>();
		
		for (int i = 0; i < input.length; i++) 
			buckets[hashEntry(input[i])].add(input[i]);
		
		for (List<Integer> bucket : buckets)
			Collections.sort(bucket);
		
		int j = 0;
		for (int i = 0; i < buckets.length; i++) {
			for (int value : buckets[i]) 
				input[j++] = value;
		}
	}
	
	private static int hashEntry(int value) {
		return value / 10;
	}
}
