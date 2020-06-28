package reconstructitinerary;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class ReconstructItineraryTest {

	@Test
	void test_1() {
		List<List<String>> itineraryList = List.of(List.of("MUC", "LHR"),List.of("JFK", "MUC"),List.of("SFO", "SJC"),List.of("LHR", "SFO"));
		assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"), new ReconstructItinerary().findItinerary(itineraryList));
	}
	
	@Test
	void test_2() {
		List<List<String>> itineraryList = List.of(List.of("JFK","SFO"),List.of("JFK","ATL"),List.of("SFO","ATL"),List.of("ATL","JFK"),List.of("ATL","SFO"));
		assertEquals(List.of("JFK","ATL","JFK","SFO","ATL","SFO"), new ReconstructItinerary().findItinerary(itineraryList));
	}
	
}
