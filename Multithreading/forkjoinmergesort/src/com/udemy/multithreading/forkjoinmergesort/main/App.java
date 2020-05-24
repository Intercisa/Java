package com.udemy.multithreading.forkjoinmergesort.main;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

import com.udemy.multithreading.forkjoinmergesort.forkjointsort.ParallelMergeSortTask;
import com.udemy.multithreading.forkjoinmergesort.forkjointsort.SequentialMergeSort;

public class App {

	public static void main(String[] args) {
		int[] nums = initalizeNums();
		
		SequentialMergeSort sequentialMergeSort = new SequentialMergeSort();
		long startTime = System.currentTimeMillis();
		sequentialMergeSort.mergeSort(nums);
		System.out.println("SequentialMergeSort: "+ (System.currentTimeMillis()-startTime)+" ms");
		
		System.out.println("------------------------------------------------------------------------");
		
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		ParallelMergeSortTask parallelMergeSortTask = new ParallelMergeSortTask(nums);
		
		startTime = System.currentTimeMillis();
		
		pool.invoke(parallelMergeSortTask);
		System.out.println("ParallelMergeSortTask: "+ (System.currentTimeMillis()-startTime)+" ms");
	
	}
	
	public static int[] initalizeNums() {
		Random random = new Random();
		int[] nums = new int[10000000];
		
		for (int i = 0; i < nums.length; i++) 
			nums[i] = random.nextInt(10000000);
				
		return nums;
	}

}
