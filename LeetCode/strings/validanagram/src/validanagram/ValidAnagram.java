package validanagram;

public class ValidAnagram {
	  public boolean isAnagram(String s, String t) {
	        
		  if(s.length() != t.length()) return false;
		  int[] charPool = new int[26];
		  
		  for (int i = 0; i < s.length(); i++) {
			charPool[s.charAt(i) - 'a']++;
			charPool[t.charAt(i) - 'a']--;
		}
		  
		  for (int i = 0; i < charPool.length; i++) 
			if(charPool[i] != 0) return false;
		
		return true;  
		  
	    }
}



