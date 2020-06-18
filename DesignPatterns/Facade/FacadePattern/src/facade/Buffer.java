package facade;

public class Buffer {
	private char[] characters;
	private int lineWidth;
	
	public Buffer(int lineHeight, int lineWidth) {
		this.lineWidth = lineWidth;
		characters = new char[lineWidth*lineHeight];
	}
	
	public char charAt(int x, int y) {
		return characters[y*lineWidth+x];
	}
	
}
