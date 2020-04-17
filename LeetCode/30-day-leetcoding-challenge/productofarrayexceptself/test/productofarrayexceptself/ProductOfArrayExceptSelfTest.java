package productofarrayexceptself;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

	private ProductOfArrayExceptSelf productOf = new ProductOfArrayExceptSelf();
	
	@Test
	void test_1() {
		assertArrayEquals(new int[] {24,12,8,6}, productOf.productExceptSelf(new int[] {1,2,3,4}));
		;
		
	}
	

	

}
