package main.java.longestpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    @Test
    void longestPalindrome() {
        assertEquals(7, new LongestPalindrome().longestPalindrome("abccccdd"));
    }
}