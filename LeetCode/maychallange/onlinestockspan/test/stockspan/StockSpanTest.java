package stockspan;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class StockSpanTest {
	private StockSpan stockSpan = new StockSpan();
	
	@Test
	void test_1() {
		int val1 = stockSpan.next(100);
		int val2 = stockSpan.next(80);
		int val3 = stockSpan.next(60);
		int val4 = stockSpan.next(70);
		int val5 = stockSpan.next(60);
		int val6 = stockSpan.next(75);
		int val7 = stockSpan.next(85);
		
		assertEquals(1, val1);
		assertEquals(1, val2);
		assertEquals(1, val3);
		assertEquals(2, val4);
		assertEquals(1, val5);
		assertEquals(4, val6);
		assertEquals(6, val7);
	}
	
	@Test
	void test_2() {
		int val1 = stockSpan.next(29);
		int val2 = stockSpan.next(91);
		int val3 = stockSpan.next(62);
		int val4 = stockSpan.next(76);
		int val5 = stockSpan.next(51);
		
		assertEquals(1, val1);
		assertEquals(2, val2);
		assertEquals(1, val3);
		assertEquals(2, val4);
		assertEquals(1, val5);
	}
}
