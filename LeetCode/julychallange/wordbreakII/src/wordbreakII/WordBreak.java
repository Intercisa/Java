package wordbreakII;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class WordBreak {

	public List<String> wordBreak(String s, List<String> wordDict) {
		 return dfs(s, wordDict, new HashMap<String, LinkedList<String>>());
	}

	private List<String> dfs(String s, List<String> wordDict, HashMap<String, LinkedList<String>>map) {
		 if (map.containsKey(s)) return map.get(s);
		        
		    LinkedList<String>res = new LinkedList<String>();     
		    if (s.length() == 0) {
		        res.add("");
		        return res;
		    }   
		    
		    for (String word : wordDict) {
		        if (s.startsWith(word)) {
		            List<String>sublist = dfs(s.substring(word.length()), wordDict, map);
		            for (String sub : sublist) 
		                res.add(word + (sub.isEmpty() ? "" : " ") + sub);               
		        }
		    }       
		    map.put(s, res);
		    return res;
	}
}
