package main;

/*
 * Arrays: 
 * Fixed in size 
 *
 * Contiguous block in memory -> thats why you can't resize, coz' no guarantee for preserving the contiguous block
 * Every element occupies the same amount of space in memory 
 * if an array starts at memory address x, and the size of each element in the array is y,
 * we can calculate the memory address of the ith element  
 * by using the following expression: x + i * y
 * 
 * if we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array
 * 
 * 
 * start address of array = 12, element size = 4 bytes
 * 
 * Address of array[0] = 12 + (0 * 4) = 12
 * Address of array[1] = 12 + (1 * 4) = 16 -> thats why it is zero based otherwise we have to subtract one -> (1-1 * 4)...
 * Address of array[2] = 12 + (2 * 4) = 20
 * Address of array[3] = 12 + (3 * 4) = 24
 * Address of array[4] = 12 + (4 * 4) = 28
 * Address of array[5] = 12 + (5 * 4) = 32
 * Address of array[6] = 12 + (6 * 4) = 36
 * 
 * 
 * Retrieve an element from an array
 * 
 * multiply the size of the element by its index
 * get the start address of the array
 * add the start address to the result of the multiplication
 * 
 * array[0] = 12 + (0 * 4) = 12
 * array[1] = 12 + (1 * 4) = 16
 * array[2] = 12 + (2 * 4) = 20
 * array[3] = 12 + (3 * 4) = 24
 * 
 * always needs this 3 steps to retrieve -> O(1) 
 * 
 * 
 * retrieve with index -> O(1) - constant time
 * retrieve without index -> O(n) - linear time
 * add an element to a full array O(n)
 * add an element to the end of an array (has space) O(1)
 * insert update an element at a specific index O(1)
 * delete an element by setting it to null O(1)
 * delete an element by shifting elements O(n)
 * 
 * 
 * Sorting: 
 * 	Unstable Sort: 
 * 	the duplicates are not preserve their position in the array after sorting 
 * 	5 9 3 9' 8 4
 * 	3 4 5 8 9' 9  -> 9' was after 9, now it is before 9 they relative position fliped 
 * 
 * a stable sort is preferable coz' if we sorting objects the unstable can cause trouble 
 * 
 * bubble is a stable algorithm -> we only flip if it is bigger or not 
 * 
 * selection sort is an unstable algorithm
 * 
 * insertion sort is a stable algorithm
 *
 * insertion sort is an unstable algorithm
 * 
 * merge sort is a stable algorithm
 * 
 * quick sort is an unstable algorithm 
 * 
 * radix sort is a stable algorithm
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		
	}
}
