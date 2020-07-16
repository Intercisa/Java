package sort;

public class Util {

	/*
	 * Util Class for the sorting Classes 
	 * 
	 */
	
	private Util() {}
	
	public static int[] getDummyArr() {
		return new int[] { 20, 35, -15, 7, 55, 1, -22 };
	}
	
	public static void swap(int[] dummyArr, int i, int j) {
		if (i == j) return;

		int temp = dummyArr[i];
		dummyArr[i] = dummyArr[j];
		dummyArr[j] = temp;
	}

	public static void printArr(int[] dummyArr) {
		System.out.println("Arr: ");
		for (int i : dummyArr) System.out.print(i + " ");
	}
	
	public static void printArr(String[] dummyArr) {
		System.out.println("Arr: ");
		for (String i : dummyArr) System.out.print(i + " ");
	}

}
