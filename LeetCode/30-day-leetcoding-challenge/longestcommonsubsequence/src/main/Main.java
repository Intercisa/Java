package main;

import longestcommonsubsequence.LongestCommonSubsequence;

/*
 *Given two strings text1 and text2, return the length of their longest common subsequence.
	A subsequence of a string is a new string generated from the original string with some characters(can be none) 
	deleted without changing the relative order of the remaining characters. 
	(eg, "ace" is a subsequence of "abcde" while "aec" is not).
 	A common subsequence of two strings is a subsequence that is common to both strings.
	If there is no common subsequence, return 0.
 */

public class Main {

	public static void main(String[] args) {
		
		LongestCommonSubsequence longestSubsequence = new LongestCommonSubsequence();
		System.out.println(longestSubsequence.longestCommonSubsequence("abcde", "ace"));
		

	}
}
