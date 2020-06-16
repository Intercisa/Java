package validateIPaddress;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ValidIPAddressTest {

	@Test
	void test_1() {
		assertEquals("IPv4", new ValidIPAddress().validIPAddress("172.16.254.1"));
	}
	
	@Test
	void test_2() {
		assertEquals("IPv6", new ValidIPAddress().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
	}
	
	
	@Test
	void test_3() {
		assertEquals("Neither", new ValidIPAddress().validIPAddress("256.256.256.256"));
	}
	
}
