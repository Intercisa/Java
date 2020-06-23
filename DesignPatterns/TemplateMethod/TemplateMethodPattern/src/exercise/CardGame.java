package exercise;

abstract class CardGame {
	public Creature[] creatures;

	public CardGame(Creature[] creatures) {
		this.creatures = creatures;
	}

	// returns -1 if no clear winner (both alive or both dead)
	public int combat(int creature1, int creature2) {
		Creature first = creatures[creature1];
		Creature second = creatures[creature2];
		hit(first, second);
		hit(second, first);
		
		boolean firstAlive = first.health > 0;
		boolean secondAlive = second.health > 0;
		if(firstAlive == secondAlive) return -1;
		return firstAlive ? creature1 : creature2;
		
	}

	// attacker hits other creature
	protected abstract void hit(Creature attacker, Creature other);
}
