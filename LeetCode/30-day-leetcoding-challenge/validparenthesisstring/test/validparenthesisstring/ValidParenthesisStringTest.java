package validparenthesisstring;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ValidParenthesisStringTest {

	private ValidParenthesisString validString = new ValidParenthesisString();
	
	@Test
	void test_1() {
		assertEquals(validString.checkValidString("(*)"), true);
	}
	
	@Test
	void test_2() {
		assertEquals(validString.checkValidString("()"), true);
	}
	
	@Test
	void test_3() {
		assertEquals(validString.checkValidString("(*))"), true);
	}

}
