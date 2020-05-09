package removeelement;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveElementTest {

	RemoveElement  removeElement= new RemoveElement();
	
	@Test
	void test_1() {
		assertEquals(2, removeElement.removeElement(new int[]{3,2,2,3},3));
	}
	
	@Test
	void test_2() {
		assertEquals(5, removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
	}
}
