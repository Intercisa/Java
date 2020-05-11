package containsduplicate;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
	
	//faster
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length-1; i++) 
			if(nums[i] == nums[i+1]) return true;
		
		return false;
		
	}
	
	  public boolean containsDuplicateSlow(int[] nums) {
		  HashSet<Integer> set = new HashSet<>();
		  
		  for (int i : nums) 
			if(set.contains(i)) 
				return true;
			else
				set.add(i);
		
		  return false;
	    }
}



