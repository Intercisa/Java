package testissues;

import java.util.List;

public class SingletonRecordFinder {
	public int getTotalPopulation(List<String> names) {
		int result = 0;
		for (String name : names) 
			result += SingletonDatabase.getInstance().getPopulation(name);
		
		return result;
	}
}
