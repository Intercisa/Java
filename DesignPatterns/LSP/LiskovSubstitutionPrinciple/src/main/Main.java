package main;

import java.io.IOException;

import lsp.Rectangle;
import lsp.Square;

/*
 * 
 * LSP
 * 
 * 
 */

public class Main {

	public static void main(String[] args) throws IOException {
		
		Rectangle rc = new Rectangle(2,3);
		useIt(rc);
		
		Square sq = new Square();
		sq.setWidth(5);
		useIt(sq);
		
		
	}
	
	static void useIt(Rectangle r) {
		int width = r.getWidth();
		r.setHeight(10);
		
		//area = width * 10;
		System.out.println("Expected area of "  + (width*10) + ", got: "+ r.getArea());
		
	}
	
	
}
