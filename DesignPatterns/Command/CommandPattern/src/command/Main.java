package command;

import java.util.List;

import com.google.common.collect.Lists;

public class Main {

	/*
	 * 
	 * Command
	 * 
	 */

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		System.out.println(account);

		List<BankAccountCommand> commands = List.of(
				new BankAccountCommand(account, BankAccountCommand.Action.DEPOSIT, 100),
				new BankAccountCommand(account, BankAccountCommand.Action.WITHDRAW, 1000));

		for (Command c : commands) {
			c.call();
			System.out.println(account);
		}

		// reverse
		for (Command c : Lists.reverse(commands)) {
			c.undo();
			System.out.println(account);
		}
	}
}
