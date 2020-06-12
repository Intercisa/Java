package exercise;
public class CodeBuilder
{
	private Class theClass = new Class();
	
    public CodeBuilder(String className)
    {
    	  theClass.name = className;
    }
    
    public CodeBuilder(String access, String className)
    {
    	theClass.access = access;
    	theClass.name = className;
    }
    
    public CodeBuilder addField(String access, String name, String type)
    {
    	  theClass.fields.add(new Field(access, name, type));
    	    return this;
    }
    
    @Override
    public String toString()
    {
        return theClass.toString();
    }
}