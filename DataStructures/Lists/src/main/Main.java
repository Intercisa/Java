package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
 * 
 */

public class Main {
	public static void main(String[] args) {

		List<Emplyee> emplyees = new ArrayList<Emplyee>();
		emplyees.add(new Emplyee("Jane", "Jones", 123));
		emplyees.add(new Emplyee("John", "Doe", 4567));
		emplyees.add(new Emplyee("Mary", "Smith", 22));
		emplyees.add(new Emplyee("Mike", "Wilson", 3245));
		
		
		emplyees.forEach(System.out::println);
		
		System.out.println(emplyees.get(1));
		System.out.println(emplyees.isEmpty());
		
		emplyees.set(1, new Emplyee("Dave", "Batista", 321));
	
		emplyees.forEach(System.out::println);
		
		System.out.println(emplyees.size());
		
		Emplyee[] employeeArray = emplyees.toArray(new Emplyee[emplyees.size()]);
		for (Emplyee e : employeeArray) System.out.println(e);
		
		System.out.println(emplyees.contains(new Emplyee("Mary", "Smith", 22)));
		System.out.println(emplyees.indexOf(new Emplyee("Mary", "Smith", 22)));
		
		emplyees.remove(2);
		
		System.out.println(emplyees.contains(new Emplyee("Mary", "Smith", 22)));
		emplyees.forEach(System.out::println);
		
		//----------------- VECTOR ----------------- 
			//thread safe - synchronized 
		
		List<Emplyee> emplyeesVector = new Vector<Emplyee>();
		emplyeesVector.add(new Emplyee("Jane", "Jones", 123));
		emplyeesVector.add(new Emplyee("John", "Doe", 4567));
		emplyeesVector.add(new Emplyee("Mary", "Smith", 22));
		emplyeesVector.add(new Emplyee("Mike", "Wilson", 3245));
		
		//...
		
		
	}
}
