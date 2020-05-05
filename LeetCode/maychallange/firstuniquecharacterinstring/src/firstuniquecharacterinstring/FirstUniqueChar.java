package firstuniquecharacterinstring;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueChar {
	   public int firstUniqChar(String s) {
		   if (s == null || s.length() == 0) return -1;
		   
		   HashMap<Character, Integer> map = new LinkedHashMap<>();
		   
			for (char c : s.toCharArray()) 
				map.put(c, map.getOrDefault(c, 0)+1);
			   
			
			for (int i = 0; i < s.length(); i++) 
				if(map.get(s.charAt(i))==1) return i;
				
		   
	        return -1;
	    }
	   
	   
	   //faster solution: 
	   
	   public int firstUniqCharFast(String s) {
		   int res = Integer.MAX_VALUE;
		   
		   for(char ch = 'a'; ch <= 'z'; ch++) {
			   int index = s.indexOf(ch);
			   
			   if(index >= 0 && index == s.lastIndexOf(ch))
				   res = Math.min(res, index);
		   }

		   return res == Integer.MAX_VALUE? -1 : res;
	    }	   
}




