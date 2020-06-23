package exercise;

class CombinationLock {
	private int[] combination;
	private int digitsEntered = 0;
	private boolean failed = false;
	public String status;

	public CombinationLock(int[] combination) {
		this.combination = combination;
		reset();
	}

	private void reset() {
		status = "LOCKED";
		digitsEntered = 0;
		failed = false;

	}

	public void enterDigit(int digit) {
		if (status.equals("LOCKED")) status = "";
		status += digit;
		
		if (combination[digitsEntered] != digit) failed = true;
		
		digitsEntered++;

		if (digitsEntered == combination.length) status = failed ? "ERROR" : "OPEN";
	}
}