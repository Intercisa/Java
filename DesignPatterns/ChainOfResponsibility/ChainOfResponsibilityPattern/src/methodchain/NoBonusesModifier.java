package methodchain;

public class NoBonusesModifier  extends CreatureModifier{

	public NoBonusesModifier(Creature creature) {
		super(creature);
	}

	@Override
	public void handle() {
		System.out.println("No bonuses for you!");
	}
}
