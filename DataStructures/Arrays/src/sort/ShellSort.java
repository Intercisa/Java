package sort;

public class ShellSort {
	/*
	 * 
	 * arr : 20 35 -15 7 55 1 -22
	 * 
	 * variation of insertion sort
	 * insertion sort chooses which element to insert using a gap of 1 
	 * 
	 * shell sort starts out using a larger gap value
	 * as the algorithm runs, the gap is reduced 
	 * goal is to reduce the amount of shifting required
	 * 
	 * as the algorithm progresses, the gap is reduced 
	 * the last gap value is always 1
	 * a gap value of 1 is equivalent to insertion sort 
	 * so the algorithm does some preliminary work (using gap values greater than 1)
	 * and then becomes insertion sort 
	 * 
	 * by the time we get to insertion sort, the array has been partially sorted, so there's less shifting required 
	 * 
	 * gap is can calculated: using: (3k -1)/2
	 * we set k based on the length of the array
	 * we want the gap to be as close as possible to the length of the array we want to sort, without being greater than the length  
	 *
	 *
	 * we'll base our gap on the array's length 
	 * we'll initialize the gap (or interval) to array.length / 2
	 * on each iteration, we'll divide the gap value by 2 to get the next gap value 
	 * for our array the gap will be initialized to 3 
	 * on the next iteration it will be 1 - insertion sort 
	 * 
	 * i = gap = 3
	 * j = i = 3
	 * newElement = array[i] = 7 
	 * 
	 * compare array[j -gap] with newElement
	 * 
	 * in-place algorithm 
	 * 
	 * worst case: O(n2) but it can perform much better -> depends on the gap 
	 * 
	 * unstable algorithm 
	 *
	 *
	 *
	 */

	public static void main(String[] args) {
			shellSort(Util.getDummyArr());
	}

	private static void shellSort(int[] dummyArr) {
		for (int gap = dummyArr.length/2; gap > 0; gap/=2) {
			for (int i = gap; i < dummyArr.length; i++) {
				int newElement = dummyArr[i];
				int j = i;
				
				while (j >= gap && dummyArr[j - gap]> newElement) {
					dummyArr[j] = dummyArr[j - gap];
					j -= gap;
				}
				
				dummyArr[j] = newElement;
			}
		}
		Util.printArr(dummyArr);
	}
}
