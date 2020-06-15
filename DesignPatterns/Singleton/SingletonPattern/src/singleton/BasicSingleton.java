package singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

	private int value = 0;
	


	private static final BasicSingleton INSTANCE = new BasicSingleton();
	
	private BasicSingleton() {
		
	}
	
	public static BasicSingleton getInstance() {
		return INSTANCE;
	}
	
	protected Object readResolve() {
		return INSTANCE;
	}
	
	public int getValue() {return value;}
	public void setValue(int value) {this.value = value;}
}
