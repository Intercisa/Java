package CommandQuerySeparation;

public class Creature {
	private Game game;
	public String name;
	public int baseAttack, baseDefense;
	
	
	public Creature(Game game, String name, int baseAttack, int baseDefense) {
		this.game = game;
		this.name = name;
		this.baseAttack = baseAttack;
		this.baseDefense = baseDefense;
	}


	public int getAttack() {
		Query q = new Query(name, Query.Argument.ATTACK, baseAttack);
		game.queries.fire(q);
		return q.result;
	}

	public int getDefense() {
		Query q = new Query(name, Query.Argument.DEFENSE, baseDefense);
		game.queries.fire(q);
		return q.result;
	}


	@Override
	public String toString() {
		return String.format("Creature [name=%s, attack=%s, defense=%s]", name, getAttack(), getDefense());
	}
	
	
}
