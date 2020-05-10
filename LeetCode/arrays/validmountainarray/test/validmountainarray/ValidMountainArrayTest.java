package validmountainarray;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ValidMountainArrayTest {

	ValidMountainArray exist= new ValidMountainArray();
	
	@Test
	void test_1() {
		assertEquals(false, exist.validMountainArray(new int[]{2,1}));
	}
	
	@Test
	void test_2() {
		assertEquals(false, exist.validMountainArray(new int[]{3,5,5}));
	}
	
	@Test
	void test_3() {
		assertEquals(true, exist.validMountainArray(new int[]{0,3,2,1}));
	}

}
