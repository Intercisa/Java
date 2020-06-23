package reactiveextensioneventbroker;

public class FootballPlayer {
	private int goalScored = 0;
	private EventBroker broker;
	public String name;
	
	public FootballPlayer(EventBroker broker, String name) {
		this.broker = broker;
		this.name = name;
	}
	
	public void score() {
		broker.publish(++goalScored);
	}

}
