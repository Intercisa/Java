package testissues;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class SingletonRecordFinderTest {

	//this is not a unit test, it is more like an integration test coz the dependency of the live database (capitals.txt)
	@Test
	void singletonTotalPopulationTest() {
		SingletonRecordFinder rf =  new SingletonRecordFinder();
		List<String> names =  List.of("Seoul", "Mexico City");
		int tp = rf.getTotalPopulation(names);
		assertEquals(175000000 + 174000000, tp);
		
	}
	
	//proper unit test 
	@Test
	void dependentPopulationUNITTest() {
		DummyDatabase dummy = new DummyDatabase();
		ConfigurableRecordFinder crf = new ConfigurableRecordFinder(dummy);
		assertEquals(4, crf.getTotalPopulation(List.of("alpha", "gamma")));
		
	}

}
