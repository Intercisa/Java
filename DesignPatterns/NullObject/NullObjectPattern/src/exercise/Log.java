package exercise;

interface Log {
	// max # of elements in the log
	int getRecordLimit();

	// number of elements already in the log
	int getRecordCount();

	// expected to increment record count
	void logInfo(String message);
}