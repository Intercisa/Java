package bits;

public class HowManyDifferentBits {

	int result(int num, int num2) {
		int x = num ^ num2;
		int count = 0;
		while (x> 0) {
			x = (x) & (x - 1);
			count++;
		}
		return count;
	}
}
