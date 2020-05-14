package reverse;

public class ReverseInteger {
	public int reverse(int x) {
		int prevRev = 0, reverse = 0;
		while (x != 0) {
			reverse = reverse * 10 + x % 10;
			if ((reverse - x % 10) / 10 != prevRev)
				return 0;

			prevRev = reverse;
			x = x / 10;
		}
		return reverse;
	}
}