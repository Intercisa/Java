package uglynum;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class UglyNumberTest {

	@Test
	void test_1() {
		assertEquals(true, new UglyNumber().isUgly(6));
	}
	
	@Test
	void test_2() {
		assertEquals(true, new UglyNumber().isUgly(8));
	}
	
	@Test
	void test_3() {
		assertEquals(false, new UglyNumber().isUgly(14));
	}
}
