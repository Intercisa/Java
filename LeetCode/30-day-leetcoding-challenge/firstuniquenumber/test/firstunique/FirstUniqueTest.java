package firstunique;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FirstUniqueTest {
	private FirstUnique firstUnique;

	@Test
	void test_1() {
		
		firstUnique = new FirstUnique(new int[] {2,3,5});
		assertEquals(2, firstUnique.showFirstUnique());
		
		firstUnique.add(5);
		assertEquals(2, firstUnique.showFirstUnique());
		
		firstUnique.add(2);
		assertEquals(3, firstUnique.showFirstUnique());
		
		firstUnique.add(3);
		assertEquals(-1, firstUnique.showFirstUnique());
		
	}
	@Test
	void test_2() {
		
		firstUnique = new FirstUnique(new int[] {7,7,7,7,7,7});
		assertEquals(-1, firstUnique.showFirstUnique());
		
		firstUnique.add(7);
		firstUnique.add(3);
		firstUnique.add(3);
		firstUnique.add(7);
		firstUnique.add(17);

		assertEquals(17, firstUnique.showFirstUnique());
		
	}
	@Test
	void test_3() {
		
		firstUnique = new FirstUnique(new int[] {809});
		assertEquals(809, firstUnique.showFirstUnique());
		firstUnique.add(809);
		assertEquals(-1, firstUnique.showFirstUnique());
		
	}
	

}
