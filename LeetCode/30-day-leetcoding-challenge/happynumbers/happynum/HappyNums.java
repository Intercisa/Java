package happynum;

public class HappyNums {
	
	/*
	 *  We can solve this problem without using extra space and that technique can be used in some other similar problem also. 
	 *  If we treat every number as a node and replacement by square sum digit as a link, then this problem is same as finding a loop in a linklist :
	 *  So as proposed solution from above link, we will keep two number slow and fast both initialize from given number, 
	 *  slow is replaced one step at a time and fast is replaced two steps at a time. 
	 *  If they meet at 1, then the given number is Happy Number otherwise not.
	 */
	
	   public boolean isHappy(int n) {
		  
		    int slow = n;
	        int fast = n;
		   
		   do {
			   slow = getSumOfSquareDigits(slow);
			   System.out.println("slow: "+ slow);
			   fast = getSumOfSquareDigits(getSumOfSquareDigits(fast));
			   System.out.println("fast: "+ fast);
			   
		   }while(slow!=fast);
		   
		   return slow == 1; 
	    }
	   
	   private int getSumOfSquareDigits(int num) {
		   int res = 0;
		   while (num != 0) {
			   res += (num%10)*(num%10);
			   num/=10;
		}
		   return res;  
	   }
	
}

/*
 * 
 * interesting Kotlin solution
 * nested method
 *  
class Solution {
    fun isHappy(n: Int): Boolean {
         fun next(n: Int): Int {
        var n = n
        var res = 0
        while (n > 0) {
            res += (n % 10) * (n % 10)
            n /= 10
        }
        return res
    }

    var slow = next(n)
    var fast = next(next(n))
    while (fast != 1 && slow != fast) {
        slow = next(slow)
        fast = next(next(fast))
    }
    return fast == 1   
    }
}
 * 
*/
