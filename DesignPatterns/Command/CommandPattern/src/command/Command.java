package command;

public interface Command {
	void call();
	
	//undo operations
	void undo();
	
}
