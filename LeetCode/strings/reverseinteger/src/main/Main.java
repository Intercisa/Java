package main;

/*
 * 
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 *  For your reference, to test if there is overflow for any integer x of the form x = a * 10 + b where |b| < 10, 
 *  the right way should be comparing x / 10 (integer division) with a. If x / 10 != a, there is overflow, 
 *  otherwise no overflow can happen. The proof is as follows: first note that x itself is a signed integer, 
 *  therefore we have INT_MIN <= x <= INT_MAX, which implies INT_MIN/10 <= x/10 <= INT_MAX/10. So if we assume x / 10 == a, 
 *  we have INT_MIN/10 <= a <= INT_MAX/10. Since |b| < 10, then a * 10 + b can overflow only if a = INT_MAX/10 or a = INT_MIN/10. 
 *  For signed 32-bit integers, we have INT_MAX = 2147483647 and INT_MIN = -2147483648. For a = INT_MAX/10 = 214748364, 
 *  overflow will happen only if b = 8 or 9. 
 *  However if this is the case, then x = a * 10 + b will be negative and x / 10 cannot be the same as a, 
 *  contradicting our assumption above. Similarly if a = INT_MIN/10 = -214748364, 
 *  overflow will happen only if b = -9 but then x = a * 10 + b will be positive and again x / 10 won't be equal to a. 
 *  In summary, x / 10 != a <==> overflow.
 */

public class Main {

	public static void main(String[] args) {
	}
}
