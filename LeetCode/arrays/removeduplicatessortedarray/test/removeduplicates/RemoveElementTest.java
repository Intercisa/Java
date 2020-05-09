package removeduplicates;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveElementTest {

	RemoveElement  removeElement= new RemoveElement();
	
	@Test
	void test_1() {
		assertEquals(2, removeElement.removeDuplicates(new int[]{1,1,2}));
	}
	
	@Test
	void test_2() {
		assertEquals(5, removeElement.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
	}
}
