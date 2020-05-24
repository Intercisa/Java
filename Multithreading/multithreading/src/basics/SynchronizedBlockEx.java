package basics;

public class SynchronizedBlockEx {
	
	
	private static int count1 = 0;
	private static int count2 = 0;
	private static int count3 = 0;
	private static int count4 = 0;
	
	
	
	private static Object lock1 = new Object();
	private static Object lock2 = new Object();
	

	
	public  static void addWithLock() {
		
		synchronized (lock1) {
			count3++;
		}
	}
	
	public static void addAgainWithLock() {
		synchronized (lock2) {			
			count4++;
		}
	}
	
	
	
	public static void computeWithLock() {
		for (int i = 0; i < 100; i++) {
			addWithLock();
			addAgainWithLock();
			
		}
	}
	

	
	public  static void add() {
		
		synchronized (SynchronizedBlockEx.class) {
			count1++;
		}
	}
	
	public static void addAgain() {
		synchronized (SynchronizedBlockEx.class) {			
			count2++;
		}
	}
	

	public static void compute() {
		for (int i = 0; i < 100; i++) {
			add();
			addAgain();
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			compute();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			compute();
				
			}
		});
		
		
	Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			computeWithLock();
				
			}
		});
		
	Thread t4 = new Thread(new Runnable() {
		
		@Override
		public void run() {
		computeWithLock();
			
		}
	});
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Count1: "+ count1 + " - Count2: "+ count2);
		System.out.println("Count3: "+ count3 + " - Count4: "+ count4); //these are independent 
		
	}
	
}
