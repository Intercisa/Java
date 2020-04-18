package main;

import helloworld.HelloWorld;

/*
 * To complete this challenge, you must save a line of input from stdin to a variable, print Hello, World. on a single line, 
 * and finally print the value of your variable on a second line.
   You've got this!
 */


public class Main {
	private final static String inputString = "Welcome to 30 Days of Code!";
	
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.helloWorld()+
							"\n"+inputString);

	}
}
