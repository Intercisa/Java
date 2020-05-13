package findallnumbersdisappearedinanarray;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;



class FindallNumbersDisappearedTest {
	
	private FindallNumbersDisappeared findAllDisappeared = new FindallNumbersDisappeared();
	
	
	@Test
	void test_1() {	
		ArrayList<Integer> list = findAllDisappeared.findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
		int num1 = list.get(0);
		int num2 = list.get(list.size()-1);

		assertEquals(5, num1);
		assertEquals(6, num2);
	}

}
