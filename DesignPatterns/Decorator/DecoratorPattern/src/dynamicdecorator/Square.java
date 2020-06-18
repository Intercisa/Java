package dynamicdecorator;

public class Square implements Shape {
	private float side;
	
	public Square() {}
	
	public Square(float side) {
		this.side = side;
	}

	void resize(float factor) {
		side *= factor;
	}

	@Override
	public String info() {
		return "A square with a side of " + side;
	}
 
}
