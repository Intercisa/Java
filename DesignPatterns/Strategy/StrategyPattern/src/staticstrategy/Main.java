package staticstrategy;

import java.util.List;

/*
 * 
 * Strategy
 * 
 */

public class Main {

	public static void main(String[] args) {
	
		TextProcessor<MarkdownListStrategy> tpMd = new TextProcessor<MarkdownListStrategy>(MarkdownListStrategy::new);
		tpMd.appendList(List.of("alpha", "beta", "gamma"));
		System.out.println(tpMd);
		
		
		TextProcessor<HtmlListStrategy> tpHtml = new TextProcessor<HtmlListStrategy>(HtmlListStrategy::new);
		tpHtml.appendList(List.of("alpha", "beta", "gamma"));
		System.out.println(tpHtml);
		
	}
}
