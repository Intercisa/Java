package sortcharactersbyfrequency;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SortCharactersByFrequencyTest {
	
	private SortCharactersByFrequency sort = new SortCharactersByFrequency();
	
	@Test
	void test_1() {
		
		assertEquals("eert", sort.frequencySort("tree"));
		
	}

	
	
	@Test
	void test_2() {
		assertEquals("aaaccc", sort.frequencySort("cccaaa"));
	}
	
	
	
	@Test
	void test_3() {
		assertEquals("bbAa", sort.frequencySort("Aabb"));
	}

}
