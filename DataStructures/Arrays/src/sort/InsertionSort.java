package sort;

public class InsertionSort {

	/*
	 * 
	 * arr : 20 35 -15 7 55 1 -22
	 * 
	 * first iteration
	 * 
	 * firstUnsortedIndex = 1 - this is the first index of the unsorted partition
	 * i = 0 - index index used to traverse the array from right to left
	 * 
	 * newElement = 35 - the value we want to insert into the sorted partition -array[firstUnsortedIndex] 
	 * 
	 * 
	 * in-place algorithm
	 * 
	 * O(n2) - quadratic time complexity
	 * 
	 * Doesn't require as much swapping as bubble sort
	 * 
	 * stable algorithm
	 * 
	 */

	public static void main(String[] args) {
			insertionSort(Util.getDummyArr());
	}

	private static void insertionSort(int[] dummyArr) {
		
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < dummyArr.length; firstUnsortedIndex++) {
			int newElement = dummyArr[firstUnsortedIndex];
			
			int i; // we need this out of the loop
			for (i = firstUnsortedIndex; i > 0 && dummyArr[i - 1] > newElement; i--) {
				dummyArr[i] = dummyArr[i - 1];
			}
			
			dummyArr[i] = newElement;
		}
		Util.printArr(dummyArr);
	}
}