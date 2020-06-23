package memento;

/*
 * 
 * Memento
 * 
 */


public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(100);
		Memento memento1 = account.deposit(50); //150
		Memento memento2 = account.deposit(25); //175
		System.out.println(account);
		
		
		//restore to memento1
		account.restore(memento1);
		System.out.println(account);
	
		//restore to memento2
		account.restore(memento2);
		System.out.println(account);
		
		
	}

}
