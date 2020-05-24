package entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity 
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Animal {
	
	//@GeneratedValue(strategy = GenerationType.AUTO)//can't use for InheritanceType.TABLE_PER_CLASS
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	@Column(nullable = false) //@Inheritance(strategy = InheritanceType.SINGLE_TABLE) CAN'T HAVE NULLABLE!!!!
	private String name;
	
	
	public Animal() {}

	
	
	public void setName(String name) {this.name = name;}
	
	public abstract String makeNoise();

	@Override
	public String toString() {return name + " makeing " + makeNoise() + " noises";}
	
	
	
	
	

}
