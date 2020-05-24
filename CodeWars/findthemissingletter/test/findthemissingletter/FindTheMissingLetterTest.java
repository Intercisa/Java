package findthemissingletter;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FindTheMissingLetterTest {

	@Test
	void test_1() {
		assertEquals('e', FindTheMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
	}
	@Test
	void test_2() {
		assertEquals('P', FindTheMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
	}
}
