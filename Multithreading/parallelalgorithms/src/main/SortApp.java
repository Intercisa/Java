package main;

import java.util.Random;

import parallel.ParallelMergesort;

public class SortApp {

	
	public static Random random = new Random();
	
	public static void main(String[] args) {
	
		int numOfThreads = Runtime.getRuntime().availableProcessors();
		

		System.out.println("Number of threads: "+ numOfThreads);
		System.out.println("");
		
		int numbers1[] = createRandomArray(100000000);
		int[] numbers2 = new int[numbers1.length];
		
		for(int i=0;i<numbers1.length;i++)
			numbers2[i] = numbers1[i];
		
		ParallelMergesort parallelSorter = new ParallelMergesort(numbers1);
		
		long startTime = System.currentTimeMillis();
		parallelSorter.parallelMergeSort(0, numbers1.length-1, numOfThreads);
		long endTime = System.currentTimeMillis();
		
		System.out.printf("Time taken for 100 000 000 elements: %d", endTime-startTime);
		System.out.println("");
		
		startTime = System.currentTimeMillis();
		ParallelMergesort sequentisalSorted = new ParallelMergesort(numbers2);
		sequentisalSorted.mergeSort(0,numbers2.length-1);
		endTime = System.currentTimeMillis();
		
		System.out.println("");
		System.out.printf("Time taken for 100 000 000 elements: %d", endTime-startTime);

		
	}

	private static int[] createRandomArray(int n) {
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = random.nextInt(10000);
		}
		
		return a;
	}

}
