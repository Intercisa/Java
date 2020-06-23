package reactiveextensioneventbroker;

public class FootballCoach {
	
	public FootballCoach(EventBroker broker) {
		broker.subscribe(i -> {
			System.out.println("hey, sou scored " + i + " goals!");
		});
	}
	
}
