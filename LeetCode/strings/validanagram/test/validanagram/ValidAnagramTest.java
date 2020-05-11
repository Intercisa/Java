package validanagram;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ValidAnagramTest {

	private ValidAnagram validAnagram = new ValidAnagram();

	@Test
	void test_1() {
		assertEquals(true, validAnagram.isAnagram("anagram", "nagaram"));

	}
	
	@Test
	void test_2() {
		assertEquals(false, validAnagram.isAnagram("rat", "car"));
	}

}
