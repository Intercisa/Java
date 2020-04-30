package main;

import groupanagrams.GroupAnagrams;

//Given an array of strings, group anagrams together.

public class Main {

	public static void main(String[] args) {
		
		String[] anagArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		GroupAnagrams anagrams = new GroupAnagrams();
		anagrams.groupAnagrams(anagArr);
		

	}

}
