package exercise;

class NullLog implements Log {

	private int recordCount = Integer.MIN_VALUE;

	@Override
	public int getRecordLimit() {
		return Integer.MAX_VALUE;
	}

	@Override
	public int getRecordCount() {
		return recordCount;
	}

	@Override
	public void logInfo(String message) {
		++recordCount;
	}

}