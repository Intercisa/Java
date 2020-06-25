package func;

import java.util.stream.IntStream;

public class ThreadsWithStreams {
	public static void main(String[] args) {

		// traditional
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {

					System.out.println(Thread.currentThread().getId() + ":" + i);
				}
			}
		};

		Thread thread = new Thread(runnable);
		// thread.start();
		Thread thread2 = new Thread(runnable);
		// thread2.start();
		Thread thread3 = new Thread(runnable);
		// thread3.start();
		
		

		// functional
		Runnable runnableFunc = () -> {
			
			IntStream.rangeClosed(0, 10000)
			.forEach(n -> System.out.println(Thread.currentThread().getId() + ":" + n));
			
		};

		
		Thread threadFunc = new Thread(runnableFunc);
		threadFunc.start();
		
	}

}
