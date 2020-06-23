package state;

public class LightSwitch {
	private State state; //OnState, OffStae


	public LightSwitch() {
		this.state = new OffState();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	
	void on() {state.on(this);}
	void off() {state.off(this);}
}
