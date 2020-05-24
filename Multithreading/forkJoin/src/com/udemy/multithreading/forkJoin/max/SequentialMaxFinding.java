package com.udemy.multithreading.forkJoin.max;

public class SequentialMaxFinding {
	
	//O(N)
	
	public int sequentialMaxFind(int[]nums, int highIndex) {
		
		int max = nums[0];
		
		for (int i = 0; i < nums.length; i++) { 
			if(nums[i]>max) max = nums[i];	
		}
		
		return max;
	}

}
