package sort;

/*
 * 
 * arr : 20 35 -15 7 55 1 -22
 * 
 * first iteration
 * 
 * unsortedPartitionIndex = 6 - this is the last index of the
 * unsorted partition 
 * i = 0... last index used to traverse the array from left to right
 * 
 * largest = 0 - index of largest element in unsorted partition
 * 
 * 
 * in-place algorithm 
 * 
 * O(n2) - quadratic time complexity 
 * 
 * Doesn't require as much swapping as bubble sort 
 * 
 * unstable algorithm 
 * 
 */

public class SelectionSort {

	public static void main(String[] args) {
		selectionSort(Util.getDummyArr());
	}

	private static void selectionSort(int[] dummyArr) {
		
		for (int lastUnsortedIndex = dummyArr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if(dummyArr[i] > dummyArr[largest]) largest = i;
			}
			Util.swap(dummyArr, largest, lastUnsortedIndex);
		}
		Util.printArr(dummyArr);
	}
}
