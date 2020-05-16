package oddevenlinkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class OddEvenLinkedListTest {
	OddEvenLinkedList oddEvenLinked = new OddEvenLinkedList();
	
	@Test
	void test_1() {
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(5);
		
		oddEvenLinked.oddEvenList(root);
		
		assertEquals(1, root.val);
		assertEquals(3, root.next.val);
		assertEquals(5, root.next.next.val);
		assertEquals(2, root.next.next.next.val);
		assertEquals(4, root.next.next.next.next.val);
	}
}
