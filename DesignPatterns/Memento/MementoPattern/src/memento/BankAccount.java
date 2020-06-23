package memento;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public Memento deposit(int amount) {
		balance+=amount;
		return new Memento(balance);
	}
	
	public void restore(Memento m) {
		balance = m.getBalance();
	}

	@Override
	public String toString() {

		return String.format("BankAccount [balance=%s]", balance);
	}
	
}
