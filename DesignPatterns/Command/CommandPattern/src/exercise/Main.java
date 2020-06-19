package exercise;

import java.util.List;

import exercise.Command.Action;

public class Main {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		List<Command> commands =List.of(
				new Command(Action.DEPOSIT, 500),
				new Command(Action.WITHDRAW, 200),
				new Command(Action.WITHDRAW, 400)
				);
		
		for (Command c : commands) {
			acc.process(c);
			System.out.println(acc.balance + " " + c.success);
		}
		
		
	}
}
