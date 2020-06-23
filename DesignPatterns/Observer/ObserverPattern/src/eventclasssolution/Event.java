package eventclasssolution;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<TArgs> {
	
	private int count = 0;
	public Map<Integer, Consumer<TArgs>> handlers = new HashMap<>();
	
	public Subscription addHandler(Consumer<TArgs> handler) {
		int i = count;
		handlers.put(count++, handler);
		return new Subscription(this, i);
	}
	
	public void fire(TArgs args) {
		for(Consumer<TArgs> handler : handlers.values())
			handler.accept(args);
	}
	
}
