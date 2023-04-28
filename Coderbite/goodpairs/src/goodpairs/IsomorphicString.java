package goodpairs;

import java.util.LinkedHashMap;
import java.util.Map;

public class IsomorphicString {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new LinkedHashMap<>();
        Map<Character, Integer> tMap = new LinkedHashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        fillMap(sChars, sMap);
        fillMap(tChars, tMap);

        int[] sArr = sMap.values().stream().mapToInt(Integer::intValue).toArray();
        int[] tArr = tMap.values().stream().mapToInt(Integer::intValue).toArray();

        if (tArr.length != sArr.length) return false;

        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] != sArr[i]) return false;
        }

        return true;

    }

    private static void fillMap(char[] chars, Map<Character, Integer> map) {
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }
        }
    }
}
