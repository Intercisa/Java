package arraybackedproperties;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Creature implements Iterable<Integer> {

	private int[] stats = new int[3];
	private final int strengthIndex = 0;
	private final int agilityIndex = 1;
	private final int intelligenceIndex = 2;
	
	public int getStrength() {return stats[strengthIndex];}
	public void setStrength(int value) {stats[strengthIndex] = value;}
	public int getAgility() {return stats[agilityIndex];}
	public void setAgility(int value) {stats[agilityIndex] = value;}
	public int getIntelligence() {return stats[intelligenceIndex];}
	public void setIntelligence(int value) {stats[intelligenceIndex] = value;}
	
	public int sum() {
		return IntStream.of(stats).sum();
	}
	
	public int max() {
		return IntStream.of(stats).max().getAsInt();
	}
	
	public double average() {
		return IntStream.of(stats).average().getAsDouble();
	}
	
	
	@Override
	public Iterator<Integer> iterator() {
		return IntStream.of(stats).iterator();
	}

	@Override
	public void forEach(Consumer<? super Integer> action) {
		for(int x : stats)
			action.accept(x);
	}

	@Override
	public Spliterator<Integer> spliterator() {
		return IntStream.of(stats).spliterator();
	}

	
	
}
