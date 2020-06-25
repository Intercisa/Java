package findtheduplicatenumber;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FindDuplicateNumTest {

	@Test
	void test_1() {
		assertEquals(2, new FindDuplicateNum().findDuplicate(new int[] {1,3,4,2,2}));
	}
	
	@Test
	void test_2() {
		assertEquals(3, new FindDuplicateNum().findDuplicate(new int[] {3,1,3,4,2}));
	}
	
	@Test
	void test_3() {
		assertEquals(2, new FindDuplicateNum().findDuplicate(new int[] {2,2,2,2,2}));
	}
	
	@Test
	void test_4() {
		assertEquals(2, new FindDuplicateNum().findDuplicate(new int[] {1,3,4,2,2}));
	}

}
