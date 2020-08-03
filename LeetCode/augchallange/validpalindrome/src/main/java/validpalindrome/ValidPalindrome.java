package main.java.validpalindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase().replaceAll("[^a-z0-9]", ""));

        for (int i = 0; i < sb.length(); i++)
            if(sb.charAt(i) != sb.charAt(sb.length() - i - 1)) return false;

        return true;
    }
}
