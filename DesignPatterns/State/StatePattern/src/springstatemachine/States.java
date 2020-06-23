package springstatemachine;

public enum States { //plural coz the spring framework also have a state and we don't want to collide 
	OFF_HOOK, // starting state
	ON_HOOK, // terminal state
	CONNECTING, 
	CONNECTED,
	ON_HOLD
}
