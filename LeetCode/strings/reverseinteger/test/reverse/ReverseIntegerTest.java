package reverse;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseIntegerTest {
	private ReverseInteger rev = new ReverseInteger();
	@Test
	void test_1() {
		assertEquals(321, rev.reverse(123));
	}
	
	@Test
	void test_2() {
		assertEquals(-321, rev.reverse(-123));
	}
	
	@Test
	void test_3() {
		assertEquals(21, rev.reverse(120));
	}
}
