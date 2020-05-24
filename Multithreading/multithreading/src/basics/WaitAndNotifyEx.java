package basics;

class Proccessor{
	
	public void produce() throws InterruptedException {
		
		synchronized (this) {
			System.out.println("We are in the producer method");
			wait(10000); //érdemes megadni, hogy meddig várjon 
			System.out.println("Again producer method...");
		}
		
		
	}
	
	public void consume() throws InterruptedException {
		Thread.sleep(1000);
		
		synchronized (this) {
			System.out.println("Consumer method...");
			notifyAll(); //notify ha nem kell mindenkit felébreszteni 
			Thread.sleep(3000);//ezt is meg kell várnunk, csak utána ébreszt 
		}
	}
}


public class WaitAndNotifyEx {
	
	public static void main(String[] args) {
	
		Proccessor proccessor = new Proccessor();
		
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
