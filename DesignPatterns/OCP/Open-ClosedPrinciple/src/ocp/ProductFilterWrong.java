package ocp;

import java.util.List;
import java.util.stream.Stream;
//don't do this it is a bad practice!

public class ProductFilterWrong {
	
	public Stream<Product> filterByColor(List<Product> products, Color color){
		
		return products
				.stream()
				.filter(p -> p.color == color);
	}
	
	public Stream<Product> filterBySize(List<Product> products, Size size){
		
		return products
				.stream()
				.filter(p -> p.size == size);
	}
	
	public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color){
		
		return products
				.stream()
				.filter(p -> p.size == size && p.color == color);
		
	}
	
}
