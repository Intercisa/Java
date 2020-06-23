package nullobject;

/*
 * 
 * Null Object
 * 
 */


public class Main {
	public static void main(String[] args) {
		NullLog log = new NullLog();
		BankAccount account = new BankAccount(log);
		
		account.deposit(100);
		
	}

}
