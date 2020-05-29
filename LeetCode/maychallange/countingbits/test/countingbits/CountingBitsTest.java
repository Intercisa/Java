package countingbits;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class CountingBitsTest {

	@Test
	void test_1() {
		assertArrayEquals(new int[] {0,1,1}, new CountingBits().countBitsRecursive(2));
	}
	
	@Test
	void test_2() {
		assertArrayEquals(new int[] {0,1,1,2,1,2}, new CountingBits().countBitsRecursive(5));
		
		
		
	}


	
	

	
	


}
