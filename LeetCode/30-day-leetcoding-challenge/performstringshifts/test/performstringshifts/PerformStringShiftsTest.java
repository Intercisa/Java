package performstringshifts;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PerformStringShiftsTest {

	private PerformStringShifts shifts = new PerformStringShifts();
	
	@Test
	void test_1() {
		assertEquals("efgabcd", shifts.stringShift("abcdefg",new int[][] {{1,1},{1,1},{0,2},{1,3}}));
	}
	
	@Test
	void test_2() {
		assertEquals("cab", shifts.stringShift("abc",new int[][] {{0,1},{1,2}}));	
	}
	
	@Test
	void test_3() {
		assertEquals("qpifxqgwki", shifts.stringShift("xqgwkiqpif",new int[][] {{1,4},{0,7},{0,8},{0,7},{0,6},{1,3},{0,1},{1,7},{0,5},{0,6}}));
	}
	
	@Test
	void test_4() {		
		assertEquals("hcjwpdh", shifts.stringShift("wpdhhcj",new int[][] {{0,7},{1,7},{1,0},{1,3},{0,3},{0,6},{1,2}}));
	}
	

}
