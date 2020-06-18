package flyweight_textformatting;

public class FormattedText {
	private String plainText;
	private boolean[] capitalize; // naive approach

	public FormattedText(String plainText) {
		this.plainText = plainText;
		this.capitalize = new boolean[plainText.length()];
	}

	public void capitalize(int start, int end) {
		for (int i = start; i <= end; i++) {
			capitalize[i] = true;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < plainText.length(); i++) {
			char c = plainText.charAt(i);
			sb.append(capitalize[i] ? Character.toUpperCase(c) : c);
		}
		return sb.toString();
	}

}
