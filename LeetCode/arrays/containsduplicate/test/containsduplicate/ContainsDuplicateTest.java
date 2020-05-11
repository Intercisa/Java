package containsduplicate;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

	ContainsDuplicate contain = new ContainsDuplicate();
	@Test
	void test_1() {
		assertEquals(true, contain.containsDuplicate(new int[] {1,2,3,1}));
	}
	@Test
	void test_2() {
		assertEquals(false, contain.containsDuplicate(new int[] {1,2,3,4}));
	}
	@Test
	void test_3() {
		assertEquals(true, contain.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
	}
}
