package firstuniquecharacterinstring;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FirstUniqueCharTest {
	private FirstUniqueChar firstUnique = new FirstUniqueChar();
	
	@Test
	void test_1() {
		assertEquals(0, firstUnique.firstUniqChar("leetcode"));
	}
	
	@Test
	void test_2() {
		assertEquals(2, firstUnique.firstUniqChar("loveleetcode"));
	}

	@Test
	void test_3() {
		assertEquals(0, firstUnique.firstUniqCharFast("leetcode"));
	}
	
	@Test
	void test_4() {
		assertEquals(2, firstUnique.firstUniqCharFast("loveleetcode"));
	}
	


}
