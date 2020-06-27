package perfectsquares;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PerfectSquaresTest {

	@Test
	void test_1() {
		assertEquals(3, new PerfectSquares().numSquares(12));
	}
	

	@Test
	void test_2() {
		assertEquals(2, new PerfectSquares().numSquares(13));
	}
}
