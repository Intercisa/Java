package template;

public abstract class Game {

	protected int currentPalyer;
	protected final int numberOfPlayer;
	
	public Game(int numberOfPlayer) {
		this.numberOfPlayer = numberOfPlayer;
	}
	
	public void run() {
		start();
		while (!haveWinner()) 
			takeTurn();
		
		System.out.println("Player " + getWinningPlayer()+ " wins");
		
	}
	
	protected abstract int getWinningPlayer();
	protected abstract void takeTurn();
	protected abstract boolean haveWinner();
	protected abstract void start();
	
}
