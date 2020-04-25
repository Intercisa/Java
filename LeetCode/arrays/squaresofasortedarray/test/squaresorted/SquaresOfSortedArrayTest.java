package squaresorted;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SquaresOfSortedArrayTest {

	private SquaresOfSortedArray squareSorted = new SquaresOfSortedArray();
	
	@Test
	void test_1() {
		
		int[] arrExpected = new int[] {0,1,9,16,100};
		int[] arrActual = squareSorted.sortedSquares(new int[] {-4,-1,0,3,10});
		int len = arrExpected.length;
		
		assertEquals(arrExpected[0], arrActual[0]);
		assertEquals(arrExpected[len-1], arrActual[len-1]);
	}
	
	@Test
	void test_2() {
		
		int[] arrExpected = new int[] {4,9,9,49,121};
		int[] arrActual = squareSorted.sortedSquares(new int[] {-7,-3,2,3,11});
		int len = arrExpected.length;
		
		assertEquals(arrExpected[0], arrActual[0]);
		assertEquals(arrExpected[len-1], arrActual[len-1]);
	}
	

}
