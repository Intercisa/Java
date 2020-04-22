package subarraysumequalsk;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SubarraySumEqualsKTest {

	SubarraySumEqualsK subarraySumEquals = new SubarraySumEqualsK();
	
	@Test
	void test_1() {
		assertEquals(2,  subarraySumEquals.subarraySum(new int[]{1,1,1},2));
	}
	
	@Test
	void test_2() {
		assertEquals(2,  subarraySumEquals.subarraySum(new int[]{1,2,3},3));
	}
	@Test
	void test_3() {
		assertEquals(1,  subarraySumEquals.subarraySum(new int[]{1},1));
	}
	@Test
	void test_4() {
		assertEquals(1,  subarraySumEquals.subarraySum(new int[]{-1, -1, 1},0));
	}


	

}
