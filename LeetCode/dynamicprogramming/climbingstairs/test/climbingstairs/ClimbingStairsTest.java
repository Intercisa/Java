package climbingstairs;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ClimbingStairsTest {
	

	
	@Test
	void test_1() {
		assertEquals(2, new ClimbingStairs().climbStairs(2));
	}

	@Test
	void test_2() {
		assertEquals(3, new ClimbingStairs().climbStairs(3));
	}
}
