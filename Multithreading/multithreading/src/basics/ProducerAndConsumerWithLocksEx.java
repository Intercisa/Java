package basics;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class WorkerNew{
	
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	
	public void producer() throws InterruptedException {
		lock.lock();
		System.out.println("Producer method...");
		condition.await();
		System.out.println("Producer again...");
		lock.unlock();//pont annyiszor kell hívni ahányszor a lock.lock()-ot
		
	}
	
	public void consumer() throws InterruptedException {
		
		lock.lock();
		Thread.sleep(2000);
		System.out.println("Consumer method...");
		condition.signalAll();
		lock.unlock();

	}
	
}

public class ProducerAndConsumerWithLocksEx {
	
	public static void main(String[] args) {
		WorkerNew workerNew = new WorkerNew();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			try {
				workerNew.producer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					workerNew.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
