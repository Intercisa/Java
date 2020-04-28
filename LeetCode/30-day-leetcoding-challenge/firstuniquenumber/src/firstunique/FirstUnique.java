package firstunique;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class FirstUnique {
	private Deque<Integer> deque = new LinkedList<Integer>();
	private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	 public FirstUnique(int[] nums) {
		 for (int i = 0; i < nums.length; i++) 
			add(nums[i]);
	    }
	    
		public int showFirstUnique() {
			if(deque.size() == 0) return -1;

			while (deque.size() > 0 
					&& map.containsKey(deque.peekFirst()) 
					&& map.get(deque.peekFirst()) >= 2) {
				
				deque.pop();
			}
			
			if(deque.size() == 0) return -1; //it's important otherwise nullpointerexception occur  
			return deque.peek();
			
	    }
	    
	    public void add(int value) {
	    	if(map.containsKey(value)) {
	        	map.put(value, map.get(value)+1);
	        }else {
	        	map.put(value, 1);
	        	deque.add(value);
	        }
	    }



	    

}

