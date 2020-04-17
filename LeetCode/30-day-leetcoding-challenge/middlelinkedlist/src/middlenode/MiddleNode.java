package middlenode;

public class MiddleNode {
	/* 
	Maintain a slow and a fast pointer. Slow moves one place at a time while fast moves two places at a time. 
	When fast pointer reaches end of the linked list, at that time slow pointer is the middle element.
	*/
	
	 
	 public ListNode middleNode(ListNode head) {
		 
		 ListNode ptrSlow = head;
		 ListNode ptrFast = head;
		 
		 while (ptrFast!= null && ptrFast.next != null) {
			ptrSlow = ptrSlow.next;
			ptrFast = ptrFast.next.next;
		}

		 return ptrSlow;
	 }
	
	
	
	/*
	 * not bad, but can be smarter 
	 * 
	public ListNode middleNode(ListNode head) {
	    	int counterFast = 0;
	    	int counterSlow = 0;
	    	ListNode ptrFast = head;
	   
	    	while (ptrFast!=null) {
	    		counterFast++;
	    		ptrFast=ptrFast.next;
			}
	    	
	    	while(counterSlow != counterFast/2) {
	    		counterSlow++;
	    		head = head.next;
	    	}
			
	    	return head;
	    }
	    */
	
	
	
}
