package replaceelementswithgreatestelementright;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ReplaceElementsWithgreatestElementRightTest {

	ReplaceElementsWithgreatestElementRight greatestRight= new ReplaceElementsWithgreatestElementRight();
	
	
	
	@Test
	void test_1() {
		assertEquals(18, greatestRight.replaceElements(new int[]{17,18,5,4,6,1})[0]);
	}
	

}
