package stockspan;

import java.util.LinkedList;

public class StockSpan {
	private LinkedList<Integer> prices, weights;

	public StockSpan() {
		prices = new LinkedList<Integer>();
		weights = new LinkedList<Integer>();
	}

	public int next(int price) {
		int span = 1;

		while (!prices.isEmpty() && price >= prices.getLast()) {
			prices.removeLast();
			span += weights.removeLast();
		}

		prices.add(price);
		weights.add(span);

		return span;
	}
}
