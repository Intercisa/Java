package multiton;

import java.util.HashMap;

public class Printer {
	
	private static int instanceCount = 0;
	private Printer() {
		instanceCount++;
		System.out.println("A total of "+ instanceCount+ " instances created so far.");
	}
	
	private static HashMap<Subsystem, Printer> instances = new HashMap<Subsystem, Printer>();
	
	public static Printer get(Subsystem ss) {
		if(instances.containsKey(ss)) return instances.get(ss);
		
		Printer instance = new Printer();
		instances.put(ss, instance);
		return instance;
	}
}
