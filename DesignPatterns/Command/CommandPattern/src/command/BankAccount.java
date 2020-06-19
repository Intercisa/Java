package command;

public class BankAccount {
	private int balance;
	private int overdraftLimit = -500;

	public void deposit(int amount) {
		balance += amount;
		System.out.println("Deposited " + amount + ", balance is now: " + balance);
	}

	public boolean withdraw(int amount) {
		if (balance - amount >= overdraftLimit) {
			balance -= amount;
			System.out.println("Withdraw " + amount + ", balance is now: " + balance);
			return true;
		} 
			System.out.println("Overdraft limit reached!");
			return false;
	}

	@Override
	public String toString() {
		return String.format("BankAccount [balance=%s]", balance);
	}
}
