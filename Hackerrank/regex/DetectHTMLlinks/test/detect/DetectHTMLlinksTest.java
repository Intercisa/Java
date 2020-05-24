package detect;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class DetectHTMLlinksTest {

	@Test
	void test_1() {
		String html= "div class=\"portal\" role=\"navigation\" id='p-navigation'>\n" + 
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
				"</div>";
		List<String> links = List.of("/wiki/Main_Page,Main page",
				"/wiki/Portal:Contents,Contents",
				"/wiki/Portal:Featured_content,Featured content",
				"/wiki/Portal:Current_events,Current events",
				"/wiki/Special:Random,Random article",
				"//donate.wikimedia.org/wiki/Special:FundraiserRedirector?utm_source=donate&utm_medium=sidebar&utm_campaign=C13_en.wikipedia.org&uselang=en,Donate to Wikipedia");
		
		assertEquals(links, new DetectHTMLlinks().detectHtml(html));
		
		
		
		
	}
}
