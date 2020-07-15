package array;

public class ArraysInGeneral {

	public static void main(String[] args) {

		int[] intArray = new int[7];

		intArray[0] = 20; // first index
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22; // last index

		for (int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);

		int index = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == 7) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
