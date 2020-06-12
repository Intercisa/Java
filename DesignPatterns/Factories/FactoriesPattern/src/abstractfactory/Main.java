package abstractfactory;

/*
 * 
 * Factories
 * 
 * 
 */

public class Main {

	public static void main(String[] args) throws Exception {
		HotDrinkMachine machine = new HotDrinkMachine();
		HotDrink drink = machine.makeDrink();
		drink.consume();
		
	}
}
