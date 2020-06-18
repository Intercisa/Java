package staticdecorator;

import java.util.function.Supplier;

public class TransparentShape<T extends Shape> implements Shape {

	private Shape shape;
	private int transparency;
	
	public TransparentShape(Supplier<? extends T> ctor, int transparency) {
		this.transparency = transparency;
		this.shape = ctor.get(); 
		
	}
	
	
	@Override
	public String info() {
		return shape.info() + " has the transparency "+ transparency +"%";
	}

}
