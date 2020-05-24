package basics;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;


public class LockEx {
	
	/*
	 * ReentrantLock:
	 * 
	 *   - it has the same behavior as the synchronized approach
	 *   -of course it has some additional features 
	 * 
	 *        newReentalLock(boolean fairnessParameter)
	 *          -fairness parameter: if it is set to be true -> the longest-waiting thread will get the lock 
	 *            fairness == false -> there is no access order
	 *        
	 *         
	 *         IMPORTANT! - we have to try-catch block when doing critical sections that may throw exceptions
	 *            -we call unlock()in the finally block!!  
	 * 
	 */
	
	private static int counter = 0;
	private static Lock lock = new ReentrantLock();
	
	public static void incerment() { 

		lock.lock();
		try {
			
			for (int i = 0; i < 10000; i++) {		
				counter++;
			}
		}finally {
			lock.unlock(); //nem kényszeríti ki, de rule of thumb, hogy itt használjuk a try blockot a finally-val, hogy biztosan visszaadja a lockot! 
		}
		
}
	
	
	public static void add() {
		lock.unlock(); //ez az egész ezért jó -> innen is vissza tudjuk adni a lockot, szóval kb. bárhonnan 
	}
	

	public static void main(String[] args) {
	
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				incerment();
				
			}
		});
		
	Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				incerment();
				
			}
		});
		
		t1.start();
		t2.start();
				
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Counter is: "+ counter);

	}

}
