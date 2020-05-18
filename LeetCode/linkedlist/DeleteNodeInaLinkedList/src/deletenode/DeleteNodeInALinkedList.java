package deletenode;

public class DeleteNodeInALinkedList {
	public void deleteNode(ListNode node) {

	      if(node.next == null) return;
	        ListNode current = node;
	        ListNode prev = null;
	        while(current.next != null){
	            current.val = current.next.val;
	            prev = current;
	            current = current.next;
	        }
	        prev.next = null;
	}
	
	
	public void deleteNode2(ListNode node) {
	    node.val=node.next.val;
	    node.next=node.next.next;
	}
}
/*
 * 
 * Java Virtual Machine removes objects that have no reference pointing to them. 
 * So by "node.next = node.next.next" you set the reference originally pointing to the next node point somewhere else. 
 * Thus now the next node is eligible for garbage collection.
 * 
 * 
 * 
*/
