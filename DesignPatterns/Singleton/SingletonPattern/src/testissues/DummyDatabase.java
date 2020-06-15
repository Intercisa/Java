package testissues;

import java.util.HashMap;

public class DummyDatabase implements Database{
	
	private HashMap<String, Integer> data = new HashMap<String, Integer>();
	
	public DummyDatabase() {
		data.put("alpha", 1);
		data.put("beta", 2);
		data.put("gamma", 3);
	}
	
	
	@Override
	public int getPopulation(String name) {
		return data.get(name);
	}
	
	
}
