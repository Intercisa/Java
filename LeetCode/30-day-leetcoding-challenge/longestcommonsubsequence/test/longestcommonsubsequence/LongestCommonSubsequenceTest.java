package longestcommonsubsequence;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceTest {
		
	private LongestCommonSubsequence longestSubsequence = new LongestCommonSubsequence();
	
	@Test
	void test_1() {
		assertEquals(3, longestSubsequence.longestCommonSubsequence("abcde", "ace"));
	}
	
	@Test
	void test_2() {
		assertEquals(3, longestSubsequence.longestCommonSubsequence("abc", "abc"));
	}
	
	@Test
	void test_3() {
		assertEquals(0, longestSubsequence.longestCommonSubsequence("abc", "def"));
	}
	


}
