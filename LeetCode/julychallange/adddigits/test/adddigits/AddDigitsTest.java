package adddigits;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class AddDigitsTest {

	@Test
	void test_1() {
		assertEquals(2, new AddDigits().addDigits(38));
	}
}
