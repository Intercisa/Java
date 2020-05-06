package majorityelement;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MajorityElementTest {

	MajorityElement  elem= new MajorityElement();
	
	@Test
	void test_1() {
		assertEquals(3, elem.majorityElement(new int[] {3,2,3}));
	}
	
	@Test
	void test_2() {
		assertEquals(2, elem.majorityElement(new int[] {2,2,1,1,1,2,2}));
	}

	
	@Test
	void test_3() {
		assertEquals(3, elem.majorityElementFaster(new int[] {3,2,3}));
	}
	
	@Test
	void test_4() {
		assertEquals(2, elem.majorityElementFaster(new int[] {2,2,1,1,1,2,2}));
	}

}
