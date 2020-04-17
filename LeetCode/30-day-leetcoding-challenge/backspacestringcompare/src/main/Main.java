package main;

import backspacestringcompare.CompareString;

/*
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
   Note that after backspacing an empty text, the text will continue empty.
 */

public class Main {

	public static void main(String[] args) {
		CompareString compareString = new CompareString();
		
		compareString.backspaceCompare("ab#c", "ad#c");

	}

}
