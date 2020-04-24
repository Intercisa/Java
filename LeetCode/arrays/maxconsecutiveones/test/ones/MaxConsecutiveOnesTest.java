package ones;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import ones.MaxConsecutiveOnes;

class MaxConsecutiveOnesTest {
	MaxConsecutiveOnes maxOne = new MaxConsecutiveOnes();
	
	
	@Test
	void test_1() {
		assertEquals(3, maxOne.findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
	}

	

}
