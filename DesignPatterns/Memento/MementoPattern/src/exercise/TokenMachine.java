package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class TokenMachine {
	public List<Token> tokens = new ArrayList<>();

	public Memento addToken(int value) {
		return addToken(new Token(value));
	}

	//because of references 
	public Memento addToken(Token token) {
		tokens.add(token);
		Memento m = new Memento();
		m.tokens = tokens.stream()
				.map(t -> new Token(t.value))
				.collect(Collectors.toList());
		return m;
	}

	public void revert(Memento m) {
		this.tokens = m.tokens
				.stream()
				.map(t -> new Token(t.value))
				.collect(Collectors.toList());
	}
}