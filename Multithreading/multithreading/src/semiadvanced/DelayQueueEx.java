package semiadvanced;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/*
 * This is an unbounded BlockingQueue of object that implements the Delayed interface
 * 
 * 	- DelayQueue keeps the elements internally until a certain delay has expired
 * 
 * 	- an object can only be taken from the queue when its delay has expired!!!
 * 
 * We cannot place null items in the queue  - The queue is sorted so that the 
 * object at the head has a delay that has expired for the longest time.
 *
 * If no delay has expired, then there is no head element and poll() will return null 
 * 
 * size() return the count of both expired an unexpired items!!! 
 * 
 */




public class DelayQueueEx {

	
	public static void main(String[] args) {
		
		
		BlockingQueue<DelayedWorker> queue = new DelayQueue<>();
		
		try {
			queue.add(new DelayedWorker(1000, "This is the first message!"));
			queue.add(new DelayedWorker(10000, "This is the second message!"));
			queue.add(new DelayedWorker(4000, "This is the third message!"));
			queue.add(new DelayedWorker(2000, "This is the fourth message!"));
			queue.add(new DelayedWorker(100, "This is the fifth message!"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while (!queue.isEmpty()) {
			try {
				System.out.println(queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class DelayedWorker implements Delayed{
	
	private long duration;
	private String message;
	
	
	public DelayedWorker(long duration, String message) {
		this.duration = System.currentTimeMillis()+duration;
		this.message = message;
	}
	

	@Override
	public int compareTo(Delayed otherDelayed) {
		if (this.duration < ((DelayedWorker)otherDelayed).getDuration()) { //smaller
			return -1;
		}
		
		if (this.duration > ((DelayedWorker)otherDelayed).getDuration()) { //bigger
			return +1;
		}
		
		return 0; //equal 
		
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return unit.convert(duration-System.currentTimeMillis(), TimeUnit.MILLISECONDS);
	}

	
	@Override
	public String toString() {return this.message;}
	
	public long getDuration() {return duration;}

	public void setDuration(long duration) {this.duration = duration;}

	public String getMessage() {return message;}

	public void setMessage(String message) {this.message = message;}
	
	
	
	
}
