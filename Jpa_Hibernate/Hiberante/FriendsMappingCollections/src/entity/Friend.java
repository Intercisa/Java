package entity;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Friend {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	
	@ElementCollection
	@CollectionTable(name = "friend_nickname",joinColumns = @JoinColumn(name ="friend_id"))
	@Column(name = "nickname")
	private Collection<String> nickNames;
	
	@ElementCollection
	@CollectionTable(name="friend_ddress", joinColumns = @JoinColumn(name="friend_id"))
	@AttributeOverrides({
	@AttributeOverride(name = "zipcode",column = @Column(name = "address_zipcode")),
	@AttributeOverride(name = "street",column = @Column(name = "address_street")),
	@AttributeOverride(name = "city",column = @Column(name = "address_city")),
	})
	private Collection<Address> addresses;
	
	
	public Friend() {}
	public Friend(String name, String email) {
		this.name = name;
		this.email = email;
		nickNames = new ArrayList<String>();
		addresses = new ArrayList<Address>();
	}

	public Collection<String> getNickNames() {return nickNames;}
	public Collection<Address> getAddresses() {return addresses;}
	
	@Override
	public String toString() {
		return "Friend[id= "+id
				+" name= "+name
				+" email= "+email
				+" nicknames=" +nickNames
				+" addresses="+addresses
				+"]";
	}
	
	
	

}
