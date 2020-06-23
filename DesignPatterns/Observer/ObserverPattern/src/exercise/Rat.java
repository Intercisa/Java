package exercise;

import java.io.Closeable;
import java.io.IOException;

class Rat implements Closeable {
	private Game game;
	public int attack = 1;

	public Rat(Game game) {
		game.ratEnters.subscribe((sender, args) ->{
			if(sender != this) {
				++attack;
				game.notifyRat.invoke(this, (Rat)sender);
			}
		});
		
		game.notifyRat.subscribe((sender, rat)->{
			if(rat == this) ++attack;
		});
		
		game.ratDies.subscribe((sender, args)-> --attack);
		game.ratEnters.invoke(this, null);
		
	}

	@Override
	public void close() throws IOException {
		// todo: rat dies ;(
		game.ratDies.invoke(this, null);
	}
}