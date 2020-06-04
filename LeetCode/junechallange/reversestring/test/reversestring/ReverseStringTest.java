package reversestring;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test_1() {
		assertArrayEquals(new char[] {'o','l','l','e','h'}, new ReverseString().reverseString(new char[] {'h','e','l','l','o'}));
	}
	
	@Test
	void test_2() {
		assertArrayEquals(new char[] {'h','a','n','n','a','H'}, new ReverseString().reverseString(new char[] {'H','a','n','n','a','h'}));
	}
}
