package issubsequence;

import java.util.LinkedList;
import java.util.Queue;

public class IsSubsequence {

	public boolean isSubsequence(String s, String t) {
	   int index = -1;
       for (char c : s.toCharArray()){
           index = t.indexOf(c, index + 1); //if index == -1 it means that the character is not present or not in the right order 
           if (index == -1) return false;
       }
       return true;
	}

	public boolean isSubsequenceII(String s, String t) {
		   if (s.length() == 0) return true;
	        
		   int indexS = 0, indexT = 0;
	       
		   while (indexT < t.length()) {
	            if (s.charAt(indexS) == t.charAt(indexT)) {
	                indexS++;
	                if (indexS == s.length()) return true;
	            }
	            
	            indexT++;
	        }
	        return false;
	}
	
	
	public boolean isSubsequenceIII(String s, String t) {

		if(s.length() == 0) return true;

		Queue<Character> queue = new LinkedList<Character>();

		for (int i = 0; i < t.length(); i++) queue.add(t.charAt(i));
		
		int index = 0;
	
		while (!queue.isEmpty()) {
			char cur = queue.poll();
			
			if(s.charAt(index) == cur) {
				index++;
				if(index == s.length()) return true;
			}
		}
	return false;
	}
}
