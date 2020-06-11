package ocp;

import java.util.List;
import java.util.stream.Stream;

//the good solution! 

public class ProductFilter implements Filter<Product> {

	@Override
	public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
		return items.stream().filter(p -> specification.isSatisfied(p));
	}
	
}
