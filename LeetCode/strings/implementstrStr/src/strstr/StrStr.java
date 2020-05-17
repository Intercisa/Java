package strstr;

public class StrStr {
	public int strStr(String haystack, String needle) {

	    // empty needle appears everywhere, first appears at 0 index
        if (needle.length() == 0) return 0;
        if (haystack.length() == 0)return -1;
        
        for (int i = 0; i < haystack.length(); i++) {
            
            if (i + needle.length() > haystack.length()) return -1; // no enough places for needle after i
            
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j))
                    break;
                if (j == needle.length()-1)
                    return i;
            }
        }
        
        return -1;
}
	
	
	public int strStr2(String haystack, String needle) {
		if(needle.length() == 0) return 0;
		if(haystack.length() < needle.length()) return -1;
		
		if(haystack.length() == needle.length()) return haystack.equals(needle) ? 0 : -1;
		
		
		for(int i=0; i < haystack.length(); i++) {
			int hIndex = i;
			int nIndex = 0;
			while(hIndex < haystack.length() && nIndex < needle.length() && haystack.charAt(hIndex) == needle.charAt(nIndex)) {
				hIndex++;
				nIndex++;
			}
			
			if(nIndex == needle.length()) return i;
		}
		return -1;
	}
}