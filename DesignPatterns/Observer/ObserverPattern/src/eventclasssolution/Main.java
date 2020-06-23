package eventclasssolution;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		Subscription sub = person.propertyChanged.addHandler(x -> {
			System.out.println("Person's " + x.propertyName + " has changed");
		});
		
		person.setAge(17);
		person.setAge(18);
		person.setAge(19);
		person.setAge(20);
		sub.close();
		person.setAge(21);
		
		
	}
}
