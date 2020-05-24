package parallel;

public class ParallelSum {
	
	private ParallelWorker[] sums;
	private int numberOfThreads;
	
	public ParallelSum(int numberOfThreads) {
		this.numberOfThreads = numberOfThreads;
		this.sums = new ParallelWorker[numberOfThreads];
	}
	
	public int sum(int[] nums) {
		
		int steps = (int)Math.ceil(nums.length*1.0/numberOfThreads);
		
		for (int i = 0; i < numberOfThreads; i++) {
			sums[i] = new ParallelWorker(nums, i*steps, (i+1)*steps);
			sums[i].start();
		}
		
		try {
			for (ParallelWorker parallelWorker : sums) 
				parallelWorker.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		int total = 0;
		
		for (ParallelWorker worker : sums) 
			total += worker.getPartialSum();
		
		return total;
		
	}
	

}
