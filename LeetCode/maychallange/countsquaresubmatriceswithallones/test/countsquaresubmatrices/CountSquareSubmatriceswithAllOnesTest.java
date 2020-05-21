package countsquaresubmatrices;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CountSquareSubmatriceswithAllOnesTest {
		private CountSquareSubmatriceswithAllOnes countOnes = new CountSquareSubmatriceswithAllOnes();
	
	@Test
	void test_1() {
		int[][] matrix = new int [][] {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
		
		assertEquals(15, countOnes.countSquares(matrix));
		
	}
	
	@Test
	void test_2() {
		int[][] matrix = new int [][] {{1,0,1},{1,1,0},{1,1,0}};
		
		assertEquals(7, countOnes.countSquares(matrix));
	}
}
