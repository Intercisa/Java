package linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {
	private MyLinkedList linkedList = new MyLinkedList();
	
	@Test
	void test_1() {
		linkedList.addAtHead(1);
		linkedList.addAtTail(3);
		linkedList.addAtIndex(1, 2);
		assertEquals(2, linkedList.get(1));
		linkedList.deleteAtIndex(1);
		assertEquals(3, linkedList.get(1));
		
	}
}
