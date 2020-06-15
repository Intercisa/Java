package singleton;
//you can't inherit from this 
public enum EnumBasedSingleton {
	INSTANCE;
	
	private EnumBasedSingleton() {
		value = 42;
	}
	
	private int value;

	public int getValue() {return value;}
	public void setValue(int value) {this.value = value;}
	
	
	
}
