package uglynum;

public class UglyNumber {
	public boolean isUgly(int num) {
		
		//an ugly number is a multiple of either 2, 3 or 5. Only exception is that 1 is also ugly.
		if(num < 1) return false;
		
		int tmp;
		do {
			tmp = num;
			if(num%2 == 0) num /= 2;
			if(num%3 == 0) num /= 3;
			if(num%5 == 0) num /= 5;
		} while (tmp != num);
		
		return num == 1;
	}
}
