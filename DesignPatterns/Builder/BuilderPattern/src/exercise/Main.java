package exercise;

/*
 * 
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args)  {
		CodeBuilder cb = new CodeBuilder("protected", "Person")
				.addField("public", "name", "String")
				.addField("public", "age", "int");
		
		System.out.println(cb);

		
	}
}
