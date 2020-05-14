package validpalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ValidPalindromeTest {
	private ValidPalindrome valid = new ValidPalindrome();
	@Test
	void test_1() {
		assertEquals(true, valid.isPalindrome("A man, a plan, a canal: Panama"));
	}
	
	@Test
	void test_2() {
		assertEquals(false, valid.isPalindrome("race a car"));
	}
}
