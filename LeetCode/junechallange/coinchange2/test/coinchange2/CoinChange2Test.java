package coinchange2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CoinChange2Test {

	@Test
	void test_1() {
			assertEquals(4, new CoinChange2().change(5, new int[] {1,2,5}));
	}
	
	@Test
	void test_2() {
			assertEquals(0, new CoinChange2().change(3, new int[] {2}));
	}
	
	@Test
	void test_3() {
			assertEquals(1, new CoinChange2().change(10, new int[] {10}));
	}
	
	
	@Test
	void test_4() {
			assertEquals(4, new CoinChange2().changeNaive(5, new int[] {1,2,5}));
	}
	
	@Test
	void test_5() {
			assertEquals(0, new CoinChange2().changeNaive(3, new int[] {2}));
	}
	
	@Test
	void test_6() {
			assertEquals(1, new CoinChange2().changeNaive(10, new int[] {10}));
	}
}
