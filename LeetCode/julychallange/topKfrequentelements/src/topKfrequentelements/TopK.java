package topKfrequentelements;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class TopK {
	public int[] topKFrequent(int[] nums, int k) {
		if (nums == null) return new int[] {};

		Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

		PriorityQueue<Map.Entry<Integer, Long>> queue =
				new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));

		for (Map.Entry<Integer, Long> entry : map.entrySet()) {
			queue.offer(entry);
			if (queue.size() > k) queue.poll();
		}

		
	return queue.stream().
			 map(n -> n.getKey())
			 .mapToInt(Integer::intValue)
			 .toArray();
	}
}
