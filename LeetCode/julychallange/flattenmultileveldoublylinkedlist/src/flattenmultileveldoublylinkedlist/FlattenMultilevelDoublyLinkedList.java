package flattenmultileveldoublylinkedlist;

import java.util.Stack;

public class FlattenMultilevelDoublyLinkedList {
	public Node flatten(Node head) {
		if (head == null) return head;
		// Pointer
		Node ptr = head;
		while (ptr != null) {
			/* CASE 1: if no child, proceed */
			if (ptr.child == null) {
				ptr = ptr.next;
				continue;
			}
			
			/* CASE 2: got child, find the tail of the child and link it to p.next */
			Node tmp = ptr.child;
			// Find the tail of the child
			while(tmp.next != null) 
				tmp = tmp.next;
			
			// Connect tail with p.next, if it is not null
			tmp.next = ptr.next;
			if(ptr.next != null) ptr.next.prev = tmp;
			// Connect p with p.child, and remove p.child
			ptr.next = ptr.child;
			ptr.child.prev = ptr;
			ptr.child = null;
		}
		return head;
	}
	
	
	
	public Node flattenII(Node head) {
	    //We can use a stack to store the next node when the current node has a child, so we can go back to it when we reach to the end of the current list.
	    Stack<Node> stack = new Stack<>();
	    
		// Keep the head pointer and traverse the list using current node (curNode)
	    Node curNode = head;
	    
		
	    while(curNode != null){
	            
	        if(curNode.child != null){
			    // if the current node has a child, then add the next node to the stack
	            stack.add(curNode.next);
				// point the next node to the child
	            curNode.next = curNode.child;
				// remove the child's pointer
	            curNode.child = null;
	        }
			
	        // Determine which is the next node, if reached to the end of the current list and the stack is NOT empty, then pop the lastest node to be the next. 
	        Node next = (curNode.next == null && !stack.isEmpty()) ? stack.pop() : curNode.next;
	        
	        if(next != null){
			    // make sure all the pointers are correct
	            next.prev = curNode;   
	            curNode.next = next;
	        }
	       
	        curNode = next;
	    }
	    return head;
	}
	
	
	
	
	
	
	
}
