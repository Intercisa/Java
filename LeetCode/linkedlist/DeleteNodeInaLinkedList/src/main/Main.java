package main;

import deletenode.DeleteNodeInALinkedList;
import deletenode.ListNode;

/*
 * 
 * you don't really "delete" a node, you are replacing the value, would be better called "modify" a node and not "delete" it
 * and it is a stupid design, and a stupid question 
 * 
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *
 * Example 1:
 * Input: head = [4,5,1,9], node = 5
 * Output: [4,1,9]
 * Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
 * 
 * Example 2:
 * Input: head = [4,5,1,9], node = 1
 * Output: [4,5,9]
 * Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
 *
 *   The linked list will have at least two elements.
 *   All of the nodes' values will be unique.
 *   The given node will not be the tail and it will always be a valid node of the linked list.
 */

public class Main {

	public static void main(String[] args) {	
		
		ListNode node = new ListNode(5);
		node.next = new ListNode(1);
		node.next.next = new ListNode(9);
		
		DeleteNodeInALinkedList aLinkedList = new DeleteNodeInALinkedList();
		
		aLinkedList.deleteNode(node);
		
		
	}
}
	
