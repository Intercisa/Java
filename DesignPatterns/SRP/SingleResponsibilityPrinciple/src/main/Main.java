package main;

import java.io.IOException;

import srp.Journal;
import srp.Persistence;

/*
 * 
 * SRP
 * 
 * 
 */

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		Journal j = new Journal();
		j.addEntry("I cried today");
		j.addEntry("I eate a bug");
		System.out.println(j);
		
		
		Persistence p =  new Persistence();
		String filename = "C:\\TEMPs\\Új mappa (2)\\journal.txt";
		p.saveToFile(j, filename, true);
		
		Runtime.getRuntime().exec("notepad.exe " + filename);
		
	}
}
