package ransomnote;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class RansomNoteTest {

	RansomNote  ransom= new RansomNote();
	
	@Test
	void test_1() {
		assertEquals(false, ransom.canConstruct("a", "b"));
	}
	
	@Test
	void test_2() {
		assertEquals(false, ransom.canConstruct("aa", "ab"));
	}
	
	@Test
	void test_3() {
		assertEquals(true, ransom.canConstruct("aa", "aab"));
	}
	
	@Test
	void test_4() {
		assertEquals(false, ransom.canConstruct("bhjdigif", "dbjdhdehgbcdjjgadeegdbegehjffie"));
	}
	


}
