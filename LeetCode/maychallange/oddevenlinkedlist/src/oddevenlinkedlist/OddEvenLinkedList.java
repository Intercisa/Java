package oddevenlinkedlist;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {

    	if(head == null || head.next == null) return head;
    	
    	ListNode oddPtr = head;
    	ListNode evenPtr = head.next;
    	ListNode firstEvenConnectPtr = head.next;
    	
    	while (evenPtr != null) {
			oddPtr.next = evenPtr.next;
			if(oddPtr.next != null)
				oddPtr = oddPtr.next;
    		
    		evenPtr.next = oddPtr.next;
			evenPtr = evenPtr.next;
		}
    	
    	oddPtr.next = firstEvenConnectPtr;
    	
    	return head;
    }
}




