package shortest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ShortestWordTest {

	@Test
	void test_1() {
		assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
	}
}
