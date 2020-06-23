package exercise;

class PermanentCardDamageGame extends CardGame {

	public PermanentCardDamageGame(Creature[] creatures) {
		super(creatures);
	}

	@Override
	protected void hit(Creature attacker, Creature other) {
		other.health -= attacker.attack;
	}
}