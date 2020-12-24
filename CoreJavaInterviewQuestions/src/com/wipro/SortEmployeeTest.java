package com.wipro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = Arrays.asList(
				new Employee(524, "Karthick N", "IT-Test"), 
				new Employee(523, "KodandaRam K", "IT-Dev"),
				new Employee(525, "Rahul G", "IT-Support"));

		empList.stream().sorted(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpdID() - o2.getEmpdID();
			}

		}).forEach(System.out::println);

		System.out.println();

		empList.stream().sorted(Comparator.comparing(Employee::getEmpdID)).forEach(System.out::println);

	}

}
