package faceted;

public class Person {
	
	//address
	public String streetAddress, postcode, city;
	
	//employment
	public String companyName, position;
	public int annualIncome;
	
	@Override
	public String toString() {
		return String.format(
				"Person [streetAddress=%s, postcode=%s, city=%s, companyName=%s, position=%s, annualIncome=%s]",
				streetAddress, postcode, city, companyName, position, annualIncome);
	}
}
