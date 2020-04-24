package even;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class EvenNumberDigitsTest {
	EvenNumberDigits evens = new EvenNumberDigits();
	
	
	@Test
	void test_1() {
		assertEquals(2, evens.findNumbers(new int[] {12,345,2,6,7896}));
	}
	
	@Test
	void test_2() {
		assertEquals(1, evens.findNumbers(new int[] {555,901,482,1771}));
	}

	

}
