package replaceelementswithgreatestelementright;

public class ReplaceElementsWithgreatestElementRight {
	
	//simple
	 public int[] replaceElements(int[] arr) {
			
		 int max = -1; //last elem must be -1 
		 for (int i = arr.length-1; i >= 0; i--) {
			 int tmp = arr[i];
			 arr[i] = max;
			 max = Math.max(max, tmp);
		 } 
			
		 return arr;
	    }
	
	
	
	
	
	 public int[] replaceElementsNeat(int[] arr) {
		
		 int max = -1;
		 for (int i = arr.length-1; i >= 0; i--) 
			max = Math.max(arr[i], arr[i] = max);

		 return arr;
	    }
}



