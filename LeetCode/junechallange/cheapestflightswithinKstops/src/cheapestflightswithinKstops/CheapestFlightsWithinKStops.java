package cheapestflightswithinKstops;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CheapestFlightsWithinKStops {
	
	//bellman-ford algorithm 
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[] cost= new int[n];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[src] = 0;
        for (int i=0; i<=K; i++){
            int[] tmp = Arrays.copyOf(cost, n);
            for (int[] a: flights){
                
            	int cur = a[0], next=a[1], price=a[2];
               
                if (cost[cur]== Integer.MAX_VALUE) continue;
                
                tmp[next] = Math.min(tmp[next], cost[cur]+price);
            }
            cost = tmp;
        }
        return cost[dst] == Integer.MAX_VALUE? -1: cost[dst];
    }


	public int findCheapestPriceDijkstra(int n, int[][] flights, int src, int dst, int K) {
		Map<Integer, Map<Integer, Integer>> prices = new HashMap<>();
		
		for (int[] flight : flights) {
			if(!prices.containsKey(flight[0])) prices.put(flight[0], new HashMap<Integer, Integer>());
			prices.get(flight[0]).put(flight[1], flight[2]);
		}
		
		PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a,b) -> (Integer.compare(a[0], b[0])));
		priorityQueue.add(new int[] {0, src, K+1});
		
		while (!priorityQueue.isEmpty()) {
			int[] top = priorityQueue.remove();
			int price = top[0];
			int city = top[1];
			int stops = top[2];
			if(city == dst) return price;
			if(stops > 0) {
				Map<Integer, Integer> adj = prices.getOrDefault(city, new HashMap<>());
				for (int a : adj.keySet()) {
					priorityQueue.add(new int[] {price + adj.get(a),a,stops -1});
				}
			}
			
		}
		
		return -1;
		
	}

}
