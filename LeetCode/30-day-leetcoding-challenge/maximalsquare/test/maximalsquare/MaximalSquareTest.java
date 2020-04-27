package maximalsquare;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MaximalSquareTest {

	
	@Test
	void test_1() {
		MaximalSquare maximalSquare = new MaximalSquare();
		
		assertEquals(4, maximalSquare.maximalSquare(new char[][] {{'1','0','1','0','0'},
																  {'1','0','1','1','1'},
																  {'1','1','1','1','1'},
																  {'1','0','0','1','0'}}));
	}

	

}
