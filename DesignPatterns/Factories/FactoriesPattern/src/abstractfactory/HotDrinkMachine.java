package abstractfactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.javatuples.Pair;
import org.reflections.Reflections;


public class HotDrinkMachine {
	
	private List<Pair<String, HotDrinkFactory>> namedFactories = new ArrayList<Pair<String, HotDrinkFactory>>();

	public HotDrinkMachine() throws Exception {
		Set<Class<? extends HotDrinkFactory>> types = new Reflections("abstractfactory")
				.getSubTypesOf(HotDrinkFactory.class);

		for (Class<? extends HotDrinkFactory> type : types) {
			namedFactories.add(new Pair<String, HotDrinkFactory>(type.getSimpleName().replace("Factory", ""),
					type.getDeclaredConstructor().newInstance()));
		}
	}
	public HotDrink makeDrink() throws Exception {
		System.out.println("Available drinks");
		for (int index = 0; index < namedFactories.size(); index++) {
			Pair<String, HotDrinkFactory> item = namedFactories.get(index);
			System.out.println(""+ index+ ": " + item.getValue0());
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String s;
			int i, amount;
			if((s = reader.readLine()) != null && (i = Integer.parseInt(s)) >= 0 && i < namedFactories.size()) {
				System.out.println("Specify amount: ");
				s = reader.readLine();
				if(s != null && (amount = Integer.parseInt(s))>0) {
					return namedFactories.get(i).getValue1().prepare(amount);
				}
			}
			System.out.println("Incorrect input, try again.");
		}
	} 
}
