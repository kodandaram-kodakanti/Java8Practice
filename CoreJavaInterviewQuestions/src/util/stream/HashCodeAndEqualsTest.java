package util.stream;

import java.util.HashSet;
import java.util.Set;

/** Checking the equality on the basis of the Id attribute **/
class Employee2 {
	private Integer id;
	private String firstname;
	private String lastName;
	private String department;

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", department="
				+ department + "]";
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : getId());
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
		Employee2 other = (Employee2) obj;
		if (this.getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!this.getId().equals(other.getId()))
			return false;
		return true;
	}
}

public class HashCodeAndEqualsTest {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		Employee2 e2 = new Employee2();

		e1.setId(100);
		e1.setFirstname("Ram");
		e1.setLastName("K K");

		e2.setId(100);
		e2.setFirstname("KodandaRam");
		e2.setLastName("Kodakanti");

		System.out.println(e1.equals(e2));

		Set<Employee2> employees = new HashSet<Employee2>();
		employees.add(e1);
		employees.add(e2);

		System.out.println(employees);

		System.out.println("Hashcode of e1: " + e1.hashCode());
		System.out.println("Hashcode of e2: " + e2.hashCode());
	}

}
