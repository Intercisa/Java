package protection_proxy;

/*
 * 
 * Proxy
 * 
 */

public class Main {

	public static void main(String[] args) {		
		Car car = new CarProxy(new Driver(15));
		car.drive();
		
		var car2 = new CarProxy(new Driver(15));
		car2.drive();
		
	}
}
