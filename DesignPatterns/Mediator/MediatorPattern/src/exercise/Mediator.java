package exercise;

import java.util.ArrayList;
import java.util.List;

class Mediator {
	
	List<Participant> participants = new ArrayList<Participant>();
	
	public void addParticipant(Participant p) {
		participants.add(p);
	}
	
	
	public void broadcast(Object sender, int value) {
		for(Participant p : participants) 
			p.notify(sender, value);
	}
}