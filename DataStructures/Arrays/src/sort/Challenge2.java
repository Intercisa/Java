package sort;

public class Challenge2 {

	public static void main(String[] args) {

		int[] arr = Util.getDummyArr();

		InsertionSortRecursive.insertionSortRecursive(arr, arr.length);
		
		Util.printArr(arr);
		
	}
	
}
