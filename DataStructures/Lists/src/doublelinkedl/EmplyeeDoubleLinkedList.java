package doublelinkedl;

import bean.Emplyee;

public class EmplyeeDoubleLinkedList {

	private DoubleEmpNode head;
	private DoubleEmpNode tail;
	private int size;
	
	public void push(Emplyee newHead) {
		DoubleEmpNode node = new DoubleEmpNode(newHead);

		if(isEmpty()) 
			tail = node;
		else {
			head.setPrev(node);
			node.setNext(head);
		}
		
		head = node;
		size++;
	}
	
	public void pushToTail(Emplyee newTail) {
		DoubleEmpNode node = new DoubleEmpNode(newTail);
		
		if(isEmpty()) 
			head = node;
		else {
			tail.setNext(node);
			node.setPrev(tail);
		}	
		
		tail = node;
		size++;
	}
	
	
	public boolean addBefore(Emplyee newEmployee, Emplyee existingEmployee) {
		
		if(isEmpty()) return false;
		
		DoubleEmpNode current = head;
		while (current != null && !current.getEmplyee().equals(existingEmployee))
			current = current.getNext();
		
		if(current == null) return false;
		
		DoubleEmpNode node = new DoubleEmpNode(newEmployee);
		node.setPrev(current.getPrev());
		node.setNext(current);
		current.setPrev(node);
		
		if(head == current)
			head = node;
		else
			node.getPrev().setNext(node);
		
		
		size++;
		return true;
	}
	
	
	
	public DoubleEmpNode poll() {
		
		if(isEmpty()) return null;
		
		DoubleEmpNode removedNode = head; 
		
		if(head.getNext() == null)  //only one node is in the list 
			tail = null;
		else
			head.getNext().setPrev(null);
		
		
		head = head.getNext();
		size--;
		
		removedNode.setNext(null);
		
		return removedNode;
	}
	
	
	public DoubleEmpNode pollFromTail() {
		
		if(isEmpty()) return null;	
		
		DoubleEmpNode removeNode = tail;
		
		if(tail.getPrev() == null) //only one node is in the list
			head = null;
		else
			tail.getPrev().setNext(null);

		tail = tail.getPrev();
		size--;
		removeNode.setPrev(null);
		
		return removeNode;
	}
	
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void printList() {
		DoubleEmpNode current = head;
		System.out.println("HEAD -> ");
		while (current!=null) {
			System.out.print(current);
			System.out.print(" <-> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}
