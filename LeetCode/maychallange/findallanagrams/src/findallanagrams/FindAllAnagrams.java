package findallanagrams;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
	
	public List<Integer> findAnagrams(String s, String p) {
		
	    List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) return res;

        int[] map_p = new int[26];
        int[] map_s = new int[26];
        
        //init  maps
        for (int i = 0; i < p.length(); i++) {
            map_p[p.charAt(i) - 'a']++;
            map_s[s.charAt(i) - 'a']++;
        }
   
        for (int i = 0; i < s.length() - p.length(); i++) {
            if (isMatch(map_p, map_s)) 
                res.add(i);
            
            
            // if don't match, we move the sliding window!!
            // remove the preceding character and add a new succeeding character to the new window
            map_s[s.charAt(i+p.length()) - 'a']++;
            map_s[s.charAt(i) - 'a']--;
        }
        
        
        if (isMatch(map_p, map_s)) 
            res.add(s.length() - p.length());
        
        return res;
		
	}
    public boolean isMatch(int[] arrP, int[] arrS) {
        
    	for (int i = 0; i < arrP.length; i++) 
            if (arrP[i] != arrS[i]) 
                return false;
        
        return true;
    }

}