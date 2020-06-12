package abstractfactory;

public class CoffeeFactory implements HotDrinkFactory {

	@Override
	public HotDrink prepare(int amount) {
		System.out.println(
			"Grind some beans, boil water, pour" + amount + " ml, add milk, enjoy!"
		);
		return new Coffee();
	}

}
