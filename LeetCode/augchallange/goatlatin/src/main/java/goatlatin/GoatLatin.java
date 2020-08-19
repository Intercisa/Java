package main.java.goatlatin;

import java.util.*;

public class GoatLatin {
    private static final  String MA = "ma";
    private static final String A = "a";
    public String toGoatLatin(String S) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A','E','I', 'O', 'U'));
        String[] words = S.split(" ");

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            if(set.contains(word.charAt(0))) word.append(MA);
            else word = new StringBuilder(word.substring(1) + word.charAt(0) + MA);

            word.append(A.repeat(i + 1));

            words[i] = word.toString();
        }
        return  String.join(" ", words);
    }
}
