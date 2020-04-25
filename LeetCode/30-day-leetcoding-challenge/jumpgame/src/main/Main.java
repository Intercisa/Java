package main;

import minimumpathsum.JumpGame;

/*
	Given an array of non-negative integers, you are initially positioned at the first index of the array.
	Each element in the array represents your maximum jump length at that position.
	Determine if you are able to reach the last index.
 */

public class Main {

	public static void main(String[] args) {
		JumpGame jumpGame = new JumpGame();
		jumpGame.canJump(new int[] {3,2,1,0,4});

	}
}
