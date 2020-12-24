package io.corejava.streamAPI;

/***
 * 
 * Source: https://www.youtube.com/watch?v=ARfzyUz4q7Y
 * 
 * */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBeanImplementingComparator {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(523, "Ram K K", "CSE", 1700000),
				new Employee(501, "Ravi", "CSE", 1600000), new Employee(522, "Karthick", "CSE", 1200000),
				new Employee(525, "Prasad", "CSE", 1100000), new Employee(502, "Adhi Narayana", "CSE", 1000000),
				new Employee(551, "Sumanth", "CSE", 1250000));

		// sort the list of employees based on salary
		Collections.sort(employees, new MyComparator());
		System.out.println(employees);
	}

}

class MyComparator implements Comparator<Employee> {

	// Sorting by Salary
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary() - o2.getSalary()); // Ascending Order
	}

}