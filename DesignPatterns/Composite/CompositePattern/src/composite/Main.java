package composite;

/*
 * 
 * Composite
 * 
 */

public class Main {

	public static void main(String[] args) {
		GraphicObject drawing = new GraphicObject();
		drawing.setName("My Drawing");
		drawing.childrens.add(new Square("Red"));
		drawing.childrens.add(new Circle("Yellow"));
		
		GraphicObject group = new GraphicObject();
		group.childrens.add(new Circle("Blue"));
		group.childrens.add(new Square("Blue"));
		drawing.childrens.add(group);
		
		System.out.println(drawing);
		
	}
}
