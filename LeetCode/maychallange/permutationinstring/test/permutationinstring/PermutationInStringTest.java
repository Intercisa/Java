package permutationinstring;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PermutationInStringTest {

	private PermutationInString check = new PermutationInString();
	@Test
	void test_1() {
		assertEquals(true, check.checkInclusion("ab", "eidbaooo"));

	}
	
	@Test
	void test_2() {
		assertEquals(false, check.checkInclusion("ab", "eidboaoo"));
	}

}
