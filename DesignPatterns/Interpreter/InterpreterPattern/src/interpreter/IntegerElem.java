package interpreter;

public class IntegerElem implements Element {

	private int value;
	
	public IntegerElem(int value) {
		this.value = value;
	}

	@Override
	public int eval() {
		
		return value;
	}

}
