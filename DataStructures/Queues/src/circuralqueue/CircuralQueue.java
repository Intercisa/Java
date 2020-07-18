package circuralqueue;

import java.util.NoSuchElementException;

import bean.Emplyee;

public class CircuralQueue {

	private Emplyee[] queue;
	private int front;
	private int back;

	public CircuralQueue(int capacity) {
		queue = new Emplyee[capacity];
	}
	
	public void push(Emplyee emplyee) {
		if(size() == queue.length - 1) {
			int numItems= size();
			
			Emplyee[] newArr = new Emplyee[queue.length * 2];
			
			System.arraycopy(queue, front, newArr, 0, queue.length - front);
			System.arraycopy(queue, 0, newArr, queue.length - front, back);
			
			front = 0;
			back = numItems;
			
			queue = newArr;
		}
		
		queue[back] = emplyee;
		if(back < queue.length -1)
			back++;
		else
			back = 0;
	}
	
	public Emplyee pop() {
		if(isEmpty()) throw new NoSuchElementException();
			
		Emplyee removedEmployee = queue[front];
		queue[front] = null;
		front++;
		
		
		if(isEmpty()) { 
			front = 0;
			back = 0;
		}else if(front == queue.length) {
			front = 0;
		}
			
		
		return removedEmployee;
	}
	
	public Emplyee peek() {
		if(isEmpty()) throw new NoSuchElementException();

		return queue[front];
	}

	public int size() {
		if(front <= back) return back - front;
		
		return back - front + queue.length;
		
	}
	
	private boolean isEmpty() {
		return size() == 0;
	}
	
	public void printQueue() {
		if(front <= back)
			for (int i = front; i < back; i++) 
				System.out.println(queue[i]);
		else {
			for (int i = front; i < queue.length; i++) 
				System.out.println(queue[i]);
			
			for (int i = 0; i < back; i++) 
				System.out.println(queue[i]);
		}
		
	}
	
}
