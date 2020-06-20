package permutation;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PermutationSequenceTest {

	@Test
	void test_1() {
		assertEquals("213", new PermutationSequence().getPermutation(3, 3));
	}
	
	
	@Test
	void test_2() {
		assertEquals("2314", new PermutationSequence().getPermutation(4, 9));
	}
}
