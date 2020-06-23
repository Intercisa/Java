package state;

public class State {
	
	void on(LightSwitch ls) {
		System.out.println("Ligth is already on");
		ls.setState(new OnState());
	}
	
	void off(LightSwitch ls) {
		System.out.println("Ligth is already off");
		ls.setState(new OffState());
	}

}
