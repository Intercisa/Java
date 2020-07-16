package sort;

import java.util.Arrays;

public class SortWithJDK {

	
	public static void main(String[] args) {
		int[] dummyArr = Util.getDummyArr();
		
		
		Arrays.sort(dummyArr);
		
		
		Arrays.parallelSort(dummyArr);
		
		
		Util.printArr(dummyArr);
	}
	
	
}
