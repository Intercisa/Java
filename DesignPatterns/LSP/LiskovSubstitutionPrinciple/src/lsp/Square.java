package lsp;

public class Square extends Rectangle {
	
	public Square(){}
	
	public Square(int size) {
		width = height = size;
	}
	
	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}
	
	@Override
	public void setWidth(int width) {
		super.setHeight(width);
		super.setWidth(width);
	}

}
