package findthetownjudge;

import java.util.HashMap;

public class FindTheTownJudge {
	
	
	 public int findJudge(int N, int[][] trust) {
	        
		 int[] countArr = new int[N];
		 int[] trustArr = new int[N];
		 
		 for (int i = 0; i < trust.length; i++) {
			
			 int counter = trust[i][0];
			 int truster = trust[i][1];
			 
			 countArr[counter - 1]++;
			 trustArr[truster - 1]++;
		 } 
		 for (int i = 0; i < N; i++) 
				
			if(countArr[i] == 0 && trustArr[i] == N - 1)
				return i+1;
			 
		 
		return -1;		 
	    }
	

	
	 public int findJudgeSlow(int N, int[][] trust) {
	        
		 int possibelJudge = 0, count = 0;
		 HashMap<Integer, Integer> judgeMap = new HashMap<>();
		 
		for(int i = 1; i<=N; i++) 
			 judgeMap.put(i, judgeMap.getOrDefault(i,0));
		 
		for (int i = 0; i < trust.length; i++) 
			judgeMap.put(trust[i][0], judgeMap.getOrDefault(trust[i][0],0)+1);
		
		
		for (int i : judgeMap.keySet()) 
			if(judgeMap.get(i) == 0) 
				possibelJudge = i;
		
		for (int i = 0; i < trust.length; i++) 
			if (trust[i][1] == possibelJudge) 
				count++;
			
		
		 return count==N-1?possibelJudge:-1;
	    }
}




