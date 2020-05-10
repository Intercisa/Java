package rotatearray;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class RotateArrTest {

	private RotateArr rotateArr = new RotateArr();
	private int[] result; 
	@Test
	void test_1() {
		
		result = rotateArr.rotate(new int[] {1,2,3,4,5,6,7}, 3);
		
		assertEquals(5,result[0]);
		assertEquals(4, result[result.length-1]);
	}
	
	@Test
	void test_2() {
		
		result = rotateArr.rotate(new int[] {-1,-100,3,99}, 2);
		
		assertEquals(3, result[0]);
		assertEquals(-100, result[result.length-1]);
	}
}
