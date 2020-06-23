package exercise;

public class Main {

	public static void main(String[] args) throws Exception {
		
		NullLog log = new NullLog();
		Account account = new Account(log);
		account.someOperation();
	}
}
