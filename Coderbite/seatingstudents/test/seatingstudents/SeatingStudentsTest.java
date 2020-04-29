package seatingstudents;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SeatingStudentsTest {

	
	@Test
	void test_1() {
		assertEquals(4, SeatingStudents.seatingStudents(new int[] {6,4}));
	}
	
	@Test
	void test_2() {
		assertEquals(6, SeatingStudents.seatingStudents(new int[] {8,1,8}));
		
	}
	
	@Test
	void test_3() {
		assertEquals(6, SeatingStudents.seatingStudents(new int[] {12, 2, 6, 7, 11}));
		
	}

	

}
