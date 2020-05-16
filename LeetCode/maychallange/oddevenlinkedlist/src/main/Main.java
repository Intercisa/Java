package main;

import oddevenlinkedlist.ListNode;
import oddevenlinkedlist.OddEvenLinkedList;

/*
 * Given a singly linked list, group all odd nodes together followed by the even nodes.
 * Please note here we are talking about the node number and not the value in the nodes.
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * 
 *   The relative order inside both the even and odd groups should remain as it was in the input.
 *   The first node is considered odd, the second node even and so on ...
 * 
 * 	 define a variable called firstEvenConnectPtr, which will point to first even index element. This pointer will never move.
 * 	 define two more variables oddPtr and evenPtr. 
 * 	 These will point to first odd index and even index >> these pointers will move.
 * 	 start moving the oddPtr and evenPtr pointers until one of them reaches the end
 * 		oddPtr.next = evenPtr.next;
 *		oddPtr = oddPtr.next;
 *		
 *		evenPtr.next = oddPtr.next;
 *		evenPtr = evenPtr.next;
 * 	
 * 	end of these the list look like this: 
 * 
 * head     oddPtr
 *  | 		  |
 * 	1 -- 3 -- 5
 * 
 * 			2 -- 4 -- null
 *          |           |
 * firstEvenConnectPtr  evenPtr     
 * 
 * now we merge the oddPtr.next and firstEvenConnectPtr >> oddPtr.next = firstEvenConnectPtr
 * 
 */

public class Main {

	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(5);
		
		printLinekd(root);
		System.out.println();
		
		OddEvenLinkedList evenLinkedList = new OddEvenLinkedList();
		evenLinkedList.oddEvenList(root);
		
		printLinekd(root);
		
	}
	
	
	static void printLinekd(ListNode root) {
		
		while (root != null) {
			System.out.println(root.val);
			root = root.next;
		}
	}
}
	
