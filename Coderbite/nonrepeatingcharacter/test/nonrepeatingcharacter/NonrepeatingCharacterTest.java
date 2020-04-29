package nonrepeatingcharacter;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class NonrepeatingCharacterTest {
	NonrepeatingCharacter nonrepeat = new NonrepeatingCharacter();
	
	@Test
	void test_1() {
		assertEquals("a", NonrepeatingCharacter.nonrepeatingCharacter("abcdef"));
	}
	
	@Test
	void test_2() {
		assertEquals("w", NonrepeatingCharacter.nonrepeatingCharacter("hello world hi hey"));
	}

	

}
