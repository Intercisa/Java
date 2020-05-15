package maximumsumcircularsubarray;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MaximumSumCircularSubarrayTest {
	private MaximumSumCircularSubarray maxCircularsSub = new MaximumSumCircularSubarray();
	@Test
	void test_1() {
		assertEquals(3, maxCircularsSub.maxSubarraySumCircular(new int[] {1,-2,3,-2}));
	}
	@Test
	void test_2() {
		assertEquals(10, maxCircularsSub.maxSubarraySumCircular(new int[] {5,-3,5}));
	}
	@Test
	void test_3() {
		assertEquals(4, maxCircularsSub.maxSubarraySumCircular(new int[] {3,-1,2,-1}));
	}
	@Test
	void test_4() {
		assertEquals(3, maxCircularsSub.maxSubarraySumCircular(new int[] {3,-2,2,-3}));
	}
	@Test
	void test_5() {
		assertEquals(-1, maxCircularsSub.maxSubarraySumCircular(new int[] {-2,-3,-1}));
	}
}
