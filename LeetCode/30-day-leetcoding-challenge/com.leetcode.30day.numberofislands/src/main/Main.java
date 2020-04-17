package main;

import numberofislands.NumberOfIslands;

public class Main {

	public static void main(String[] args) {
		
		
		char grid[][] = new char[][] {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};  
		
		NumberOfIslands numsOfIsl = new NumberOfIslands();
		System.out.println(numsOfIsl.numIslands(grid));

	}
}
