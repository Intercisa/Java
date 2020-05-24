package basics;

import java.util.ArrayList;
import java.util.List;

class ProccessorNew{
	
	private List<Integer>list = new ArrayList<Integer>();
	private final int LIMIT = 5;
	private final int BOTTOM = 0;
	private final Object lock = new Object();
	private int value = 0;
	
	public void produce() throws InterruptedException {
		synchronized (lock) {
			while (true) {
				if (list.size() == LIMIT) {
					System.out.println("Waiting for removing items from the list...");
					lock.wait();
				}else {
					System.out.println("Adding: " + value);
					list.add(value);
					value++;
					lock.notify();
				}
				Thread.sleep(500);	
			}
		}
		
	}
	
	public void consume() throws InterruptedException {
		
		synchronized (lock) {
		while (true) {
			if(list.size()== BOTTOM) {
				System.out.println("Waiting for adding items from the list...");
				lock.wait();
			}else {
				System.out.println("Removed: " + list.remove(--value));
				lock.notify();
			}
			
			Thread.sleep(500);	
		}	
		}		
	}

}


public class ProducerAndConsumerDetailedEx {
	public static void main(String[] args) {
		
		ProccessorNew proccessor = new ProccessorNew();
		
		Thread t1 = new Thread(new Runnable() {

		public void run() {
			try {
				proccessor.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	});
		
		
		Thread t2 = new Thread(new Runnable() {

		public void run() {
			try {
				proccessor.consume();;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
	
}
