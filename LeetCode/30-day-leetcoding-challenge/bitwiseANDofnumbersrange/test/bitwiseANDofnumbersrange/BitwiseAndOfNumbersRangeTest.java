package bitwiseANDofnumbersrange;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class BitwiseAndOfNumbersRangeTest {

	private BitwiseAndOfNumbersRange bitwiseAndOfNumbersRange = new BitwiseAndOfNumbersRange();
	
	
	@Test
	void test_1() {
		assertEquals(4,bitwiseAndOfNumbersRange.rangeBitwiseAnd(5, 7) );
	}
	
	@Test
	void test_2() {
		assertEquals(0,bitwiseAndOfNumbersRange.rangeBitwiseAnd(0, 1) );
	}

	

}
