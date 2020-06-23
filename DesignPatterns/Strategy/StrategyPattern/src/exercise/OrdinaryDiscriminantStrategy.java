package exercise;

class OrdinaryDiscriminantStrategy implements DiscriminantStrategy {
	@Override
	public double calculateDiscriminant(double a, double b, double c) {
		return b*b-4*a*c;
	}
}
