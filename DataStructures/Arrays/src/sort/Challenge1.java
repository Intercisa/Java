package sort;

public class Challenge1 {

	public static void main(String[] args) {

		int[] arr = Util.getDummyArr();
		int start = 0;
		int end = arr.length;
		
		MergeSortDesc.descMergeSort(arr, start, end);
		
		Util.printArr(arr);
		
	}
	
}
