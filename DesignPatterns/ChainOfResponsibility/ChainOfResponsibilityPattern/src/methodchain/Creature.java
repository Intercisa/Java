package methodchain;

public class Creature {
	public String name;
	public int attack, defense;

	
	public Creature(String name, int attack, int defense) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
	}


	@Override
	public String toString() {
		return String.format("Creature [name=%s, attack=%s, defense=%s]", name, attack, defense);
	} 
	
}
