package longestcommonprefix;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

	@Test
	void test_1() {
		assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix(new String[] {"flower","flow","flight"}));
	}
	
	@Test
	void test_2() {
		assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[] {"dog","racecar","car"}));
	}
}
