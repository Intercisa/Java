package main;

import checkifstraightline.CheckStraightLine;

/*
 * You are given an array coordinates,
 * coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. 
 * Check if these points make a straight line in the XY plane.
 * 
 * The point is if we take points p1(x, y), p2(x1, y1), p3(x3, y3), slopes of any two pairs is same then p1, p2, p3 lies on same line.
 * slope from p1 and p2 is y - y1 / x - x1
 * slope from p2 and p3 is y2 - y1 / x2 - x1
 * if these two slopes equal, then p1, p2, p3 lies on same line.
 * 
 * we are using slope concept in Mathematics.
 * Consider three points (x1, y1) (x2. y2) (x3,y3)
 * y2-y1 / x2-x1 = y3-y2/x3-x2
 * 
 * If above condition becomes true then above three points lie on same straight line.
 * Here, tSlope is temporary slope which will be changed while iterating all coordinates and slope variable is a slope between first two coordinates. 
 * Also here, coordinates[i][0] is x coordinate and coordinate [i][1] is y coordinate.
 * 
 * 
 * Here we are using division so there is a chance for occurrence of Divide By Zero Exception(Run Time Exception)!!
 * To avoid this, we need to convert all coordinates to double, because any number divided by double or float 0, compiler consider it as a INFINITY 
 * and not as RunTimeException. By this way we need to avoid this exception.
 * In this problem initially we are finding slope for first two coordinates. Then by iterating other coordinates, 
 * we are going to take slopes for those also. If any of slope not equals with first slope [i.e., slope between first two coordinates] returns false . 
 * 
 * Else if all are equal then at end, returns true.
 * Here, tSlope is temporary slope which will be changed while iterating all coordinates and slope variable is a slope between first two coordinates. 
 * Also here, coordinates[i][0] is x coordinate and coordinate [i][1] is y coordinate.
 * 
 */

public class Main {

	public static void main(String[] args) {
	
		
		CheckStraightLine straightLine = new CheckStraightLine();
		straightLine.checkStraightLine(new int[][] {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}});

		
		
	}
}
