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

public class SortEmployeeBeanUsingAnonymousInnerComparator {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(523, "Ram K K", "CSE", 1700000),
				new Employee(501, "Ravi", "CSE", 1600000), new Employee(522, "Karthick", "CSE", 1200000),
				new Employee(525, "Prasad", "CSE", 1100000), new Employee(502, "Adhi Narayana", "CSE", 1000000),
				new Employee(551, "Sumanth", "CSE", 1250000));

		// sort the list of employees based on salary using anonymous inner class of
		// Comparator interface
		Collections.sort(employees, new Comparator<Employee>() {
			// Sorting by Salary
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary()); // Ascending Order
			}
		});
		System.out.println(employees);

		// Sorting by Comparator Lambda expression. Because Comparator is a
		// FunctionalInterface

		Collections.sort(employees, (o1, o2) -> (int) (o2.getSalary() - o1.getSalary())); // Descending Order
		System.out.println(employees);

		// sort using stream API by providing the above lambda inside sorted method
		// since sorted method of stream accepts comparator
		employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println); // Ascending
																														// Order:
																														// Sort
																														// by
																														// Salary

		System.out.println();

		employees.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println); // Descending
																														// Order:
																														// Sort
																														// by
																														// Salary
		System.out.println();

		// Sort using comparing() method of Comparator interface. This method takes the
		// bean's field's getterMethod/Function to be compared as an argument.
		employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println); // Ascending

		System.out.println();

		// Sort by empName
		employees.stream().sorted(Comparator.comparing(emp -> emp.getName())).forEach(System.out::println); // Ascending

		System.out.println();
		// Optimizing the above statement with method reference as an argument inside
		// comparing() method
		employees.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println); // Sorted by ID
	}

}

/*
 * class MyComparator implements Comparator<Employee> {
 * 
 * // Sorting by Salary
 * 
 * @Override public int compare(Employee o1, Employee o2) { return (int)
 * (o1.getSalary() - o2.getSalary()); // Ascending Order }
 * 
 * }
 */