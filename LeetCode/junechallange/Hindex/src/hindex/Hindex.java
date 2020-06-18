package hindex;

import java.util.Arrays;

public class Hindex {

	public int hIndex(int[] citations) {
		int max = 0;
		Arrays.sort(citations);
		for (int i = 0; i < citations.length; i++) {
			int cites = citations[i];
			int papers = citations.length - i;// include itself since "at least h citations"
			int index = Math.min(cites, papers);
			max = Math.max(max, index);
		}

		return max;

	}

	public int hIndexShort(int[] citations) {
		Arrays.sort(citations);

		int n = citations.length;
		for (int i = 0; i < n; i++)
			if (citations[i] >= n - i)
				return n - i;
		return 0;
	}

}
