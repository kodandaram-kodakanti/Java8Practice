package util.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int empID;
	String eName;
	double salary;

	public Employee(int empID, String eName, double salary) {
		this.empID = empID;
		this.eName = eName;
		this.salary = salary;
	}

	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}

	/**
	 * @return the eName
	 */
	public String geteName() {
		return eName;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

}

public class FilterAndMapOperation {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(
				new Employee(523, "Ram K K", 120000),
				new Employee(503, "Alekhya", 100000),
				new Employee(522, "Karthik", 75000),
				new Employee(530, "Mahendra", 80000),
				new Employee(534, "Murali", 68000),
				new Employee(540, "Ashok", 74000));
		
		/**
		 * Collect all the Names of Employees in UpperCase whose salary is more than 74000.
		 */
		List<String> names = employeeList.stream().filter(emp -> evaluateSalaryStream(emp.getSalary())).map(e -> e.geteName().toUpperCase()).collect(Collectors.toList());
		System.out.println(names);

	}

	static boolean evaluateSalaryStream(double salary) {
		if (salary > 74000) {
			return true;
		} else
			return false;
	}
}
