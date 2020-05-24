package semiadvanced;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEx {

	/*
	 * BlockingQueue -> an interface that represent a queue that is thread safe 
	 * 	Put items or take items from it...
	 * 
	 * For example: one thread putting items into the queue and another thread taking items from it 
	 * 	at the same time!!
	 * 
	 * 	put() putting items to the queue 
	 * 	take() taking items from the queue
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		
		FirstWorker firstWorker = new FirstWorker(queue);
		SecondWorker secondWorker = new SecondWorker(queue);
				
		new Thread(firstWorker).start();
		new Thread(secondWorker).start();

	}

}


class FirstWorker implements Runnable{

	private java.util.concurrent.BlockingQueue<Integer> blockingQueue;
	
	public FirstWorker(java.util.concurrent.BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
	
	
	@Override
	public void run() {
		int counter = 0;
		while (true) {
			try {
				blockingQueue.put(counter);
				System.out.println("Putting item "+ counter + " to the queue!" );
				counter++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}	
	}	
}


class SecondWorker implements Runnable{

	private java.util.concurrent.BlockingQueue<Integer> blockingQueue;
	
	public SecondWorker(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				int number = blockingQueue.take();
					System.out.println("Taking out the number: "+ number + " from the queue!");
					Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
}

