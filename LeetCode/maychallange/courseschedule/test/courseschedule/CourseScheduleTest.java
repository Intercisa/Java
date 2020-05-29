package courseschedule;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CourseScheduleTest {
	@Test
	void test_1() {
		assertEquals(true, new CourseSchedule().canFinish(2, new int[][] {{1,0}}));
	}
	@Test
	void test_2() {
		assertEquals(false, new CourseSchedule().canFinish(2, new int[][] {{1,0},{0,1}}));
	}

}
