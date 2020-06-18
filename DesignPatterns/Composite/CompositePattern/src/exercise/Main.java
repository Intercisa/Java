package exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ValueContainer value = new SingleValue(5);
		ValueContainer manyValue = new ManyValues();
		((ManyValues)manyValue).add(5);
		((ManyValues)manyValue).add(4);
		((ManyValues)manyValue).add(3);
		
		List<ValueContainer> values = new ArrayList<ValueContainer>();
		values.add(value);
		values.add(manyValue);
		
		MyList list = new MyList(values);
		
		System.out.println(list.sum());


		
	}

}
