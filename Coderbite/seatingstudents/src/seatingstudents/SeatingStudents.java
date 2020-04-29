package seatingstudents;

import java.util.HashSet;
import java.util.Set;

public class SeatingStudents {
	private static int total;
	
	public static int seatingStudents(int[] arr) {
	    total = arr[0];
	    
        Set<Integer> occupied = new HashSet<>();
        int count = 0, n = arr.length;
        
        for (int i = 1; i < n; i++) occupied.add(arr[i]);
        
        
        for (int i = 1; i < total; i++) {
            if (isOccupied(i, occupied)) continue;
            
            if (!isOccupied(i+2, occupied)) //the seat below >> 1 + 2 -> 3  
            	count++;
            
            if (i % 2 != 0) //the seat nextTo >> 1 + 1 -> 2 (if it's odd)
                if (!isOccupied(i+1, occupied)) 
                    count++;      
        }

        return count;
    }

    private static boolean isOccupied(int currentDesk, Set<Integer> occupied) {
        return currentDesk > total || occupied.contains(currentDesk);
    }
}


