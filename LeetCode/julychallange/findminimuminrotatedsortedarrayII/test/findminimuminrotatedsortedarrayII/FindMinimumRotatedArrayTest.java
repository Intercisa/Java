package findminimuminrotatedsortedarrayII;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FindMinimumRotatedArrayTest {

	@Test
	void test_1() {
		assertEquals(1, new FindMinimumRotatedArray().findMin(new int[] {1,3,5}));
	}
	@Test
	void test_2() {
		assertEquals(0, new FindMinimumRotatedArray().findMin(new int[] {2,2,2,0,1}));
	}
}
