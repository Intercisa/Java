package checkifstraightline;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CheckStraightLineTest {
	private CheckStraightLine checkLine = new CheckStraightLine();
	
	@Test
	void test_1() {
		assertEquals(true, checkLine.checkStraightLine(new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
		
	}
	
	@Test
	void test_2() {
		assertEquals(false, checkLine.checkStraightLine(new int[][] {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}));
	}

	
	@Test
	void test_3() {
		assertEquals(true, checkLine.checkStraightLine(new int[][] {{1,1},{2,2}}));
	}
	@Test
	void test_4() {
		assertEquals(true, checkLine.checkStraightLine(new int[][] {{-3,-2},{-1,-2},{2,-2},{-2,-2},{0,-2}}));
	}
	


}
