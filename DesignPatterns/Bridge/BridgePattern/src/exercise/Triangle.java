package exercise;

class Triangle extends Shape {
	
	public Triangle(Renderer renderer) {
		super(renderer);
	}

	@Override
	public String getName() {
		return "Triangle";
	}
	
	@Override
	public String toString() {
		return "Drawing " + getName() + " as " + renderer.whatToRenderAs();
	}
	
}