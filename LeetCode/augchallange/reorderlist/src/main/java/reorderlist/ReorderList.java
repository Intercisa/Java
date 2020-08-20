package main.java.reorderlist;

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null) return;

        ListNode slow = head;
        ListNode fast = head;

        //use a fast and slow pointer to break the link to two parts.
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;// need to close first part

        // now should have two lists: head and fast

        // reverse order for second part
        second = reverse(second);

        ListNode p1 = head;
        ListNode p2 = second;

        //merge two lists here
        while (p2 != null) {
            ListNode temp1 = p1.next;
            ListNode temp2 = p2.next;

            p1.next = p2;
            p2.next = temp1;

            p1 = temp1;
            p2 = temp2;
        }

    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    private void printNode(ListNode node){
        if(node == null) return;

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
