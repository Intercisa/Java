package findallanagrams;



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class FindAllAnagramsTest {

	private FindAllAnagrams findAll = new FindAllAnagrams();
	private List<Integer> res;
	@Test
	void test_1() {
		
		res = findAll.findAnagrams("cbaebabacd", "abc");
		int first = res.get(0);
		int last = res.get(res.size()-1);
		
		
		assertEquals(0, first);
		assertEquals(6, last);
	}
	
	@Test
	void test_2() {
		res = findAll.findAnagrams("abab", "ab");
		int first = res.get(0);
		int last = res.get(res.size()-1);
		
		
		assertEquals(0, first);
		assertEquals(2, last);
	}

}
