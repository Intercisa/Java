package flyweight_user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class User2 {
	static List<String> strings = new ArrayList<String>();
	public int[] names;
	
	public User2(String fullName) {
		Function<String, Integer> getOrAdd = (String s) -> {
			int index = strings.indexOf(s);
			if(index != -1) return index;
			else {
				strings.add(s);
				return strings.size()-1;
			}
		};
		
		
		names = Arrays.stream(fullName.split(" "))
				.mapToInt(s -> getOrAdd.apply(s))
				.toArray();
		
	}
	
	
}
