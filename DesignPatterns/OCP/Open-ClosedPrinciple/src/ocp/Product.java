package ocp;

public class Product {
	
	public String name;
	public Color color;
	public Size size;
	
	public Product(String name, Color color, Size size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return String.format("Product [name=%s, color=%s, size=%s]", name, color, size);
	}
	
	

}
