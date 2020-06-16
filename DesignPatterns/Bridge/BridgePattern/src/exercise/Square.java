package exercise;

class Square extends Shape {
	
	public Square(Renderer renderer) {
		super(renderer);
	}

	@Override
	public String getName() {
		return "Square";
	}
	
	@Override
	public String toString() {
		return "Drawing " + getName() + " as " + renderer.whatToRenderAs();
	}
	
}