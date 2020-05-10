package checkifNanditsdoubleexist;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CheckIfNAndDoubleExistTest {

	CheckIfNAndDoubleExist exist= new CheckIfNAndDoubleExist();
	
	@Test
	void test_1() {
		assertEquals(true, exist.checkIfExist(new int[]{10,2,5,3}));
	}
	
	@Test
	void test_2() {
		assertEquals(true, exist.checkIfExist(new int[]{7,1,14,11}));
	}
	
	@Test
	void test_3() {
		assertEquals(false, exist.checkIfExist(new int[]{3,1,7,11}));
	}
	
	@Test
	void test_4() {
		assertEquals(false, exist.checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
	}
	
	@Test
	void test_5() {
		assertEquals(true, exist.checkIfExist(new int[]{0,0}));
	}
}
