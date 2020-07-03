package prisoncellsafterNdays;

import java.util.Arrays;
import java.util.HashMap;

public class PrisonCells {

	public int[] prisonAfterNDays(int[] cells, int N) {
		HashMap<String, Integer> cell = new HashMap<>();
		String cellsStr = Arrays.toString(cells);
		for (int i = 0; i < N; i++) {
			cell.put(cellsStr, i);
			cells = convertCell(cells);
			cellsStr = Arrays.toString(cells);
			if (cell.containsKey(cellsStr)) {
				int daysbefore = i + 1 - cell.get(cellsStr);
				int daysleft = N - (i + 1);
				return finalDays(cells, daysleft % daysbefore);
			}
		}
		return cells;
	}

	public int[] finalDays(int[] cells, int N) {
		for (int i = 0; i < N; i++)
			cells = convertCell(cells);
		return cells;
	}


	public int[] prisonAfterNDaysMagicNum(int[] cells, int N) {

		N = N % 14; // 14 is a magic number -> only works for 8 cell
		if (N == 0)
			N = 14;
		int[] res = new int[cells.length];

		for (int i = 0; i < N; i++) {
			res = convertCell(cells);
			cells = res;
		}
		return res;
	}

	
	//helper for both solution
	
	private int[] convertCell(int[] cells) {
		int[] tempArr = new int[cells.length];

		for (int i = 1; i < cells.length - 1; i++)
			tempArr[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;

		return tempArr;
	}

}
