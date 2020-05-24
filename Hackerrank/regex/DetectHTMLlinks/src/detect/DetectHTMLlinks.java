package detect;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLlinks {
	public List<String> detectHtml(String html) {
	
		List<String> links = new ArrayList<String>();
		Pattern p = Pattern.compile("<a\\shref=\"([^\"]++)\"([^<>]*)>(<\\w>)*([^<>]*)<");
        Matcher m = p.matcher(html);
        while(m.find())
            links.add(m.group(1).trim()+","+m.group(4).trim());
        
        return links;
	  }
}


/*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        for (int i = 0; i < n; i++) { 
        str = sc.nextLine();      
        Pattern p = Pattern.compile("<a\\shref=\"([^\"]++)\"([^<>]*)>(<\\w>)*([^<>]*)<");
        Matcher m = p.matcher(str);
        while(m.find()){
        System.out.println(m.group(1).trim()+","+m.group(4).trim());
        }
        }
*/


