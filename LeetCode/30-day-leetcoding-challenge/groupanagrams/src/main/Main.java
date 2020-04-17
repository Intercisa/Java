package main;

import groupanagrams.GroupAnagrams;

public class Main {

	public static void main(String[] args) {
		
		String[] anagArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		GroupAnagrams anagrams = new GroupAnagrams();
		anagrams.groupAnagrams(anagArr);
		

	}

}
