package exercise;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		Supplier<Object> ls = () -> LazySingleton.getInstance();
		
		System.out.println(SingletonTester.isSingleton(ls));

	}

}
