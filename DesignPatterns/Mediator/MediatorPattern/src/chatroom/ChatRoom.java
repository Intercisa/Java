package chatroom;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	private List<Person> people = new ArrayList<Person>();
	
	public void join(Person p) {
		String joinMsg = p.name + " joins the room";
		broadcast("room", joinMsg);
		
		p.room = this;
		people.add(p);
		
	}

	public void broadcast(String source, String message) {
		for(Person person : people)
			if(!person.name.equals(source))
				person.receive(source, message);
		
	}

	public void message(String source, String destination, String message) {
		people.stream()
		.filter(p -> p.name.equals(destination))
		.findFirst()
		.ifPresent(person -> person.receive(source, message));
	}
	
}
