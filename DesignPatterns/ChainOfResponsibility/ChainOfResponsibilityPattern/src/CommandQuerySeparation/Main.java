package CommandQuerySeparation;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		Creature goblin = new Creature(game, "String Goblin", 2, 2);
		System.out.println(goblin);
		
		IncreasedDefenseModifier icm = new IncreasedDefenseModifier(game, goblin);
		DoubleDoubleAttackModifier dam = new DoubleDoubleAttackModifier(game, goblin);
		
		try(dam){
			System.out.println(goblin);
		}
		
		System.out.println(goblin);

	}

}
