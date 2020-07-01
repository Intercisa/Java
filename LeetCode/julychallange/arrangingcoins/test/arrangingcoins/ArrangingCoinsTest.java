package arrangingcoins;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ArrangingCoinsTest {

	@Test
	void test_1() {
		assertEquals(3, new ArrangingCoins().arrangeCoins(8));
	}
	
	@Test
	void test_2() {
		assertEquals(2, new ArrangingCoins().arrangeCoins(5));
	}
}
