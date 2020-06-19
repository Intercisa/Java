package arraybackedproperties;

public class Main {
	
	public static void main(String[] args) {
		Creature creature = new Creature();
		creature.setAgility(9);
		creature.setIntelligence(9);
		creature.setStrength(9);
		
		System.out.println("Creature has a max stat of " + creature.max());
		System.out.println("Creature has a total stat of " + creature.sum());
		System.out.println("Creature has an avarage stat of " + creature.average());
		
		
		
	}
}
