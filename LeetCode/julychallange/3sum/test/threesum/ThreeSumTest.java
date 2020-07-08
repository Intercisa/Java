package threesum;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class ThreeSumTest {

	@Test
	void test_1() {

		List<List<Integer>> list = List.of(List.of(-1, 0, 1), List.of(-1, -1, 2));

		assertEquals(list, new ThreeSum().threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
	}

}
