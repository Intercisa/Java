package helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	private HelloWorld helloW = new HelloWorld();
	
	@Test
	void test_1() {
		assertEquals("Hello, World.", helloW.helloWorld());
	}


}
