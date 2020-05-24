package com.udemy.multithreading.forkJoin.max;

import java.util.concurrent.RecursiveTask;

import com.udemy.multithreading.forkJoin.main.MaximumFindingApp;


public class ParallelMaxFinding extends RecursiveTask<Integer> {

	private static final long serialVersionUID = 1L;
	private int[] nums;
	private int lowIndex;
	private int highIndex;
	
	public ParallelMaxFinding(int[] nums, int lowIndex, int highIndex) {
		this.nums = nums;
		this.lowIndex = lowIndex;
		this.highIndex = highIndex;
	}

	@Override
	protected Integer compute() {
		if(highIndex - lowIndex < MaximumFindingApp.TREASHOLD) {
			return sequentialMaxFind();
		}else {
			int middleIndex = (lowIndex+highIndex)/2;
			
			ParallelMaxFinding task1 = new ParallelMaxFinding(nums, lowIndex, middleIndex);
			ParallelMaxFinding task2 = new ParallelMaxFinding(nums, middleIndex+1, highIndex);
			
			invokeAll(task1, task2);
			
			return Math.max(task1.join(), task2.join());

		}		
	}
		
	
	private int sequentialMaxFind() {
		
		int max = nums[lowIndex];
		
		for (int i = lowIndex+1; i < highIndex; i++) {  //+1 because we already considered the lowIndex, so increment 
			if(nums[i]>max) max = nums[i];	
		}
		
		return max;
	}
	

}
