package twosum;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	private TwoSum twoSum = new TwoSum();
	private int[] result; 
	@Test
	void test_1() {
		
		result = twoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
		assertEquals(0,result[0]);
		assertEquals(1, result[result.length-1]);
	}

}
