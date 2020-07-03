package prisoncellsafterNdays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class PrisonCellsTest {

	@Test
	void test_1() {
		assertArrayEquals(new int[] {0,0,1,1,0,0,0,0}, new PrisonCells().prisonAfterNDays(new int[] {0,1,0,1,1,0,0,1}, 7));
	}
	
	@Test
	void test_2() {
		assertArrayEquals(new int[] {0,0,1,1,1,1,1,0}, new PrisonCells().prisonAfterNDays(new int[] {1,0,0,1,0,0,1,0}, 1000000000));
	}
	
}
