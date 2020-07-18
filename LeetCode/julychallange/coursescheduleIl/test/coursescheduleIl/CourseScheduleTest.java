package coursescheduleIl;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class CourseScheduleTest {

	@Test
	void test_1() {
		//assertArrayEquals(new int[] {0,1}, new CourseSchedule().findOrder(2, new int[][] {{1,0}}));
	}
	
	@Test
	void test_2() {
		assertArrayEquals(new int[] {0,1,2,3}, new CourseSchedule().findOrder(4, new int[][] {{1,0},
																							  {2,0},
																							  {3,1},
																							  {3,2}}));
	}
}
