package exercise;

import java.util.ArrayList;
import java.util.List;

public class Class {
	  public String access;
	  public String name;
	  public List<Field> fields = new ArrayList<>();

	  public Class(){}
	  
	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder(access);
	    
	    String nl = System.lineSeparator();
	    
	    sb.append(" class " + name).append(nl)
	      .append("{").append(nl);
	    
	    for (Field f : fields)
	      sb.append("  " +  f).append(nl);
	    
	    sb.append("}").append(nl);
	    
	    return sb.toString();
	  }

}
