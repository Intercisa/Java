package semiadvanced;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueEx {

	/*
	 * PriorityBlockingQueue!!
	 * 
	 * It implements the BlockingQueue interface 
	 * 
	 *  - unbounded concurrent queue 
	 *  - it uses the same ordering rules as the java.util.PriorityQueue -> have to implement the Comparable interface 
	 *  	The comparable interface will determine what will the order in the queue 
	 *  
	 *   	The priority can be the same compare() == 0 case 
	 *   
	 *   - no null items!!
	 * 
	 */
	
	

	
	public static void main(String[] args) {
		
		//BlockingQueue<String> queue = new PriorityBlockingQueue<>();
		
		//new Thread(new PQFirstWorker(queue)).start();
		//new Thread(new PQSecondWorker(queue)).start();
		
		
		//BlockingQueue<Integer> queueInt = new PriorityBlockingQueue<>();
		
		//new Thread(new PQFirstWorkerForInt(queueInt)).start();
		//new Thread(new PQSecondWorkerForInt(queueInt)).start();
		
		
	BlockingQueue<Person> queuePerson = new PriorityBlockingQueue<>();
		
		new Thread(new PQFirstWorkerForPerson(queuePerson)).start();
		new Thread(new PQSecondWorkerForPerson(queuePerson)).start();
		
		
	
	}
}

class Person implements Comparable<Person>{
	
	private int age;
	private String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Person otherPerson) {
		if (name.compareTo(otherPerson.getName()) == 0) {
			return age - otherPerson.getAge();
		}
		return name.compareTo(otherPerson.getName());
	}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	@Override
	public String toString() {return name +"-"+age;}
	
}

class PQFirstWorkerForPerson implements Runnable{

	private BlockingQueue<Person> bockingQueu;
	
	public PQFirstWorkerForPerson(BlockingQueue<Person> blockingQueue) {
		this.bockingQueu = blockingQueue;
	}
	
	@Override
	public void run() {
	try {
		bockingQueu.put(new Person(12, "Adam"));
		bockingQueu.put(new Person(45, "Joe"));
		bockingQueu.put(new Person(78, "Daniel"));
		Thread.sleep(1000);
		bockingQueu.put(new Person(32, "Adam"));
		Thread.sleep(1000);
		bockingQueu.put(new Person(34, "Kevin"));
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}	
	}	
} 

class PQSecondWorkerForPerson implements Runnable{

	
	private BlockingQueue<Person> bockingQueu;
	
	public PQSecondWorkerForPerson(BlockingQueue<Person> blockingQueue) {
		this.bockingQueu = blockingQueue;
	}
	
	@Override
	public void run() {
	try {
		Thread.sleep(5000);
		System.out.println(bockingQueu.take());
		Thread.sleep(1000);
		System.out.println(bockingQueu.take());
		Thread.sleep(1000);
		System.out.println(bockingQueu.take());
		System.out.println(bockingQueu.take());
		System.out.println(bockingQueu.take());
	} catch (InterruptedException e) {
		e.printStackTrace();
	}	
	}	
} 




class PQFirstWorker implements Runnable{

	private BlockingQueue<String> bockingQueu;
	
	public PQFirstWorker(BlockingQueue<String> blockingQueue) {
		this.bockingQueu = blockingQueue;
	}
	
	@Override
	public void run() {
	try {
		bockingQueu.put("B");
		bockingQueu.put("H");
		bockingQueu.put("F");
		Thread.sleep(1000);
		bockingQueu.put("A");
		Thread.sleep(1000);
		bockingQueu.put("E");
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}	
	}	
} 

class PQSecondWorker implements Runnable{

	
	private BlockingQueue<String> bockingQueu;
	
	public PQSecondWorker(BlockingQueue<String> blockingQueue) {
		this.bockingQueu = blockingQueue;
	}
	
	@Override
	public void run() {
	try {
		Thread.sleep(5000);
		System.out.println(bockingQueu.take());
		Thread.sleep(1000);
		System.out.println(bockingQueu.take());
		Thread.sleep(1000);
		System.out.println(bockingQueu.take());
		System.out.println(bockingQueu.take());
		System.out.println(bockingQueu.take());
	} catch (InterruptedException e) {
		e.printStackTrace();
	}	
	}	
} 


class PQFirstWorkerForInt implements Runnable{

	private BlockingQueue<Integer> bockingQueu;
	
	public PQFirstWorkerForInt(BlockingQueue<Integer> blockingQueue) {
		this.bockingQueu = blockingQueue;
	}
	
	@Override
	public void run() {
	try {
		bockingQueu.put(10);
		bockingQueu.put(2);
		bockingQueu.put(4);
		Thread.sleep(1000);
		bockingQueu.put(0);
		Thread.sleep(1000);
		bockingQueu.put(67);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}	
	}	
} 

class PQSecondWorkerForInt implements Runnable{
	
	private BlockingQueue<Integer> bockingQueu;
	
	public PQSecondWorkerForInt(BlockingQueue<Integer> blockingQueue) {
		this.bockingQueu = blockingQueue;
	}
	
	@Override
	public void run() {
	try {
		Thread.sleep(5000);
		System.out.println(bockingQueu.take());
		Thread.sleep(1000);
		System.out.println(bockingQueu.take());
		Thread.sleep(1000);
		System.out.println(bockingQueu.take());
		System.out.println(bockingQueu.take());
		System.out.println(bockingQueu.take());
	} catch (InterruptedException e) {
		e.printStackTrace();
	}	
	}
	
	
} 



