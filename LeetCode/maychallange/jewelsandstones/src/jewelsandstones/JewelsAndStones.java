package jewelsandstones;

import java.util.HashMap;

public class JewelsAndStones {
	
	public int numJewelsInStones(String J, String S) {
		if (J == null || J.length() == 0) return 0;
		HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;
		
		for (char c : S.toCharArray()) 
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);

		
		for (char c : J.toCharArray()) 
			count += map.containsKey(c) ? map.get(c) : 0; 

		return count;
    }
	
	
	  public int numJewelsInStonesOtherSolution(String J, String S) {
	        if (J == null || J.length() == 0) return 0;

	        int count = 0;
	        for (Character c : S.toCharArray()) {
	            for (Character m : J.toCharArray()) {
	                if (m == c) {
	                    count++;
	                    break;
	                }
	            }
	        }
	        return count;
	    }	
}




