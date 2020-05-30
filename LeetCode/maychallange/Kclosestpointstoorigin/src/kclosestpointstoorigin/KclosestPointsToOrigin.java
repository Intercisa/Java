package kclosestpointstoorigin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class KclosestPointsToOrigin {

	public int[][] kClosest(int[][] points, int K) {
		HashMap<Double, List<Integer>> map = new HashMap<Double, List<Integer>>();
		PriorityQueue<Double> pq = new PriorityQueue<Double>();

		for (int i = 0; i < points.length; i++) {
			int[] p = points[i];
			double distance = Math.sqrt((p[1] - 0) * (p[1] - 0) + (p[0] - 0) * (p[0] - 0)); // distance from origin
																							// (0,0)
			map.compute(distance, (k, v) -> v == null ? new ArrayList<>() : v).add(i);
			pq.add(distance);

		}

		int[][] result = new int[K][2];
		int i = 0;
		while (!pq.isEmpty() && i < K) {
			List<Integer> pos = map.get(pq.poll());
			for (int j : pos) {
				result[i++] = points[j];
			}
		}
		return result;
	}

	//bit better solution
	public int[][] kClosestFaster(int[][] points, int K) {
		int N = points.length;
		int[] distance = new int[N];

		// Fill in all the squared distances for each input point
		for (int i = 0; i < N; ++i)
			distance[i] = calculatedistance(points[i]);

		// Sort the calculated square distances
		Arrays.sort(distance);

		// get only K or less than K distance
		int distK = distance[K - 1];

		int[][] ans = new int[K][2];
		int t = 0;

		// Iterate over input list again and get only K values and store it in result.
		for (int i = 0; i < N; ++i)
			if (calculatedistance(points[i]) <= distK)
				ans[t++] = points[i];
		return ans;
	}

	public int calculatedistance(int[] point) {
		return point[0] * point[0] + point[1] * point[1];
	}

}
