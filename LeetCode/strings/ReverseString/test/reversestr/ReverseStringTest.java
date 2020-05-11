package reversestr;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	private ReverseString reverse = new ReverseString();
	private char[] result; 
	@Test
	void test_1() {
		
		result = reverse.reverseString(new char[] {'h','e','l','l','o'});
		assertEquals('o',result[0]);
		assertEquals('h', result[result.length-1]);
	}
	@Test
	void test_2() {
		
		result = reverse.reverseString(new char[] {'H','a','n','n','a','h'});
		assertEquals('h',result[0]);
		assertEquals('H', result[result.length-1]);
	}

}
