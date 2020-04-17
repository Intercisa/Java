package main;

import middlenode.ListNode;
import middlenode.MiddleNode;


/*
 * 
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
   If there are two middle nodes, return the second middle node.
 * 
 */
public class Main {

	public static void main(String[] args) {
		
	ListNode head = new ListNode(1);
	head.next = new ListNode(2);
	head.next.next = new ListNode(3);
	head.next.next.next = new ListNode(4);
	head.next.next.next.next = new ListNode(5);
	head.next.next.next.next.next = new ListNode(6);
	
	MiddleNode middleNode = new MiddleNode();
	middleNode.middleNode(head);
	
	
	

	}

}
