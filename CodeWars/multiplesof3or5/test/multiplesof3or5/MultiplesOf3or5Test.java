package multiplesof3or5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MultiplesOf3or5Test {

	@Test
	void test_1() {
		 assertEquals(23, new MultiplesOf3or5().solution(10));
	}
	
}
