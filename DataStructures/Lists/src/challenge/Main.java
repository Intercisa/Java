package challenge;

public class Main {

	public static void main(String[] args) {
		SortedLinkedList linkedList = new SortedLinkedList();
		
		linkedList.push(4);
		linkedList.push(2);
		linkedList.push(1);
		linkedList.push(5);
		
		linkedList.printList();
		
		linkedList = new SortedLinkedList();
		linkedList.insertSorted(4);
		linkedList.insertSorted(2);
		linkedList.insertSorted(1);
		linkedList.insertSorted(5);
		
		linkedList.printList();

	}
}
