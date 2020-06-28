package reconstructitinerary;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class ReconstructItinerary {
	HashMap<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
	LinkedList<String> result = new LinkedList<String>();
	
	public List<String> findItinerary(List<List<String>> tickets) {
		for (List<String> ticket : tickets) 
			map.computeIfAbsent(ticket.get(0), k -> new PriorityQueue<String>()).add(ticket.get(1));
		
		System.out.println(map);
		dfs("JFK");
		return result;
		
	}

	private void dfs(String s) {
		PriorityQueue<String> q = map.get(s);
		while (q!= null && !q.isEmpty()) 
			dfs(q.poll());
		
		result.addFirst(s);
	}
}
