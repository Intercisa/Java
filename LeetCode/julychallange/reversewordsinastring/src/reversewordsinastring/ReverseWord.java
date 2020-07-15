package reversewordsinastring;

public class ReverseWord {
	
	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		String[] wordArr = s.split(" ");
		
		for (int i = wordArr.length - 1; i >= 0 ; i--) 
			if(!wordArr[i].equals("")) sb.append(wordArr[i]).append(" ");

		
		return sb.toString().trim();
	}

	public String reverseWordsII(String s) {
		String res = "";
		
		for (String word : s.split(" ")) 
			if(!word.equals("")) res = word+" "+res;
		
		return res.trim();
	}
}
