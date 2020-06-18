package flyweight_user;

/*
 * 
 * Flyweight
 * 
 */

public class Main {

	public static void main(String[] args) {		
		User2 user = new User2("John Smith");
		User2 user2 = new User2("Jane Smith");
		
		//testing
		for(int i : user.names) 
			System.out.println(User2.strings.get(i));
		
		for(int i : user2.names) 
			System.out.println(User2.strings.get(i));

	}
}
