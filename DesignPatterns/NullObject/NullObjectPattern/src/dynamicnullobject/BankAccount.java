package dynamicnullobject;

public class BankAccount {
	private Log log;
	private int balance; 
	
	public BankAccount(Log log) {
		this.log = log;
	}
	
	public void deposit(int amount) {
		balance+=amount;
		
		if(log!= null) //defensive coding is a solution to 
			log.info("Deposited "+ amount);
	}
	
	
}
