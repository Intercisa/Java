package sort;

public class StringRadixSort {


	public static void stringRadixSort(String[] input, int radix, int width) {
		for (int i = width - 1; i >= 0; i--) 
			radixSingleStringSort(input, i, radix);
	}

	private static void radixSingleStringSort(String[] input, int position, int radix) {
		int numItems= input.length;
		int[] countArray = new int[radix];
		
		for (String value : input) 
			countArray[getIndex(position, value)]++;
		
		for (int i = 1; i < radix; i++) 
			countArray[i] += countArray[i - 1]; 
		
		String[] temp = new String[numItems];
		for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) 
			temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
		
		
		for (int tempIndex = 0; tempIndex < numItems; tempIndex++) 
			input[tempIndex] = temp[tempIndex];
	}

	private static int getIndex(int position, String value) {
		return value.charAt(position) - 'a';
	}
}
