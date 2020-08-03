package main.java.validpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindrome_2() {
        assertFalse(new ValidPalindrome().isPalindrome("race a car"));
    }
}