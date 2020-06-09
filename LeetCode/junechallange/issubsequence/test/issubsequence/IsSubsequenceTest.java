package issubsequence;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class IsSubsequenceTest {
	

	
	@Test
	void test_1() {
		assertEquals(true, new IsSubsequence().isSubsequence("abc", "ahbgdc"));
	}
	
	
	@Test
	void test_2() {
		assertEquals(false, new IsSubsequence().isSubsequence("axc", "ahbgdc"));
	}
	
	
	@Test
	void test_3() {
		assertEquals(false, new IsSubsequence().isSubsequence("aec", "abcde"));
	}
	
	@Test
	void test_4() {
		assertEquals(true, new IsSubsequence().isSubsequence("ace", "abcde"));
	}
	
	@Test
	void test_5() {
		assertEquals(false, new IsSubsequence().isSubsequence("bb", "ahbgdc"));
	}

}
