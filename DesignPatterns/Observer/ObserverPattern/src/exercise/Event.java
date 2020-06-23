package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Event<T> {
	
	private List<BiConsumer<Object, T>> consumers = new ArrayList<BiConsumer<Object,T>>();
	
	public void subscribe(BiConsumer<Object, T> consumer) {
		consumers.add(consumer);
	}
	
	public void invoke(Object sender, T arg) {
		for(BiConsumer<Object, T> consumer : consumers)
			consumer.accept(sender, arg);
	}

}
