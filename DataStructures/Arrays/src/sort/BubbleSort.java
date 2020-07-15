package sort;

public class BubbleSort {

	/*
	 * 
	 * arr : 20 35 -15 7 55 1 -22
	 * 
	 * first iteration 
	 * 
	 * unsortedPartitionIndex = 6 - this is the last index of the
	 * unsorted partition i = 0... last index used to traverse the array from left
	 * to right
	 * 
	 * second iteration 
	 * 
	 * usortedPartitionIndex = 5 - this is the last index of the
	 * unsorted partition i = 0... last index used to traverse the array from left
	 * to right
	 * 
	 * ...
	 * 
	 * 
	 * In-place algorithm
	 * 
	 * O(n2) time complexity - quadratic
	 * 
	 * algorithm degrades quickly
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		bubbleSort(Util.getDummyArr());
	}

	private static void bubbleSort(int[] arr) {
		for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++)
				if (arr[i] > arr[i + 1]) 
					Util.swap(arr, i, i + 1);
		}
		Util.printArr(arr);
	}
}
