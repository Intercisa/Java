package exercise;

class SquareToRectangleAdapter implements Rectangle {
	
	private int side;
	
	
	public SquareToRectangleAdapter(Square square) {
		this.side = square.side;
	}

	@Override
	public int getWidth() {
		return side;
	}

	@Override
	public int getHeight() {
		return side;
	}
}