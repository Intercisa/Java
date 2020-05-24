package semiadvanced;

import java.util.concurrent.Exchanger;

public class ExchangerEx {

	/*
	 * With the help of Exchanger -> two threads can exchange objects
	 * 
	 *exchange() -> exchanging objects is done via one of the two exchange()
	 *
	 *
	 *For example: genetic algorithms, training neural networks  
	 */
	
	
	public static void main(String[] args) {
		
		Exchanger<Integer> exchanger = new Exchanger<>();
		
		new Thread(new FirstThread(exchanger)).start();
		new Thread(new SecondThread(exchanger)).start();
		
	}
}


class FirstThread implements Runnable{
	
	private int counter;
	private Exchanger<Integer> exchanger;
	
	public FirstThread(Exchanger<Integer> exchanger) {
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		counter = counter +1;
		
		while (true) {
			System.out.println("FirstThread increments the counter: " + counter);
			
			try {
				counter = exchanger.exchange(counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}

class SecondThread implements Runnable{
	
	private int counter;
	private Exchanger<Integer> exchanger;
	
	public SecondThread(Exchanger<Integer> exchanger) {
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		counter = counter -1;
		
		while (true) {
			System.out.println("SecondThread decrements the counter: " + counter);
			
			try {
				counter = exchanger.exchange(counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
}