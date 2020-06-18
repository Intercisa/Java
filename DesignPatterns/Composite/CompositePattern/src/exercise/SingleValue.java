package exercise;

import java.util.Collections;
import java.util.Iterator;

class SingleValue implements ValueContainer {
	public int value;


// please leave this constructor as-is
	public SingleValue(int value) {
		this.value = value;

	}

	@Override
	public Iterator<Integer> iterator() {
		return Collections.singleton(value).iterator();
	}
}