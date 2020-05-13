package thirdmaximumnumber;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ThirdMaximumNumberTest {
	ThirdMaximumNumber thirdMax = new ThirdMaximumNumber();
	
	@Test
	void test_1() {
		assertEquals(1, thirdMax.thirdMax(new int[] {3, 2, 1}));
	}
	@Test
	void test_2() {
		assertEquals(2, thirdMax.thirdMax(new int[] {1,2,}));
	}
	@Test
	void test_3() {
		assertEquals(1, thirdMax.thirdMax(new int[] {2,2,3,1}));
	}
}
