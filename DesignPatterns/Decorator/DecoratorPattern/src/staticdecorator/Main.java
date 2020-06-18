package staticdecorator;

/*
 * 
 * Decorator
 * 
 */

public class Main {

	public static void main(String[] args) {
		ColoredShape<Square> blueSquare = new ColoredShape<>(
				() -> new Square(20),  //a lambda for the supplier 
				"blue");
		System.out.println(blueSquare.info());
		
		TransparentShape<ColoredShape<Circle>> myCircle = new TransparentShape<ColoredShape<Circle>>(
				()-> new ColoredShape<Circle>(
						()-> new Circle(10),
						"green"),
				50);
		System.out.println(myCircle.info());
		
		
	}
}
