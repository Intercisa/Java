package subset;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class SubsetsTest {

	@Test
	void test_1() {
		
		List<List<Integer>> list = List.of(List.of(3),
											List.of(1),
											List.of(2),
											List.of(1,2,3),
											List.of(1,3),
											List.of(2,3),
											List.of(1,2),
											List.of());
		
		
		assertEquals(list ,new Subsets().subsets(new int[] {1,2,3}));
	}
}
