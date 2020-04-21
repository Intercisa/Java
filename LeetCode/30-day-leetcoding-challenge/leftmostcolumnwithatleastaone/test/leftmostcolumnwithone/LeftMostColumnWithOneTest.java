package leftmostcolumnwithone;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LeftMostColumnWithOneTest {
	private Matrix matrix;
	private int[][] testMatrixArr;
	
	
	@Test
	void test_1() {
		
		 testMatrixArr = new int[][]{{0,0},{1,1}};
		 matrix = new Matrix(testMatrixArr);
		
		LeftMostColumnWithOne leftMostColumnWithOne = new LeftMostColumnWithOne();
		assertEquals(0, leftMostColumnWithOne.leftMostColumnWithOne(matrix));

	}

	@Test
	void test_2() {
		
		 testMatrixArr = new int[][]{{0,0},{0,1}};
		 matrix = new Matrix(testMatrixArr);
		
		LeftMostColumnWithOne leftMostColumnWithOne = new LeftMostColumnWithOne();
		assertEquals(1, leftMostColumnWithOne.leftMostColumnWithOne(matrix));

	}
	
	
	@Test
	void test_3() {
		
		 testMatrixArr = new int[][]{{0,0},{0,0}};
		 matrix = new Matrix(testMatrixArr);
		
		LeftMostColumnWithOne leftMostColumnWithOne = new LeftMostColumnWithOne();
		assertEquals(-1, leftMostColumnWithOne.leftMostColumnWithOne(matrix));

	}
	
	
	@Test
	void test_4() {
		
		 testMatrixArr = new int[][]{{0,0,0,1},{0,0,1,0},{0,1,1,1}};
		 matrix = new Matrix(testMatrixArr);
		
		LeftMostColumnWithOne leftMostColumnWithOne = new LeftMostColumnWithOne();
		assertEquals(1, leftMostColumnWithOne.leftMostColumnWithOne(matrix));

	}
	
	

}
