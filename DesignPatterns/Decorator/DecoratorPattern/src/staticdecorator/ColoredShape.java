package staticdecorator;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> implements Shape {

	private Shape shape;
	private String color;
	
	public ColoredShape(Supplier<? extends T> ctor, String color) {
		this.color = color;
		this.shape = ctor.get(); 
		
	}
	
	
	@Override
	public String info() {
		return shape.info() + " has the color "+ color;
	}

}
