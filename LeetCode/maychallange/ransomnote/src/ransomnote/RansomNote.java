package ransomnote;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	
	//better solution 
	public boolean canConstruct(String ransomNote, String magazine) {
	final int allLetterNum = 26;
	int[] pool = new int[allLetterNum]; //initialize an array with the size of the alphabet 
	
	for (char c : ransomNote.toCharArray()) pool[c - 'a'] -= 1 ; // letters you use - every time you found a letter you decrement with 1 >> means you used that   
	for (char c : magazine.toCharArray()) pool[c - 'a'] += 1 ; // add one every time you found a letter 
		
	for (int i = 0; i < allLetterNum; i++) 
		if(pool[i] < 0) return false; //if < 0 than there is not enough of that letter to make a ransom note -> return false   
		
	return true;	
		
	}
	
	public boolean canConstructSlow(String ransomNote, String magazine) {
		Map<Character, Integer> map = new HashMap<>();
		
		for (char c : magazine.toCharArray()) 
			map.put(c, map.getOrDefault(c, 0)+1); //neat solution to count each letter 

		for (char c  : ransomNote.toCharArray()) {
			if (!map.containsKey(c) || map.get(c) == 0) 
				return false;
			else
				map.put(c, map.get(c)-1); // because you can use each letter only once >> decrement every time you found a letter  
		}
		return true;
    }
}




