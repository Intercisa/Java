package main;

import java.io.IOException;
import java.util.List;

import ocp.AndSpecification;
import ocp.Color;
import ocp.ColorSpecification;
import ocp.Product;
import ocp.ProductFilter;
import ocp.ProductFilterWrong;
import ocp.Size;
import ocp.SizeSpecification;

/*
 * 
 * OCP -> open for extension but close for modification! - Specification Pattern!
 * 
 * 
 */

public class Main {

	public static void main(String[] args) throws IOException {
		
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);	
		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);	
		Product house = new Product("House", Color.BLUE, Size.LARGE);	

		List<Product> products = List.of(apple, tree, house);

		//////////////////////////////////////
		ProductFilterWrong pfWrong = new ProductFilterWrong();
		
		System.out.println("Green products (old - wrong):");
		pfWrong.filterByColor(products, Color.GREEN)
		.forEach(System.out::println);
		
		System.out.println();
		/////////////////////////////////////
		
		ProductFilter pf = new ProductFilter();
		System.out.println("Green products (new - good):");
		
		pf.filter(products, new ColorSpecification(Color.GREEN))
		.forEach(System.out::println);
		
		System.out.println();
		
		//with combinator
		System.out.println("Large blue items: ");
		pf.filter(products, 
				new AndSpecification<>(
						new SizeSpecification(Size.LARGE), 
						new ColorSpecification(Color.BLUE)))
		.forEach(System.out::println);

	}
}
