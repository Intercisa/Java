package countingelements;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
	
	public int countElements(int[] arr) {
        
        int res = 0;    
		int n = arr.length;
		Set<Integer> set = new HashSet<>();
		
		for (int num : arr) {set.add(num);}
		
	    for (int i = 0; i < n; i++) {
	    	if(set.contains(arr[i]+1)) {
	    		res++;
	    	}	
		}
	    
		return res;
 
    }

	
}

/*
 * Same with map - set is better 
 * 
	public int countElements(int[] arr) {
	    int res = 0;    
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : arr) {map.put(i, 0);}
		
	    for (int i = 0; i < n; i++) {
			
	    	if(map.containsKey(arr[i]+1)) {
	    		res++;
	    	}	
		}
	    
		return res;
	   }
 * 
 * 
 * 
 */

