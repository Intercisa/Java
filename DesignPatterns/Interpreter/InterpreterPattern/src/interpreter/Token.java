package interpreter;

public class Token {

	public enum Type{
		INTEGER,
		PLUS,
		MINUS,
		LPAREN,
		RPAREN
	}
	
	public Type type;
	public String text;
	
	public Token(Type type, String text) {
		this.type = type;
		this.text = text;
	}

	@Override
	public String toString() {
		return "`" + text +"`";
	}
	
	
	
}
