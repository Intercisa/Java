package faceted;

/*
 * 
 * Recursive Generics Builder
 * 
 * 
 */

public class Main {

	public static void main(String[] args)  {
		
		PersonBuilder pb = new PersonBuilder();
		Person person = pb
				.lives()
					.at("Nope Nope 5/A 1/9")
					.in("Budapest")
					.withPostcode("232312")
				.works()
					.at("NopeWorks")
					.asA("engineer")
					.earning(83629813)
				.build();
		
		System.out.println(person);
		
	}
}
