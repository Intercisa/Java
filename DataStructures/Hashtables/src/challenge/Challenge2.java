package challenge;

import java.util.HashMap;
import java.util.LinkedList;

import bean.Employee;


public class Challenge2 {

	public static void main(String[] args) {


		LinkedList<Employee> employees = new LinkedList<>();
		employees.add(new Employee("Jane", "Jones", 123));
		employees.add(new Employee("John", "Doe", 5678));
		employees.add(new Employee("Mike", "Wilson", 45));
		employees.add(new Employee("Mary", "Smith", 5555));
		employees.add(new Employee("John", "Doe", 5678));
		employees.add(new Employee("Bill", "End", 3948));
		employees.add(new Employee("Jane", "Jones", 123));
		
		deleteDuplicates(employees);
		
		employees.forEach(e -> System.out.println(e));
	}

	private static void deleteDuplicates(LinkedList<Employee> employees) {
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		for (Employee e : employees) 
			map.putIfAbsent(e.getId(), e);
		
		employees.clear();
		employees.addAll(map.values());
	}
}
