package jewelsandstones;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class JewelsAndStonesTest {

	JewelsAndStones jewels = new JewelsAndStones();
	
	@Test
	void test_1() {
		assertEquals(3, jewels.numJewelsInStones("aA", "aAAbbbb"));
	}
	
	@Test
	void test_2() {
		assertEquals(0, jewels.numJewelsInStones("z", "ZZ"));
	}
	


}
