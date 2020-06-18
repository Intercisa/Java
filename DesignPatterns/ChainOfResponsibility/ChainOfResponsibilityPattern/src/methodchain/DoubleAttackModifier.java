package methodchain;

public class DoubleAttackModifier extends CreatureModifier{

	public DoubleAttackModifier(Creature creature) {
		super(creature);
	}
	
	
	@Override
	public void handle() {
		creature.attack *= 2;
		System.out.println("Doubling "+ creature.name + "'s attack power! New attack power is: " +creature.attack);
		super.handle();
		
	}

}
