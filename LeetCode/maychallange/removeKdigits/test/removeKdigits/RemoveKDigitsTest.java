package removeKdigits;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveKDigitsTest {

	RemoveKDigits removeKDig = new RemoveKDigits(); 
	
	@Test
	void test_1() {
		assertEquals("1219", removeKDig.removeKdigits("1432219", 3));
	}
	
	@Test
	void test_2() {
		assertEquals("200", removeKDig.removeKdigits("10200", 1));
	}
	
	@Test
	void test_3() {
		assertEquals("0", removeKDig.removeKdigits("10", 2));
	}

}
