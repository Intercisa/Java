package observer;

/*
 * 
 * Observer
 * 
 *
 */

public class Main implements Observer<Person> {

	public static void main(String[] args) throws CloneNotSupportedException {
		new Main();
	}
	
	public Main() {
		Person p = new Person();
		p.subscribe(this);
		for (int i = 20; i <= 25; i++) 
			p.setAge(i);
		
	}
	

	@Override
	public void handle(PropertyChangeEventArgs<Person> args) {
		System.out.println("Person's "+ args.propertyName + " has changed to "+ args.newValue);
	}
}
