package sort;

public class RadixSort {

	/*
	 * arr: 
	 * 4725, 4586, 1330, 8792, 1594, 5729
	 * 
	 * makes assumptions about the data 
	 * data must have same radix and width (radix: same possible number -> the radix of English alphabet is 26)
	 * because of this, data must be integers or strings
	 * sort based on each individual digit or letter position
	 * start the rightmost position
	 * must use stable sort algorithm at each stage 
	 * 
	 * O(n)
	 * even so it often runs slower -> O(nlogn) because of the overhead involved 
	 * 
	 * in-place depends on which sort algorithm you use 
	 * stable algorithm 
	 * 
	 */

	public static void main(String[] args) {
		int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
		
		radixSort(radixArray, 10, 4);
		
		Util.printArr(radixArray);
	}

	private static void radixSort(int[] input, int radix, int width) {
		for (int i = 0; i < width; i++) 
			radixSingleSort(input, i, radix);
	}

	private static void radixSingleSort(int[] input, int position, int radix) {
		int numItems= input.length;
		int[] countArray = new int[radix];
		
		for (int value : input) 
			countArray[getDigit(position, value, radix)]++;
		
		// adjust the count array - stable algorithm 
		for (int i = 1; i < radix; i++) 
			countArray[i] += countArray[i - 1]; 
		
		int[] temp = new int[numItems];
		for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) 
			temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
		
		
		for (int tempIndex = 0; tempIndex < numItems; tempIndex++) 
			input[tempIndex] = temp[tempIndex];
		
	}

	private static int getDigit(int position, int value, int radix) {
		return value / (int)Math.pow(radix, position) % radix;
	}
	
}
