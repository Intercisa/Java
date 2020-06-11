package sortcolors;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SortColorsTest {
	@Test
	void test_1() {
		assertArrayEquals(new int[] {0,0,1,1,2,2}, new SortColors().sortColors(new int[] {2,0,2,1,1,0}));
	}
}
