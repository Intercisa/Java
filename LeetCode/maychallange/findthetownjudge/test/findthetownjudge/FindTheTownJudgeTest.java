package findthetownjudge;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FindTheTownJudgeTest {

	FindTheTownJudge  findJudge= new FindTheTownJudge();
	
	@Test
	void test_1() {
		assertEquals(2, findJudge.findJudge(2, new int[][] {{1,2}}));
	}
	
	@Test
	void test_2() {
		assertEquals(3, findJudge.findJudge(3, new int[][] {{1,3},{2,3}}));
	}

	@Test
	void test_3() {
		assertEquals(-1, findJudge.findJudge(3, new int[][] {{1,3},{2,3},{3,1}}));
	}
	
	@Test
	void test_4() {
		assertEquals(-1, findJudge.findJudge(3, new int[][] {{1,2},{2,3}}));
	}
	
	@Test
	void test_5() {
		assertEquals(3, findJudge.findJudge(4, new int[][] {{1,3},{1,4},{2,3},{2,4},{4,3}}));

}
}