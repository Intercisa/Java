package perfectsquare;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ValidPerfectSquareTest {

	ValidPerfectSquare  validSquare= new ValidPerfectSquare();
	
	@Test
	void test_1() {
		assertEquals(true, validSquare.isPerfectSquare(16));
	}
	
	@Test
	void test_2() {
		assertEquals(false, validSquare.isPerfectSquare(14));
	}

	@Test
	void test_3() {
		assertEquals(true, validSquare.isPerfectSquare(1));
	}
	
	@Test
	void test_4() {
		assertEquals(true, validSquare.isPerfectSquare(25));
	}
	
	@Test
	void test_5() {
		assertEquals(true, validSquare.isPerfectSquare(9));
	}
	
	@Test
	void test_6() {
		assertEquals(true, validSquare.isPerfectSquare(100));
	}
	
	@Test
	void test_7() {
		assertEquals(true, validSquare.isPerfectSquare(81));
	}
	
	@Test
	void test_8() {
		assertEquals(true, validSquare.isPerfectSquare(225));
	}
	
	@Test
	void test_9() {
		assertEquals(true, validSquare.isPerfectSquare(400));
	}
}
