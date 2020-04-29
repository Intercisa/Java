package nonrepeatingcharacter;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonrepeatingCharacter {

	  public static String nonrepeatingCharacter(String str) {
		  Map<Character,Integer> orderedMap = new LinkedHashMap<>(str.length()); //important to maintain order!!!
	      char[] chars = str.toCharArray();
  	        for (char c : chars) {
	            orderedMap.put(c, orderedMap.containsKey(c) ? orderedMap.get(c) + 1 : 1);
	        }
	        
  	        for (char c : orderedMap.keySet()) {
				if(orderedMap.get(c) == 1)
					return String.valueOf(c);
			}
  	        
	        return "no repetations";
		  }
	
	
	
}