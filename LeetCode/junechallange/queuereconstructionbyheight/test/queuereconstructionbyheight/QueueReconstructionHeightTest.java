package queuereconstructionbyheight;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class QueueReconstructionHeightTest {

	@Test
	void test_1() {
		assertArrayEquals(new int[][] {{5,0},{7,0},{5,2},{6,1},{4,4},{7,1}}, 
				new QueueReconstructionHeight().reconstructQueue(new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}})); 
	}
}
