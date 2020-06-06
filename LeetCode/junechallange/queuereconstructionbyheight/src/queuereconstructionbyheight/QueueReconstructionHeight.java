package queuereconstructionbyheight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionHeight {
	
	
	   public int[][] reconstructQueue(int[][] people) {
	        List<int[]> result = new ArrayList<>();
	        
	        Arrays.sort(people, (a,b)->{
	        	return a[0] == b[0] ? a[1] - b[1] : b[0] - a[0];
	        });

	        
	        for(int[] person : people) 
	            result.add(person[1], person);
	        
	        
	        return result.toArray(new int[result.size()][]);
	    }
	
	
	public int[][] reconstructQueueLonger(int[][] people) {
		if (people == null || people.length == 0 || people[0].length == 0) return new int[0][0];
		
		Arrays.sort(people, new Comparator<int[]>() {
			//desc order sort H 
			@Override
			public int compare(int[] a, int[] b) {
				if(a[0] == b[0]) return a[1] - b[1]; //asc order sort K based on if p0[H] == p1[H] 
				
				return b[0] - a[0];
			}
		});

		//they will push each other to the right position based on K -> "number of people in front of this person who have a height greater than or equal to h"
		List<int[]> temp = new ArrayList<int[]>();
		for (int[] p : people) { 
			temp.add(p[1], p);
			
			//debug
			System.out.print("!!" +p[1] +" ");
			System.out.println("!!"+ Arrays.toString(p));

			
			for (int i = 0; i < temp.size(); i++) 
				System.out.println(Arrays.toString(temp.get(i)));
			
			System.out.println();
			//debug
		}
		
		return temp.toArray(new int[0][0]);
	}
}
