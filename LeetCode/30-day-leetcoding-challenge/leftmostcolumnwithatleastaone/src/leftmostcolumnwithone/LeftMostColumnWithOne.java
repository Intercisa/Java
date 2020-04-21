package leftmostcolumnwithone;

public class LeftMostColumnWithOne {
	
	   public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
		   
		   if(binaryMatrix.dimensions() == null ||
				   binaryMatrix.dimensions().get(0) == null || 
				   binaryMatrix.dimensions().get(1) == null || 
				   binaryMatrix.dimensions().get(0) == 0) 
			   		return -1;

		   int row = binaryMatrix.dimensions().get(0); //max length of rows
		   int col = binaryMatrix.dimensions().get(1); //max length of columns 
		   
		   
		   int m = 0;  //starting position for the rows
		   int n = col-1; //starting position for the column -> we are in the top right corner of the matrix
		   
		   while (m < row && n >= 0) {
			
			if(binaryMatrix.get(m, n) == 1)  
				n--;						//if found 1 step minus one in column 
			else 
				m++;						//else step 1 row down 
			
			}
		   return n != col -1 ? n + 1 : -1; //if we are still in the rightmost column there is no 1 in the matrix, otherwise the leftmost 1 is on step forward (really we step back and undo the last n--) in the current column
		}
	   


}


