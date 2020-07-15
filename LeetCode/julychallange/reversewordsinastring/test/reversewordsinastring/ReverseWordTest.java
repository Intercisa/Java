package reversewordsinastring;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseWordTest {

	@Test
	void test_1() {
		assertEquals("blue is sky the", new ReverseWord().reverseWords("the sky is blue"));
	}
	
	@Test
	void test_2() {
		assertEquals("world! hello", new ReverseWord().reverseWords("  hello world!  "));
	}
	
	@Test
	void test_3() {
		assertEquals("example good a", new ReverseWord().reverseWords("a good   example"));
	}
}
