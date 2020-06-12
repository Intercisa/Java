package exercise;

public class Field {

	 public String access, type, name;

	  public Field(String access , String name, String type) {
		this.access = access;  
	    this.type = type;
	    this.name = name;
	  }

	  @Override
	  public String toString() {
	    return String.format("%s %s %s;",access, type, name);
	  }
	
}
