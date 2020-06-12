package farctories;

/*
 * 
 * Factories
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		Point point = Point.Factory.newCartesianPoint(3, 2);
		Point point2 = Point.Factory.newPolarPoint(3, 2);
	}
}
