package commandqueryseparation;

public class IncreasedDefenseModifier extends CreatureModifier{

	private final int token;
	
	public IncreasedDefenseModifier(Game game, Creature creature) {
		super(game, creature);
		token = game.queries.subscribe(q ->{
			if(q.creatureName.equals(creature.name) && q.argument == Query.Argument.DEFENSE) {
				q.result+=3;
			}
		});
	}

}
