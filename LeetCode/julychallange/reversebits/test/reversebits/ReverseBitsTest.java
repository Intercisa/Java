package reversebits;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import plusone.ReverseBits;

class ReverseBitsTest {

	@Test
	void test_1() {
		assertEquals(Integer.parseUnsignedInt("00111001011110000010100101000000", 2), 
				new ReverseBits().reverseBits(Integer.parseUnsignedInt("00000010100101000001111010011100", 2)));
	}
	
	@Test
	void test_2() {
		assertEquals(Integer.parseUnsignedInt("10111111111111111111111111111111", 2), 
				new ReverseBits().reverseBits(Integer.parseUnsignedInt("11111111111111111111111111111101", 2)));
	}
}
