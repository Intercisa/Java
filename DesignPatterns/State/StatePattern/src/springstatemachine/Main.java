package springstatemachine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.config.StateMachineBuilder.Builder;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.transition.Transition;

public class Main {

	public static StateMachine<States, Events> buildMachine() throws Exception {
		Builder<States, Events> builder = StateMachineBuilder.builder();
		
		builder.configureStates()
			.withStates()
			.initial(States.OFF_HOOK)
			.states(EnumSet.allOf(States.class));
		
		builder.configureTransitions()
			.withExternal()
			.source(States.OFF_HOOK)
			.event(Events.CALL_DIALED)
			.target(States.CONNECTING)
			.and()
			.withExternal()
			.source(States.ON_HOLD)
			.event(Events.HUNG_UP)
			.target(States.OFF_HOOK);
		
		return builder.build();
	}

	public static void main(String[] args) throws Exception {
		StateMachine<States, Events> machine = buildMachine();
		
		machine.start();
		
		States exitState = States.ON_HOOK;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			State<States, Events> state = machine.getState();
			
			System.out.println("The phone is curently " + state.getId());
			System.out.println("Select a trigger:");
			
			List<Transition<States, Events>> ts = machine.getTransitions()
					.stream()
					.filter(t -> t.getSource() == state)
					.collect(Collectors.toList());
			
			for (int i = 0; i < ts.size(); i++) {
				System.out.println("" + i + ". "+ ts.get(i).getTrigger().getEvent());
			}
			
			boolean parseOk;
			int choice = 0;
			do {
				try {
					System.out.println("Please enter your choice:");
					
					choice = Integer.parseInt(console.readLine());
					parseOk = choice >= 0 && choice < ts.size();
				} catch (Exception e) {
					parseOk = false;
					System.out.println("parse failed");
				}
			} while (!parseOk);
			
			//perform the transition
			machine.sendEvent(ts.get(choice).getTrigger().getEvent());
			
			if(machine.getState().getId() == exitState) break;
		}
		System.out.println("And we are done!");
		
		
	}
}
