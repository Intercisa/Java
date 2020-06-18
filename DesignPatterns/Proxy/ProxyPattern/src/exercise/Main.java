package exercise;

public class Main {

	public static void main(String[] args) {

		Person rPerson = new ResponsiblePerson(12);
		System.out.println(rPerson.drink());
		System.out.println(rPerson.drive());
		System.out.println(rPerson.drinkAndDrive());
		
		var rPerson2 = new ResponsiblePerson(30);
		System.out.println(rPerson2.drink());
		System.out.println(rPerson2.drive());
		System.out.println(rPerson2.drinkAndDrive());
		
		
		
	}
}
