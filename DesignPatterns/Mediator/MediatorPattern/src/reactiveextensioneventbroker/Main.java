package reactiveextensioneventbroker;

public class Main {

	public static void main(String[] args) {
		EventBroker broker = new EventBroker();
		FootballPlayer player = new FootballPlayer(broker, "Jones");
		FootballCoach coach = new FootballCoach(broker);
		
		player.score();
		player.score();
		player.score();
		player.score();
		player.score();

	}

}
