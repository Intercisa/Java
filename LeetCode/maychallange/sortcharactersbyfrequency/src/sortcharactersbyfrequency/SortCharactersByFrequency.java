package sortcharactersbyfrequency;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortCharactersByFrequency {
	public String frequencySort(String s) {

		if (s == null || s.length() == 0) return s;

		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : s.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		//sorting the map by value into a LinkedHasMap with reversed ordering  
		Map<Character, Integer> sorted = map.entrySet().stream()
				.sorted(Entry.<Character, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		for (char c : sorted.keySet()) {
			int N = sorted.get(c);

			for (int i = 0; i < N; i++)
					sb.append(c);
		}

		return sb.toString();
	}
}
