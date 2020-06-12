package builder;

/*
 * 
 * Builder
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		String hello = "hello";
		System.out.println("<p>" + hello + "</p>");
		
		//////////////////////////
		System.out.println();
		
		String[] words = {"hello", "world"};
		System.out.println(
				"<ul>\n" + "<li> "+ words[0] //etc.
		);
		
		//////////////////////////
		System.out.println();
		
		StringBuilder sbAppend = new StringBuilder();
		//fluent interface
		sbAppend.append("a")
		.append("b")
		.append("c");
		
		//////////////////////////
		System.out.println();
		
		StringBuilder sb = new StringBuilder();
		sb.append("<ul>\n");
		for (String word : words) {
			sb.append(String.format(" <li>%s</li>\n", word));
		}
		sb.append("</ul>");
		System.out.println(sb.toString());
		
		//////////////////////////
		System.out.println();
		
		HtmlBuilder builder = new HtmlBuilder("ul");
		builder.addChild("li", "hello");
		builder.addChild("li", "world");
		System.out.println(builder);
		
		//////////////////////////
		System.out.println();
		//now with fluent interface: 
		
		HtmlBuilder builderFluent = new HtmlBuilder("ul");
		builderFluent
			.addChild("li", "hello")
			.addChild("li", "world");
		System.out.println(builderFluent);
		
		
	}
}
