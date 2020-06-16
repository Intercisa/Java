package exercise;

abstract class Shape {
	protected Renderer renderer;
	
	public Shape(Renderer renderer) {
		this.renderer = renderer;
	}
	
	public abstract String getName();
}
