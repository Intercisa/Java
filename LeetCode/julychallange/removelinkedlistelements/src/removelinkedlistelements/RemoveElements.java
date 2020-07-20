package removelinkedlistelements;

public class RemoveElements {
	public ListNode removeElements(ListNode head, int val) {
		if(head==null)return head;
	    if(head.next==null && head.val==val)return null;
	    if(head.next==null && head.val!=val) return head;
	    
		ListNode helper = new ListNode(0);
		helper.next = head;
		ListNode ptr = helper;

		while (ptr.next != null) {
			if (ptr.next.val == val) {
				ListNode next = ptr.next;
				ptr.next = next.next;
			} 
			else ptr = ptr.next;
		}
		return helper.next;
	}
}
