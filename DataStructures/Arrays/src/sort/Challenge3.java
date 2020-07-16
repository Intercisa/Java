package sort;

public class Challenge3 {

	public static void main(String[] args) {

		String[] arr = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

		StringRadixSort.stringRadixSort(arr, 26, 5);
		
		Util.printArr(arr);
		
	}
	
}
