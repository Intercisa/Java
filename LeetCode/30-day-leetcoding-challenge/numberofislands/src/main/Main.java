package main;

import numberofislands.NumberOfIslands;

/*
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
 * You may assume all four edges of the grid are all surrounded by water.
 */

public class Main {

	public static void main(String[] args) {
		
		
		char grid[][] = new char[][] {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};  
		
		NumberOfIslands numsOfIsl = new NumberOfIslands();
		System.out.println(numsOfIsl.numIslands(grid));

	}
}
