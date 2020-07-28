package taskscheduler;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TaskSchedulerTest {

	@Test
	void test_1() {
		assertEquals(8, new TaskScheduler().leastInterval(new char[] {'A','A','A','B','B','B'}, 2));
	}
	
	@Test
	void test_2() {
		assertEquals(6, new TaskScheduler().leastInterval(new char[] {'A','A','A','B','B','B'}, 0));
	}
	
	@Test
	void test_3() {
		assertEquals(16, new TaskScheduler().leastInterval(new char[] {'A','A','A','A','A','A','B','C','D','E','F','G'}, 2));
	}
}
