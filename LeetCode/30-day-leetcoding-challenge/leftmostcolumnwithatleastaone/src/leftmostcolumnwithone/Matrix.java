package leftmostcolumnwithone;

import java.util.ArrayList;
import java.util.List;

public class Matrix implements BinaryMatrix {
	
	private int[][] binaryMatrix;
	private int n;
	private int m;
	
	public Matrix(int[][] binaryMatrix) {
		super();
		this.binaryMatrix = binaryMatrix;
		this.n = binaryMatrix.length;
		this.m = binaryMatrix[0].length;
	}

	@Override
	public int get(int x, int y) {
		if((x < 0 || y < 0) || (x >= n || y >= m)) return Integer.MIN_VALUE;
		return binaryMatrix[x][y];
	}

	@Override
	public List<Integer> dimensions() {
		List<Integer> resList = new ArrayList<>();
		resList.add(n);
		resList.add(m);
		return resList;
	}

}
