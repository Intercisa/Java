package laststoneweight;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
	
public int lastStoneWeight(int[] stones) {
	
	
	
	/*
	 * 
	 Solution:

    Always have to take the largest two stones. From the example dataset, [2,7,4,1,8,1], we can take a(7) and b(8).
    if a and b is not equal, so we have to subtract and insert the difference into the data set.
    If a=b, then we will destroy both of the data.
    We will keep checking the length of the dataset, if the length become 1 then return the value or if the length is 0 then return 0;

	To find the max stone, we can use BinaryHeap(PriorityQueue in java). 
	By default PriorityQueue in java MeanHeap. So we have to reverse it to get the MaxHeap. 
	 * 
	 * 
	 * in comment.txt there is a faster solution for java
	 */
	
     
	if(stones == null) return 0;
	
	int n = stones.length;
	
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	
	for (int i = 0; i < n; i++) {
		pq.offer(stones[i]);
	}
	
	while (pq.size() > 1) {
		int first = pq.poll();
		int second = pq.poll();
		
		if(first != second) {
		int rem = Math.abs(first-second);
				pq.offer(rem);
			}
		}
		
	return pq.size() == 1 ? pq.poll() : 0;
	
	}

}


