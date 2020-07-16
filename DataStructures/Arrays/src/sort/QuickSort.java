package sort;

public class QuickSort {

	/*
	 * divide and conquer algorithm
	 * recursive algorithm
	 * uses a pivot element to partition the array into two parts
	 * elements < pivot to its left, elements > pivot to its right 
	 * pivot will then be in its correct sorted position
	 * 
	 * 
	 * 
	 * in-place algorithm
	 * O(nlog) - base 2 
	 * unstable algorithm 
	 */
	
	
	public static void main(String[] args) {
		
		int[] dummyArr = Util.getDummyArr();
		quickSort(dummyArr, 0, dummyArr.length);
		
		Util.printArr(dummyArr);
		
	}

	private static void quickSort(int[] dummyArr, int start, int end) {
		if(end - start < 2) return; // one element array 
		
		int pivotIndex = partition(dummyArr, start, end);
		quickSort(dummyArr, start, pivotIndex);
		quickSort(dummyArr, pivotIndex+1, end); // +1 because the pivot is in the right position already 
		
	}

	private static int partition(int[] dummyArr, int start, int end) {
		// This is using the first element as the pivot
		int pivot = dummyArr[start];
		int i = start;
		int j = end;

		while (i < j) {
			// empty loop body only decrement j 
			while (i < j && dummyArr[--j] >= pivot);
			
			if(i < j ) 
				dummyArr[i] = dummyArr[j];
			
			// empty loop body only increment i 
			while (i < j && dummyArr[++i] <= pivot);
			
			if(i < j) 
				dummyArr[j] = dummyArr[i];
		}
		dummyArr[j] = pivot;
		return j;
	}
}
