package bridge;

import com.google.inject.Guice;
import com.google.inject.Injector;

/*
 * 
 * Bridge
 * 
 */

public class Main {
	
	public static void main(String[] args) {
		/*
		RasterRenderer raster = new RasterRenderer();
		VectorRenderer vector = new VectorRenderer();
		Circle circle = new Circle(vector, 5);
		circle.draw();
		
		circle.resize(2);
		
		circle.draw();
		*/
		
		//using injection with Google Guice 
		
		Injector injector = Guice.createInjector(new ShapeModule());
		Circle instance = injector.getInstance(Circle.class);
		instance.radius = 3;
		instance.draw();
		
		instance.resize(2);
		
		instance.draw();
		
	}
}
