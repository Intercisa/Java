package adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LineToPointAdapter implements Iterable<Point> {

	private static int count = 0;
	private static Map<Integer, List<Point>> cache = new HashMap<Integer, List<Point>>();
	private int hash;
	
	public LineToPointAdapter(Line line) {
		
		hash = line.hashCode();
		if(cache.get(hash) != null) return;
		
		System.out.println(
				String.format("%d: Generating points for line [%d,%d]-[%d,%d] (with caching)", 
						++count , line.start.x, line.start.y,line.end.x, line.end.y)
				);
		
		ArrayList<Point> points = new ArrayList<Point>();
		
		int left = Math.min(line.start.x, line.end.x);
		int right = Math.max(line.start.x, line.end.x);
		int top = Math.min(line.start.y, line.end.y);
		int bottom = Math.max(line.start.y, line.end.y);
		int dx = right - left;
		int dy = line.end.y - line.start.y;
		
		if(dx == 0) {
			for (int y = top; y <= bottom; y++) {
				points.add(new Point(left, y));
			}
		}else if(dy == 0) {
			for (int x = left; x <= right; x++) {
				points.add(new Point(x, top));
			}
		}
		
		cache.put(hash, points);
	}

	@Override
	public Iterator<Point> iterator() {
		return cache.get(hash).iterator();
	}
	
	@Override
	public void forEach(Consumer<? super Point> action) {
		cache.get(hash).forEach(action);
	}
	
	@Override
	public Spliterator<Point> spliterator() {
		return cache.get(hash).spliterator();
	}
	
}
