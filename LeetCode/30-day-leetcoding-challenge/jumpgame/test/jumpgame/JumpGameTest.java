package jumpgame;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import minimumpathsum.JumpGame;

class JumpGameTest {

	private JumpGame jumpGame = new JumpGame();
	
	@Test
	void test_1() {
		assertEquals(true, jumpGame.canJump(new int[] {2,3,1,1,4}));
	}
	
	@Test
	void test_2() {
		assertEquals(false, jumpGame.canJump(new int[] {3,2,1,0,4}));
	}
	

}
