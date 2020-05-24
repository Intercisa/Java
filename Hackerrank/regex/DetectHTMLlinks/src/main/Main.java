package main;

import java.util.List;

import detect.DetectHTMLlinks;

/*
 * 
 * Charlie has been given an assignment by his Professor to strip the links and the text name from the html pages.
 * A html link is of the form,
 * <a href="http://www.hackerrank.com">HackerRank</a>  
 * Where a is the tag and href is an attribute which holds the link charlie is interested in. The text name is HackerRank.
 * Charlie notices that the text name can sometimes be hidden within multiple tags
 * <a href="http://www.hackerrank.com"><h1><b>HackerRank</b></h1></a>
 * Here, the text name is hidden inside the tags h1 and b.
 * Help Charlie in listing all the links and the text name of the links.
 * Input Format
 * The first line contains the number of lines in the fragment (N). This is followed by N lines from a valid HTML document or fragment.
 * Constraints
 * N < 100
 * Number of characters in the test fragments <= 10000 characters.
 * Characters will be restricted to ASCII. Fragments for the tests will be picked up from Wikipedia. Also, some tests might not have text or names on the links.
 * Output Format
 * If there are M links in the document, display each of them in a new line. The link and the text name must be separated by a "," (comma) with no spaces between them.
 * Strip out any extra spaces at the start and end position of both the link and the text name before printing.
 * link-1,text name-1
 * link-2,text name-2
 * link-3,text name-3
 * ....
 * link-n,text name-M
 */

public class Main {

	public static void main(String[] args) {
		
		DetectHTMLlinks detectHTMLlinks = new DetectHTMLlinks();
		List<String> links =  detectHTMLlinks.detectHtml("div class=\"portal\" role=\"navigation\" id='p-navigation'>\n" + 
				"<h3>Navigation</h3>\n" + 
				"<div class=\"body\">\n" + 
				"<ul>\n" + 
				" <li id=\"n-mainpage-description\"><a href=\"/wiki/Main_Page\" title=\"Visit the main page [z]\" accesskey=\"z\">Main page</a></li>\n" + 
				" <li id=\"n-contents\"><a href=\"/wiki/Portal:Contents\" title=\"Guides to browsing Wikipedia\">Contents</a></li>\n" + 
				" <li id=\"n-featuredcontent\"><a href=\"/wiki/Portal:Featured_content\" title=\"Featured content  the best of Wikipedia\">Featured content</a></li>\n" + 
				"<li id=\"n-currentevents\"><a href=\"/wiki/Portal:Current_events\" title=\"Find background information on current events\">Current events</a></li>\n" + 
				"<li id=\"n-randompage\"><a href=\"/wiki/Special:Random\" title=\"Load a random article [x]\" accesskey=\"x\">Random article</a></li>\n" + 
				"<li id=\"n-sitesupport\"><a href=\"//donate.wikimedia.org/wiki/Special:FundraiserRedirector?utm_source=donate&utm_medium=sidebar&utm_campaign=C13_en.wikipedia.org&uselang=en\" title=\"Support us\">Donate to Wikipedia</a></li>\n" + 
				"</ul>\n" + 
				"</div>\n" + 
				"</div>");
		
		for (String s : links) {
			System.out.println(s);
		}
		
		
		
		
		
	}
}
