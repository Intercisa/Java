package uglynumII;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class UglyNumberIITest {

	@Test
	void test_1() {
		assertEquals(12, new UglyNumberII().nthUglyNumber(10));
	}
}
