package studentlibrarysim;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Book {
	
	private int id;
	private Lock lock;
	
	public Book(int id) {
		this.id = id;
		this.lock = new ReentrantLock();
	}
	
	public void read(Student student) throws InterruptedException{
		
		
		if(lock.tryLock(1, TimeUnit.SECONDS)){
			System.out.println(student + " starts reading " +this);
			Thread.sleep(2000);
			lock.unlock();
			System.out.println(student +" has finished reading "+ this);
			
		}else {
			System.out.println(this + " already taken");
		}
		

		//lock.lock();// simple solution, 'coz it will block the given thread until the Student finishes the book 
		
	}
	
	@Override
	public String toString() {return " Book #" + this.id;}
	
}
