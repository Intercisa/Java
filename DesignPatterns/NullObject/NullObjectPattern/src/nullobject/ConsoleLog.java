package nullobject;

public class ConsoleLog implements Log {

	@Override
	public void info(String msg) {
		System.out.println(msg);
		
	}

	@Override
	public void warning(String msg) {
		System.out.println("WARNING "+ msg);
	}

}
