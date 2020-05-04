package numbercomplement;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class NumberComplementTest {

	NumberComplement  numberComplement = new NumberComplement();
	
	@Test
	void test_1() {
		assertEquals(2, numberComplement.findComplement(5));
	}
	
	@Test
	void test_2() {
		assertEquals(0, numberComplement.findComplement(1));
	}
	
	@Test
	void test_3() {
		assertEquals(5, numberComplement.findComplement(10));
	}
	
	@Test
	void test_4() {
		assertEquals(0, numberComplement.findComplement(7));
	}


}
