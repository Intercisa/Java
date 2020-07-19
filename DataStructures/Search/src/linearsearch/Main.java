package linearsearch;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		int[] array = {20, 35, -15, 7, 55, 1, 22};
		
		System.out.println(linearSearch(array, -15));	
		
		System.out.println(IntStream.of(array)
				.filter(i -> i == -15)
				.findFirst()
				.isPresent());
	}

	private static boolean linearSearch(int[] array, int value) {
		for (int i = 0; i < array.length; i++) 
			if(array[i] == -15) return true;		
		return false;
	}
}
