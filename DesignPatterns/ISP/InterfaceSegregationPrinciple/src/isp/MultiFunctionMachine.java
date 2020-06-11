package isp;

public class MultiFunctionMachine implements MultiFunctionDevice{

	//decorator pattern 
	private Printer printer;
	private Scanner scanner;
	
	public MultiFunctionMachine(Printer printer, Scanner scanner) {
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void print(Document d) {
		printer.print(d);
		
	}

	@Override
	public void scan(Document d) {
		scanner.scan(d);
		
	}

}
