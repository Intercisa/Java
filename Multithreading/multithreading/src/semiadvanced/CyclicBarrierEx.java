package semiadvanced;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierEx {

	/*
	 * Latch --> multiple threads can wait for each other
	 * 
	 * A CyclicBarrier is used in situations where you want to create a group of tasks 
	 * to perform work in parallel + wait until they are all finished before 
	 *    moving on to the next step
	 *    	-> something like join()
	 *    	-> SOMETHING LIKE CountDownLatch
	 *    
	 *     CountDownLatch: one-shot event
	 *     CyclicBArrier: it can be reused over and over again
	 *     
	 *     		+ cyclicBarrier has a barrier action: a runnable, that will run automatically 
	 *     			when the count reaches 0 !!
	 *     
	 *     new CyclicBarrier(N) -> N threads will wait for each other
	 *     
	 *     
	 *     WE CAN NOT REUSE LATCHES BUT WE CAN REUSE CyclicBarriers --> reset()!!!
	 * 
	 */
	
	
	
	public static void main(String[] args) {
	ExecutorService executorService = Executors.newFixedThreadPool(5);
	CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {
		
		@Override
		public void run() {
			System.out.println("We are able to do what ever we want next!");
			
		}
	});

	
	for (int i = 0; i < 5; i++) {
	executorService.execute(new CBWorker(i+1, barrier));
		
	}
	executorService.shutdown();
	
	}

}

class CBWorker implements Runnable{
	
	private int id;
	Random random;
	CyclicBarrier cyclicBarrier;
	
	public CBWorker(int id, CyclicBarrier cyclicBarrier) {
		this.id = id;
		this.cyclicBarrier = cyclicBarrier;
		this.random = new Random();
				
	}

	@Override
	public void run() {doWork();}
	

	private void doWork() {
		System.out.println("Thread with id: "+ id+ " starts the task... ");
		try {
			Thread.sleep(random.nextInt(3000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread with id: "+ id+ " completed!");
		try {
			cyclicBarrier.await();//ha ezután dolgozunkn még ki valamit, akkor tud folytatódni, de azok márnem várják be egymást, hanem csak lefutnak mind az összes Threadben
			System.out.println("After await();");
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String toString() {return ""+this.id;}
	
	
	
} 