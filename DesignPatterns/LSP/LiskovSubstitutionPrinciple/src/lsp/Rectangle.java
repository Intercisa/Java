package lsp;

public class Rectangle {
	protected int width, height;
	
	public Rectangle() {}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {return width*height;}
	
	
	public boolean isSquare() {
		return this.width == this.height;
	}
	
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}

	
	@Override
	public String toString() {
		return String.format("Rectangle [width=%s, height=%s]", width, height);
	}
	
	
	
}
