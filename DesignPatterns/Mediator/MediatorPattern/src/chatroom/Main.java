package chatroom;

/*
 * 
 * Mediator
 * 
 */


public class Main {
	public static void main(String[] args) {

		
		ChatRoom chatRoom = new ChatRoom();
		Person john = new Person("John");
		Person jane = new Person("Jane");
		chatRoom.join(john);
		chatRoom.join(jane);
		
		john.say("hi room");
		jane.say("oh, hey John!");
		
		
		Person simon = new Person("Simon");
		chatRoom.join(simon);
		simon.say("hi everyone!");
		
		jane.privateMessage("Simon", "glad you could join us");
		
		
	}

}
