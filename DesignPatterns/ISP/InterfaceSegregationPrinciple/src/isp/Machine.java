package isp;

//not a good practice 
public interface Machine {
	void print(Document d);
	void fax(Document d) throws Exception; 
	void scan(Document d);

}
