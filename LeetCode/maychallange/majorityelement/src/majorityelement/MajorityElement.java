package majorityelement;

import java.util.HashMap;

public class MajorityElement {
	  public int majorityElement(int[] nums) {
	     if(nums.length == 1) return nums[0];
		 
	     int max = nums[0];
		 HashMap<Integer, Integer> map = new HashMap<>();
		 
		 for (int i = 0; i < nums.length; i++) 
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		
		 for (int i : map.keySet()) 
			 max = map.get(i)>map.get(max)?i:max;

		 return max;
	    }
	  
	  
	  
	  public int majorityElementFaster(int[] nums) {
		  int count = 0, numTry = 0;
		  
		  for (int num : nums) {
			if(count == 0)
				numTry = num;
			
			count+=(num==numTry)? 1 : -1;
		}
		  
		  return numTry;
	  }
}




