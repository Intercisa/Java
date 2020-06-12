package recursivegeneric;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
	
	
	public EmployeeBuilder worksAt(String position) {
		person.position = position;
		return self();
	}
	
	@Override
	protected EmployeeBuilder self() {
		return this;
	}
	
}
