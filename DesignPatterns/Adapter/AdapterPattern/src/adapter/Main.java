package adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
 * Adapter
 * 
 */

public class Main {
	private final static List<VectorObject> VECTOR_OBJECTS = 
			new ArrayList<VectorObject>(Arrays.asList(
				new VectorRectangle(1, 1, 10, 10),
				new VectorRectangle(3, 3, 6, 6)
			));
	
	public static void main(String[] args) {
		draw();
		draw();

		
	}
	
	private static void draw() {
		for(VectorObject v : VECTOR_OBJECTS) {
			for(Line line : v) {
				LineToPointAdapter adapter = new LineToPointAdapter(line);
				adapter.forEach(Main::drawPoint);
			}
		}
		
		
	}
	
	public static void drawPoint(Point p) {
		System.out.println(".");
	}

}
