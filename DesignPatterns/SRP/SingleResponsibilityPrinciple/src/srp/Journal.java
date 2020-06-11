package srp;

import java.util.ArrayList;
import java.util.List;

public class Journal {
	private final List<String> entries = new ArrayList<String>();
	private static int count =  0;
	
	
	public void addEntry(String text) {
		entries.add("" + (++count) + ": " + text);
	}

	
	public void removeEntry(int index) {
		entries.remove(index);
	}

	/*
	public void save(String filename) throws FileNotFoundException {
		
		try(PrintStream out = new PrintStream(filename)){
			out.println(toString());
		}
	}
	

	public void load(String filename) {}
	public void load(URL url) {}
	
	*/
	
	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}
	
	
	
}





