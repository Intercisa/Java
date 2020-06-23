package func;

import java.util.List;

public class Func02Map {
	public static void main(String[] args) {
		List<Integer> list = List.of(12,9,13,4,6,2,4,12,15);
	
		printSquaresOfEvenNumbersInList(list);
	}

	private static void printSquaresOfEvenNumbersInList(List<Integer> list) {
		list.stream()
		.filter(n -> n%2 == 0)
		.map(n -> n * n)
		.forEach(System.out::println);
	}
}
