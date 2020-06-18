package property_proxy;

public class Creature {

	private Property<Integer> agility = new Property<Integer>(10);

	public int getAgility() {
		return agility.getValue();
	}

	public void setAgility(int value) {
		this.agility.setValue(value);
	}
	
	

}
