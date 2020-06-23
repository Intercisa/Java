package dynamicstrategy;

import java.util.List;

/*
 * 
 * Strategy
 * 
 */

public class Main {

	public static void main(String[] args) {
		TextProcessor tp = new TextProcessor(OutputFormat.MARKDOWN);
		tp.appendList(List.of("liberte", "egalite", "fraternite"));
		
		System.out.println(tp);
		
		tp.clear();
		
		tp.setOutputFormat(OutputFormat.HTML);
		tp.appendList(List.of("inheritance", "encapsulation", "polymorphisum"));
		
		System.out.println(tp);
		
		
	}
}
