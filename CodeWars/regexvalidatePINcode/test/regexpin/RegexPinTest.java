package regexpin;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class RegexPinTest {

	@Test
	void test_1() {
		assertEquals(true, RegexPin.validatePin("1234"));
        assertEquals(true, RegexPin.validatePin("0000"));
        assertEquals(true, RegexPin.validatePin("1111"));
        assertEquals(true, RegexPin.validatePin("123456"));
        assertEquals(true, RegexPin.validatePin("098765"));
        assertEquals(true, RegexPin.validatePin("000000"));
        assertEquals(true, RegexPin.validatePin("090909"));
	}
}
