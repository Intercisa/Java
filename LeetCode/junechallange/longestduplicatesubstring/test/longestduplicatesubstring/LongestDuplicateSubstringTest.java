package longestduplicatesubstring;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LongestDuplicateSubstringTest {

	@Test
	void test_1() {
		assertEquals("ana", new LongestDuplicateSubstring().longestDupSubstring("banana"));
	}
	
	@Test
	void test_2() {
		assertEquals("", new LongestDuplicateSubstring().longestDupSubstring("abcd"));
	}
}
