package dynamicdecorator;

public class TransparentShape implements Shape{

	
	private Shape shape;
	private int transparency;
	
	public TransparentShape(Shape shape, int transparency) {
		this.shape = shape;
		this.transparency = transparency;
	}

	@Override
	public String info() {
		return shape.info() + " has the transparency of "+ transparency+"%";
	}
}
