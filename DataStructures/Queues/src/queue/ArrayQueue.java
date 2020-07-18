package queue;

import java.util.NoSuchElementException;

import bean.Emplyee;

public class ArrayQueue {

	private Emplyee[] queue;
	private int front;
	private int back;

	public ArrayQueue(int capacity) {
		queue = new Emplyee[capacity];
	}
	
	public void push(Emplyee emplyee) {
		if(back == queue.length) {
			Emplyee[] newArr = new Emplyee[queue.length * 2];
			System.arraycopy(queue, 0, newArr, 0, queue.length);
			queue = newArr;
		}
		queue[back++] = emplyee;
	}
	
	public Emplyee pop() {
		if(isEmpty()) throw new NoSuchElementException();
			
		Emplyee removedEmployee = queue[front];
		queue[front] = null;
		front++;
		
		// if we deleted the last element in the queue 
		if(isEmpty()) { /*front = back = 0;*/
			front = 0;
			back = 0;
		}
		
		return removedEmployee;
	}
	
	public Emplyee peek() {
		if(isEmpty()) throw new NoSuchElementException();

		return queue[front];
	}

	public int size() {
		return back - front;
	}
	
	private boolean isEmpty() {
		return size() == 0;
	}
	
	public void printQueue() {
		for (int i = front; i < back; i++) 
			System.out.println(queue[i]);
	}
}
