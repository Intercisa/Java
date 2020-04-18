package datatypes;

import java.util.Scanner;

public class DataTypes {
	
	public void dataTypes() {
	Scanner scan = new Scanner(System.in);
	int i = 4;
    	double d = 4.0;
    	String s = "HackerRank ";
    
	
	int numInt = scan.nextInt();
	double numDouble = scan.nextDouble();
	scan.nextLine();
	String str = scan.nextLine();
	
	System.out.println(numDouble+d);
	
	
	System.out.println(
			numInt+i+"\n"+
			numDouble+d+"\n"+
			s+str);
	}
}


