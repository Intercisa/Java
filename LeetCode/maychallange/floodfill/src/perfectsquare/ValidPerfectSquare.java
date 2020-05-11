package perfectsquare;

public class ValidPerfectSquare {
	
	   public boolean isPerfectSquareSimple(int num) {
		 if (num < 0) return false;
		 int i = 1;
		 while (num > 0) {
			 num -= i;
			 i += 2;				//1+3+...+(2n-1) = (2n-1 + 1)n/2 = nn
		 }
		 
		 return num == 0;
	    } 
	   
	   //NewtonMethod
	   public boolean isPerfectSquare(int num) {
		   if (num < 0) return false;
		   long x = num; //use long to avoid overflow
		   
		   while (x * x > num) 
			   x = (x + num / x) >> 1; // >> 1 is same as '/2'
		
		   return x * x == num; 
		} 
}




