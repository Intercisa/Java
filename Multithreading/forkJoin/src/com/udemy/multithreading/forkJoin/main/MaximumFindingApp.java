package com.udemy.multithreading.forkJoin.main;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

import com.udemy.multithreading.forkJoin.max.ParallelMaxFinding;
import com.udemy.multithreading.forkJoin.max.SequentialMaxFinding;

public class MaximumFindingApp {

	public static int TREASHOLD = 0;

	public static void main(String[] args) {
		
		
		int[] nums = initializeNums();
		TREASHOLD = nums.length/Runtime.getRuntime().availableProcessors();
		
		SequentialMaxFinding sequentialMaxFinding= new SequentialMaxFinding();
		long starTime = System.currentTimeMillis();
		
		System.out.println("Max: "+sequentialMaxFinding.sequentialMaxFind(nums, nums.length) );
		System.out.println("Time taken Sequential: "+ (System.currentTimeMillis()-starTime)+" ms");
		
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		ParallelMaxFinding parallelMaxFinding = new ParallelMaxFinding(nums, 0, nums.length);
		
		starTime = System.currentTimeMillis();
		System.out.println("Max: "+pool.invoke(parallelMaxFinding) );
		System.out.println("Time taken Parallel: "+ (System.currentTimeMillis()-starTime)+" ms");
	

	}

	private static int[] initializeNums() {
		Random random = new Random();
		int[] nums = new int[300000000];
		
		for (int i = 0; i < 300000000; i++)
			nums[i] = random.nextInt(1000);
		
		return nums;
	}

}
