package jumpgame;

public class JumpGame {
		
	/*
	 * Greedy O(n)
	 * A position is a "good index" if starting from there we can reach the last index. 
	 * Going right-to-left, for each position we check if from there can we reaches a good index or not 
	 * (currPosition + nums[currPosition] >= leftmostGoodIndex). 
	 * If we can reach a GOOD index, then our position is itself GOOD. 
	 * Also, this new GOOD position will be the new leftmost GOOD index. 
	 * Iteration continues until the beginning of the array. 
	 * If first position is a GOOD index then we can reach the last index from the first position.
	 *
	 */	 
	
	//     lastPos starts from nums.length-1 == 4
	
	//	   0 1 2 3 4  -- index 
	//A = [3,2,1,1,4] -- array
	//	   3 3 3 4 8  -- nums[i] + i 		
	//	   0 1 2 3 4  -- lastPos	
	
	
	//     0 1 2 3 4  --index
	//A = [3,2,1,0,4] -- array
	//     3 3 3 3 8  -- nums[i] + 1 
	//     4 4 4 4 4  -- lastPos   
	
	
	public boolean canJump(int[] nums) {
		if(nums==null || nums.length == 0) return false;
	    int n = nums.length;
		int lastPos = n-1;
		
		for (int i = n-1; i >= 0; i--) {
			  if (i + nums[i] >= lastPos) 
	                lastPos = i;
		}
		return lastPos == 0;
	}
	
	
	
	//zero_version 
		public boolean canJump_verZero(int[] nums) {
		     if(nums==null || nums.length == 0) return false;
		     int n = nums.length;
		     int max = nums[0];
		     
		     for (int i = 0; i < n; i++) {
				if(max <= i && nums[i] ==0) return false;
				
				max = Math.max(max, nums[i]+i);
				
				if (max == n-1) return true;
			}
			return true;
		}
}

