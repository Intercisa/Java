package strstr;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class StrStrTest {

	private StrStr strStr = new StrStr();
	@Test
	void test_1() {
		assertEquals(2, strStr.strStr("hello", "ll"));
	}
	
	@Test
	void test_2() {
		assertEquals(-1, strStr.strStr("aaaaa", "bba"));
	}
	
}
