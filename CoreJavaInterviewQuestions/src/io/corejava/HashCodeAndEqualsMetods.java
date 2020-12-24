package io.corejava;

import java.util.HashMap;

public class HashCodeAndEqualsMetods {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);

		HashMap<Employee, String> map1 = new HashMap<Employee, String>();
		map1.put(e1, "Ram K K");
		map1.put(e2, "Ram K K");

		System.out.println("Map Size of same Employee bean elements: " + map1.size()); // This value will be '2' if we don't
		// override hashcode() & equals() methods in
		// Employee class

		System.out.println();

		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);

		HashMap<Integer, String> iMap = new HashMap<Integer, String>();
		iMap.put(i1, "One");
		iMap.put(i2, "One");

		System.out.println("Map Size of same Wrapper class elements: " + iMap.size()); // This map size is '1' only because All Wrapper classes in Java by default
											// overridden with hashCode() & equals() methods
	}

}

class Employee {

	int id;

	Employee(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

}