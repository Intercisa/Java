package basics;


class Util{
	
	public static void getSleepOneSec() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}

class Runner1 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Runner1 " + i);
			Util.getSleepOneSec();
			
		}
	}
}

class Runner2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <= 15; i++) {
			System.out.println("Runner2 " + i);
			Util.getSleepOneSec();
		}
	}
}

class Runner3 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i <= 17; i++) { 
			System.out.println("Runner3 " + i);
			Util.getSleepOneSec();
		}
	}
}


public class RunnersAndThreads {
	
	public static void main(String[] args) {
			 
		System.out.println("-------------------------------------------");
		
		System.out.println("Concurent\n");
		Thread t1  = new Thread(new Runner1());
		Thread t2 = new Thread(new Runner2());
		Thread t3 = new Runner3();
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			System.out.println("first thread dead");
			t2.join();
			System.out.println("second thread dead");
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Finished the tasks...");
		
	}

}
