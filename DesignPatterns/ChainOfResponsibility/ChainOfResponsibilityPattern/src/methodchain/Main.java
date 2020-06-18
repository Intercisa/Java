package methodchain;

public class Main {
	/*
	 * Chain of Responsibility 
	 * 
	 */

	public static void main(String[] args) {
		
		Creature goblin = new Creature("Goblin", 2, 2);
		System.out.println(goblin);
		
		CreatureModifier root = new CreatureModifier(goblin);
		
		//root.add(new NoBonusesModifier(goblin));
		root.add(new DoubleAttackModifier(goblin));
		root.add(new IncreaseDefenseModifier(goblin));
		root.add(new DoubleAttackModifier(goblin));
		root.add(new IncreaseDefenseModifier(goblin));
		
		root.handle();
		System.out.println(goblin);
	}
}
