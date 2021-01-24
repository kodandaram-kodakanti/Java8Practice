package util.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 {

	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	public Employee1(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}

public class ComparableAndComparator {

	public static void main(String[] args) {

		List<Employee1> empList = new ArrayList<Employee1>();
		empList.add(new Employee1(523, "KodandaRamu K", 28, 120000));
		empList.add(new Employee1(520, "Muraly", 29, 100000));
		empList.add(new Employee1(524, "Priya", 27, 65000));
		empList.add(new Employee1(523, "Ram K K", 28, 120000));

		/** Sort By Age **/
		Collections.sort(empList, new Comparator<Employee1>() {
			@Override
			public int compare(Employee1 o1, Employee1 o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		System.out.println("Sort By Age: " + empList);

		/** Sort By Name **/
		Collections.sort(empList, new Comparator<Employee1>() {
			@Override
			public int compare(Employee1 o1, Employee1 o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("Sort By Name: " + empList);
		
	}

}
