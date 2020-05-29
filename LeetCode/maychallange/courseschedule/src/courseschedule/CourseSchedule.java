package courseschedule;

import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		if (prerequisites == null)return false;
		int N = prerequisites.length;
		if (numCourses == 0 || N == 0)return true;
		int numNoPreRec;
		
		// counter for number of prerequisites
		int[] preRecCounter = new int[numCourses];
		for (int i = 0; i < N; i++)
			preRecCounter[prerequisites[i][0]]++;

		// store courses that have no prerequisites
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < numCourses; i++)
			if (preRecCounter[i] == 0)
				queue.add(i);
		
		// number of courses that have no prerequisites
		numNoPreRec = queue.size();
		
		while(!queue.isEmpty()){
	        int top = queue.remove();
	        for(int i=0; i<N; i++){
	            // if a course's prerequisite can be satisfied by a course in queue
	            if(prerequisites[i][1]==top){
	            	preRecCounter[prerequisites[i][0]]--;
	                if(preRecCounter[prerequisites[i][0]]==0){
	                	numNoPreRec++;
	                    queue.add(prerequisites[i][0]);
	                }
	            }
	        }
	    }
	 
		return numNoPreRec == numCourses;
	}
}
