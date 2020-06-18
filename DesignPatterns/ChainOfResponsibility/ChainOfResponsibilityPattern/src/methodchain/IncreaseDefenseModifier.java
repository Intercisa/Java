package methodchain;

public class IncreaseDefenseModifier extends CreatureModifier{

	public IncreaseDefenseModifier(Creature creature) {
		super(creature);
	}
	
	
	@Override
	public void handle() {
		creature.defense *= 2;
		System.out.println("Doubling "+ creature.name + "'s defense power! New attack defense is: " +creature.attack);
		super.handle();
		
	}

}
