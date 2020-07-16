package sort;

public class CountingSort {

	/*
	 * arr:
	 * 2, 5, 9, 8, 2, 8, 7, 10, 4, 3
	 * 
	 * makes assumptions about the data
	 * dosen't use comparisons
	 * counts the number of occurrences of each value
	 * only works with non-negative discrete values (can't work with floats, strings)
	 * values must be within a specific range 
	 * 
	 * assume we have values between 1 and 10 inclusive
	 * we have 10 possible values, so we create a counting array of length 10
	 * traverse the input array from left to right
	 * use the counting array to track how many of each value are in the input array 
	 * using the counts in the counting array, write the values in sorted order to the input array
	 * 
	 * on in-place 
	 * O(n) - can achieve this because we're making assumptions about the data we're sorting
	 * 
	 *  if we want the sort to be stable, we have to do some extra steps 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] input = new int[] {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
		countingSort(input, 1, 10);
		
		Util.printArr(input);
	}

	private static void countingSort(int[] input, int min, int max) {
		int[] countArr = new int[(max - min) + 1];
		
		for (int i = 0; i < input.length; i++) 
			countArr[input[i] - min]++;   // we translate the min to max into a 0 to max array 
		
		int index = 0;
		for (int i = min; i <= max; i++) {
			while (countArr[i - min] > 0) {
				input[index++] = i;
				countArr[i - min]--; // decrementing the count to 0 
			}
		}
	}
}
