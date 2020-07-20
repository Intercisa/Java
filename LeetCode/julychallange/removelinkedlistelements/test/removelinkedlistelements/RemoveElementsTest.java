package removelinkedlistelements;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveElementsTest {

	@Test
	void test_1() {

		ListNode actual = new ListNode(1,
						  new ListNode(2, 
						  new ListNode(6, 
						  new ListNode(3, 
						  new ListNode(4, 
						  new ListNode(5, 
						  new ListNode(6)))))));


		assertEquals(3, new RemoveElements().removeElements(actual, 6).next.next.val);
	}
}
