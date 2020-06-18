package exercise;

import java.util.ArrayList;
import java.util.List;

class Sentence {
	
	private String plainText;
	private List<WordToken> formatting = new ArrayList<>();
	private String[] words;
	
	public Sentence(String plainText) {
		this.plainText = plainText;
	}

	public WordToken getWord(int index) {
		WordToken token = new WordToken(index);
		formatting.add(token);
		return token;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		words = plainText.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			for(WordToken token : formatting) {
				if(token.isTargetToken(i) && token.capitalize)
					words[i] = words[i].toUpperCase();
				sb.append(words[i]);
				if(i != words.length-1) sb.append(" ");
			}
		}
		return sb.toString();
	}
	

	class WordToken {
		public int index;
		public boolean capitalize;

		public WordToken(int index) {
			this.index = index;
		}
		
		public boolean isTargetToken(int index) {
			return this.index == index;
		}
	}
}