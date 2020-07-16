package sort;

public class MergeSortDesc {
	
	public static void descMergeSort(int[] dummyArr, int start, int end) {
		
		if(end - start < 2) return;
		
		int mid = (start + end) >>> 1;
		descMergeSort(dummyArr, start, mid);
		descMergeSort(dummyArr, mid, end);
		
		mergeDesc(dummyArr, start, mid, end);
	}

	private static void mergeDesc(int[] dummyArr, int start, int mid, int end) {
 
		if(dummyArr[mid - 1] >= dummyArr[mid]) return; 
	
		int i = start;
		int j = mid;
		int tempIndex = 0; 
		
		int[] temp = new int[end - start];
		
		while (i < mid && j < end)
			temp[tempIndex++] = dummyArr[i] >= dummyArr[j] ? dummyArr[i++] : dummyArr[j++];
		
		System.arraycopy(dummyArr, i, dummyArr, start + tempIndex, mid - i);
		
		System.arraycopy(temp, 0, dummyArr, start, tempIndex);
		
	}	
}
