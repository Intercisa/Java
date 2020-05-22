package singleelement;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SingeleElemSortedArrayTest {

	
	SingeleElemSortedArray single = new SingeleElemSortedArray();
	
	@Test
	void test_1() {
		assertEquals(2, single.singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
		
	}

	
	
	@Test
	void test_2() {
		assertEquals(10, single.singleNonDuplicate(new int[] {3,3,7,7,10,11,11}));
	}
}
