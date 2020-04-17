package groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	  public List<List<String>> groupAnagrams(String[] strs) {
		  
		  List<List<String>> res = new ArrayList<List<String>>();
		  HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		  
		  for (String str : strs) {
			char[] arr = new char[26]; //letters of the alphabet 
			for (int i = 0; i < str.length(); i++) {
				arr[str.charAt(i) - 'a']++; //if match increment
			}
			
			String temp = new String(arr);
		
			//for debug
			System.out.println(Arrays.toString(arr));
			
			
			if(map.containsKey(temp)) {
				map.get(temp).add(str);
			}else{
				ArrayList<String> list = new ArrayList<String>();
				list.add(str);
				map.put(temp, list);
			}
		}
		  
		  res.addAll(map.values());
		  
		  return res;

}
}



