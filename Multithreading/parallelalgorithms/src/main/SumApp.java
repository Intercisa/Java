package main;

import java.util.Random;

import parallel.ParallelSum;
import sequential.SequentialSum;

public class SumApp {

	public static void main(String[] args) {
		Random random = new Random();
		SequentialSum sequentialSum = new SequentialSum();
		
		int numOfProcessor = Runtime.getRuntime().availableProcessors();
		
		int[] nums = new int[100000000];
		
		for (int i = 0; i < nums.length; i++) 
			nums[i] = random.nextInt(100);
		
		long startTime = System.currentTimeMillis();
		System.out.println(sequentialSum.sum(nums));
		
		System.out.println("SequentialSum sum takes: " +(System.currentTimeMillis()-startTime)+ " ms");
		
		startTime = System.currentTimeMillis();
	
		ParallelSum parallelSum = new ParallelSum(numOfProcessor);
		System.out.println("Sum is: "+parallelSum.sum(nums));
		System.out.println("Parallel sum takes: "+ (System.currentTimeMillis()-startTime)+ " ms");

	}

}
