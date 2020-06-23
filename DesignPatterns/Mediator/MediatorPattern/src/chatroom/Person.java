package chatroom;

import java.util.ArrayList;
import java.util.List;

public class Person {
	public String name;
	public ChatRoom room;
	private List<String> chatLog = new ArrayList<String>();
	
	public Person(String name) {
		this.name = name;
	}
	
	public void receive(String sender, String message) {
		String s = sender + ": '"+ message+"'";
		System.out.println("["+name+"'s chat session]"+ s);
		chatLog.add(s);
	}
	
	public void say(String message) {
		room.broadcast(name, message);
	}
	
	public void privateMessage(String who, String message) {
		room.message(name, who, message);
	}
	

}
