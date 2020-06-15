package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import singleton.BasicSingleton;
import singleton.ChiefExecutiveOfficer;
import singleton.EnumBasedSingleton;

/*
 * 
 * Singleton
 * 
 *  
 */

public class Main {

	public static void main(String[] args) throws Exception {

		// problems with our basic singleton:
		// 1,reflection
		// 2,serialization -> readResolve 
		
		BasicSingleton singleton = BasicSingleton.getInstance();
		singleton.setValue(111);
		
		String filename = "singleton.bin";
		saveToFile(singleton, filename);
		
		singleton.setValue(222);
		
		BasicSingleton singleton2 = readFromFile(filename);
		
		System.out.println(singleton == singleton2);
		System.out.println(singleton.getValue() +"\n" + singleton2.getValue());
		System.out.println();
		
		String filename2 = "enumsingleton.bin";
		
		EnumBasedSingleton enumBasedSingleton = EnumBasedSingleton.INSTANCE;
		enumBasedSingleton.setValue(111);
		saveToFile(enumBasedSingleton, filename2);
		
		EnumBasedSingleton enumBasedSingleton2 = readFromFile(filename2);
		System.out.println(enumBasedSingleton.getValue() +"\n"+ enumBasedSingleton2.getValue());
		/*
		 * https://stackoverflow.com/a/15522276
		 * In this case everything works well because the application process is still running 
		 * and you are getting the same Enum instance that you passed to.
		 * But imagine a situation where your app get killed. 
		 * The next time user opens the app you will get a new Enum instance 
		 * and all custom fields will have been lost and reinitialized by the constructor. 
		 * Thus, mutable fields in an enum are always effectively transient.
		 */
		
		System.out.println();
		//monostate test: 
		ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
		ceo.setName("Adam Smith");
		ceo.setAge(55);
		
		ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
		System.out.println(ceo2);
		
		
	}

	// serialization
	static <T> void saveToFile(T t, String filename) throws Exception {

		try (FileOutputStream fileOut = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(t);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// deserialization
	static <T> T readFromFile(String filename) throws Exception {
		try (FileInputStream fileIn = new FileInputStream(filename);
				ObjectInputStream in = new ObjectInputStream(fileIn)) {

			return (T) in.readObject();

		} catch (Exception e) {
			throw e;
		}
	}

}
