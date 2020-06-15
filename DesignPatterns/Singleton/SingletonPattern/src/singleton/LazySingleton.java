package singleton;

public class LazySingleton {
	private static LazySingleton instance;
	
	private LazySingleton() {
		System.out.println("initializing a lazy singleton");
	}
	
	public static synchronized LazySingleton getInstance() { //synchronized coz' of multiple threads >> thread safety 
		if(instance == null) instance = new LazySingleton();
		return instance;
	}
	
	//double-checked locking -> outdated, don't use it 
	/*
	public static LazySingleton getInstance() {
		if(instance == null) {
			
			synchronized(LazySingleton.class) {
				if(instance == null) instance = new LazySingleton();
			}
		}
		return instance;	
	}
	*/
	
}
