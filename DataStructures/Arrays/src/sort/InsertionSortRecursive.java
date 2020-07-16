package sort;

public class InsertionSortRecursive {

	public static void insertionSortRecursive(int[] dummyArr, int numItems) {
		if(numItems < 2) return;
		
		insertionSortRecursive(dummyArr, numItems - 1);
		int newElement = dummyArr[numItems-1];
		
		int i;
		for (i = numItems -1; i > 0 && dummyArr[i - 1] > newElement; i--) 
			dummyArr[i] = dummyArr[i -1];
		
		dummyArr[i] = newElement;
		
		System.out.print("Result of call when numItems = " + numItems+ ": " );
		for (int j = 0; j < dummyArr.length; j++) 
			System.out.print(dummyArr[j]+", ");
		
		System.out.println();
		
		
	}

}