package duplicatezeros;

public class DuplicateZeros {
	
	/*
	 *  zeroStart: 11
		zero_simple: 7 arr[i]: 4
		zero_simple: 6 arr[i]: 0
		zero_equalZero: 5 arr[zero]: 0
		zero_simple: 4 arr[i]: 3
		zero_simple: 3 arr[i]: 2
		zero_simple: 2 arr[i]: 0
		zero_equalZero: 1 arr[zero]: 0
		zero_simple: 0 arr[i]: 1
	 */
	
public void duplicateZeros(int[] arr) {
	int zeroCounter = 0;
	int n = arr.length;
	
	for (int i = 0; i < arr.length; i++, zeroCounter++) 
		if(arr[i] ==0) zeroCounter++;
	
	for (int i= n-1; i >= 0; i--) {

		if(--zeroCounter < n) 
			arr[zeroCounter] = arr[i];
		
		if(arr[i] == 0 && --zeroCounter < n) 
			arr[zeroCounter] = 0;	
	}
	}	
}
		   


