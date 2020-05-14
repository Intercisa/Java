package stringtointegerATOI;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import stringtointeger.StringtoInteger;

class StringtoIntegerTest {
	private StringtoInteger strToInt = new StringtoInteger();
	@Test
	void test_1() {
		assertEquals(42, strToInt.myAtoi("42"));
	}
	
	@Test
	void test_2() {
		assertEquals(-42, strToInt.myAtoi("   -42"));
	}
	
	@Test
	void test_3() {
		assertEquals(4193, strToInt.myAtoi("4193 with words"));
	}
	
	@Test
	void test_4() {
		assertEquals(0, strToInt.myAtoi("words and 987"));
	}
	@Test
	void test_5() {
		assertEquals(-2147483648, strToInt.myAtoi("-91283472332"));
	}
}
