package firstbadversion;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FirstBadVersionTest {

	private FirstBadVersion firstBad = new FirstBadVersion();
	
	@Test
	void test_1() {
		assertEquals(2, firstBad.firstBadVersion(2));
	}
	


}
