package srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

	public void saveToFile(Journal journal, 
			String filename,
			boolean overwrite) throws FileNotFoundException {
		
		if(overwrite || new File(filename).exists()) {
			try(PrintStream out = new PrintStream(filename)){
				out.println(journal.toString());
			}
		}
	}

	public Journal load(String filename) {return new Journal();} //dummy return
	public Journal load(URL url) {return new Journal();} //dummy return

	
	
}
