package exercise;

class ResponsiblePerson  extends Person{
	
	public ResponsiblePerson(int age) {
		super(age);
	}

	@Override
	public String drink() {
		return super.getAge() < 18 ? "too young" : super.drink(); 
	}

	@Override
	public String drive() {
		return super.getAge() < 16 ? "too young" : super.drive(); 
	}

	@Override
	public String drinkAndDrive() {
		return "dead";
	}
}