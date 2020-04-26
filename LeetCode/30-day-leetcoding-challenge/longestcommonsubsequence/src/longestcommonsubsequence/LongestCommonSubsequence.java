package longestcommonsubsequence;

public class LongestCommonSubsequence {
	
	//both are dynamic programming approach
	
	 public int longestCommonSubsequence(String text1, String text2) {
		  char[] t1 = text1.toCharArray(), t2 = text2.toCharArray();
	        
	        int arr[] = new int[t2.length+1];
		        for(int i = 1; i <= t1.length; i++) {
		            int prev = 0; //we assume the first rows and columns are filled with zeros
		            for(int j = 1; j <= t2.length; j++) {
		                int tmp = arr[j];
		                if(t1[i-1] == t2[j-1]) arr[j] = prev + 1; //if the current row and column are matching, then add 1 to the cell
		                else arr[j] = Math.max(arr[j], arr[j-1]); //take the maximum value from the previous column and row filling the current cell
		                prev = tmp;
		            }
		        }
		        return arr[t2.length];
	    }
	
	
	//a really good explanation: https://www.programiz.com/dsa/longest-common-subsequence
	//easier to understand, but basically the same  
	public int longestCommonSubsequenceEayeToUnderstand(String text1, String text2) {
        
		int m = text1.length();
		int n = text2.length();
		int arr[][] = new int[m+1][n+1];//a table of dimension n+1*m+1 
		
		
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
		
				if(i ==0 || j ==0) //first row and column filled with zeros
					arr[i][j] = 0;
				else if(text1.charAt(i-1)==text2.charAt(j-1)) //If the character correspoding to the current row and current column are matching
					arr[i][j] = arr[i-1][j-1]+1; 			//, then fill the current cell by adding one to the diagonal element. 
				else
					arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);//take the maximum value from the previous column and previous row element for filling the current cell.
			}
		}
		
		return arr[m][n];
    }
	
}




