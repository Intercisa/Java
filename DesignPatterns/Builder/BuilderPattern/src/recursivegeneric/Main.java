package recursivegeneric;

/*
 * 
 * Recursive Generics Builder
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		EmployeeBuilder pb = new EmployeeBuilder();
		Person dmitri = pb.withName("Dmitri")
				.worksAt("developer")
				.build();
		
		System.out.println(dmitri);
		
	}
}
