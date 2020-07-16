package sort;

public class MergeSort {

	/*
	 * divide and conquer algorithm
	 * recursive algorithm
	 * two phases: splitting and merging
	 * splitting phase leads to faster sorting during the merging phase
	 * splitting is logical we don't create new arrays 
	 * 
	 * 
	 * splitting: 
	 * 	start with an unsorted array 
	 *  divide the array into two arrays, which are unsorted
	 *  the first array is the left array, and the second array is the right array
	 * 
	 *  split the left and right arrays into two arrays each 
	 *  keep splitting until all the arrays have only one element each - these arrays are sorted
	 *  
	 * merge: 
	 * 	merge every left/right pair of sibling arrays into a sorted array
	 *  after the first merge, we'll have a bunch of 2-element sorted arrays
	 *  then merge those sorted arrays (left/right siblings) to end with a bunch of 4-element sorted arrays 
	 *  repeat until you have a single sorted array
	 *  
	 *  we merge sibling left and right arrays
	 *  we create a temporary array large enough to hold all the elements in the arrays we're merging
	 *  we set it to the first index of the left array, and j to the first index of the right array
	 *  we compare left[i] to right[j] if left is smaller we copy it to the temp array and increment i by 1
	 *  if right is smaller we copy it to the temp array and j by 1 
	 *  
	 *  we repeat this process until all elements in the two arrays have been processed
	 *  
	 * 
	 * not in-place
	 * uses temporary arrays
	 * O(nlogn) - base 2 we're repeatedly dividing the array in half during the splitting phase 
	 * 
	 * stable algorithm
	 * 
	 * 
	 *  mid: int mid = low + ((high - low) / 2);
	 *  	  ||
	 *       int mid = (low + high) >>> 1; -> faster 
	 * 
	 * https://ai.googleblog.com/2006/06/extra-extra-read-all-about-it-nearly.html#!/2006/06/extra-extra-read-all-about-it-nearly.html
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] dummyArr = Util.getDummyArr();
		int start = 0;
		int end = dummyArr.length;
		
		mergeSort(dummyArr, start, end);
		
		Util.printArr(dummyArr);
		
	}

	private static void mergeSort(int[] dummyArr, int start, int end) {
		
		if(end - start < 2) return;
		
		int mid = (start + end) >>> 1;
		mergeSort(dummyArr, start, mid);
		mergeSort(dummyArr, mid, end);
		
		merge(dummyArr, start, mid, end);

	}

	private static void merge(int[] dummyArr, int start, int mid, int end) {
		// first optimization 
		if(dummyArr[mid - 1] <= dummyArr[mid]) return; // if the last element in the left array is smaller or equal with the first element in the right array -> coz they are already sorted so we return 
	
		int i = start;
		int j = mid;
		int tempIndex = 0; // track where we are in the temp array
		
		int[] temp = new int[end - start];
		
		while (i < mid && j < end)
			temp[tempIndex++] = dummyArr[i] <= dummyArr[j] ? dummyArr[i++] : dummyArr[j++];
		
		
		// second optimization
		// if there is leftover element(s) in the left array we have to handle them (copy them) 
		// if there is leftover element(s) in the right array we  don't have to handle them because they are already the biggest elements 
		System.arraycopy(dummyArr, i, dummyArr, start + tempIndex, mid - i);
		
		System.arraycopy(temp, 0, dummyArr, start, tempIndex);
		
	}	
}
