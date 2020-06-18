package dynamicdecorator;

/*
 * 
 * Decorator
 * 
 */

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println(circle.info());
		
		ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
		System.out.println(blueSquare.info());
		
		TransparentShape transparentRedCircle = new TransparentShape(new ColoredShape(new Circle(10), "red"), 35);
		System.out.println(transparentRedCircle.info());

	}
}
