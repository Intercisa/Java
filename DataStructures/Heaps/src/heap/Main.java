package heap;

public class Main {
	/*
	 * A complete binary tree must satisfy the heap property max heap: every parent
	 * is greater than or equal to its children min heap: every parent is less than
	 * or equal to children
	 * 
	 */

	public static void main(String[] args) {

		Heap heap = new Heap(10);
		heap.insert(80);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(67);

		heap.printHeap();
		
		heap.delete(0);
		heap.printHeap();
		
		System.out.println(heap.peek());
		
	}
}
