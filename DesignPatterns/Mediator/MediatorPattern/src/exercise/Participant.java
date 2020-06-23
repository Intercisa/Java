package exercise;

class Participant {
	
	private int value;
	public Mediator mediator;
	
	
	public Participant(Mediator mediator) {
		this.mediator = mediator;
		mediator.addParticipant(this);
	}

	public void say(int n) {
		mediator.broadcast(this, n);
		
	}
	
	public void notify(Object sender, int value) {
		if(sender != this)
			this.value += value;
	}
	
}