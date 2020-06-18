package exercise;

import java.util.ArrayList;
import java.util.Collection;

class MyList extends ArrayList<ValueContainer> {

	public MyList(Collection<? extends ValueContainer> c) {
		super(c);
	}

	public int sum() {
		int result = 0;
		for (ValueContainer c : this)
			for (int num : c) {
				result += num;
			}

		return result;

	}
}