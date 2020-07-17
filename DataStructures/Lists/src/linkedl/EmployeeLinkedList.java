package linkedl;

import bean.Emplyee;

public class EmployeeLinkedList  {
	private EmpNode head;
	private int size;
	
	public void push(Emplyee newHead) {
		EmpNode node = new EmpNode(newHead);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public EmpNode poll() {
		
		if(isEmpty()) return null;
		
		EmpNode removedNode = head; 
		head = head.getNext();
		size--;
		
		// optional - depends on what you want to do  
		removedNode.setNext(null);
		
		return removedNode;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void printList() {
		EmpNode current = head;
		System.out.println("HEAD -> ");
		while (current!=null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}
