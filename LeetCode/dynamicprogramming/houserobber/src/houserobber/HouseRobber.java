package houserobber;

import java.util.Arrays;

public class HouseRobber {

	
	//rob(i) = Math.max( rob(i - 2) + currentHouseValue, rob(i - 1)) >> (i) = Math.max(dp(i) + currentHouseValue, dp(i + 1))
	public int rob(int[] nums) {
		if(nums.length == 0) return 0;
		
		int[] dpTable = new int[nums.length + 2];
		
		for (int i = 0; i < nums.length; i++) 
			dpTable[i + 2] = Math.max(dpTable[i] + nums[i], dpTable[i + 1]);
		
		return dpTable[dpTable.length-1];
	}
	
	
	/* the order is: prev2, prev1, num  */
	public int robIterationII(int[] nums) {
		if(nums.length == 0) return 0;
		
	     int back2 = 0, back1 = 0, current = 0;
		
		for (int val : nums) {
			current = Math.max(back1, back2 + val);
			back2 = back1;
			back1 = current;
		}
		
        return current;
    }
	
	
	public int robIterativeButtomUp(int[] nums) {
		if(nums.length == 0) return 0;
		
		int[] dpTable = new int[nums.length + 1];
		
		dpTable[0] = 0; //in java this is not necessary
		dpTable[1] = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];
			dpTable[i+1] = Math.max(dpTable[i], dpTable[i - 1] + val);
		}

		return dpTable[nums.length];	
    }
	
	
	//memoization
	
	int[] dpTable;
	public int robRecursiveMemo(int[] nums) {
		dpTable = new int[nums.length + 1];
		Arrays.fill(dpTable, - 1);
		return robRecursiveMemo(nums, nums.length-1);
	}
	
	private int robRecursiveMemo(int[] nums, int i) {
		if(i < 0) return 0;
		
		if(dpTable[i] >= 0) return dpTable[i];
		
		
		int result = Math.max(robRecursiveMemo(nums, i - 2), robRecursiveMemo(nums, i -1));
		dpTable[i] = result;
		return result;
	}
	
	
	//simple recursion
	public int robRecursive(int[] nums) {
		return robRecursive(nums, nums.length-1);
    }

	private int robRecursive(int[] nums, int i) {
		if(i < 0) return 0;
		return Math.max(robRecursive(nums, i - 2), robRecursive(nums, i - 1));
	}

	
	
	
	
	
	
}