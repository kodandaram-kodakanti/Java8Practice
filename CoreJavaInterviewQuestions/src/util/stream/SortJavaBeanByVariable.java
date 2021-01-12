package util.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String city;

	public Person(String firstName, String lastName, int age, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", city=" + city + "]";
	}

}

public class SortJavaBeanByVariable {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("Ramu", "kodanda", 29, "Bangalore"),
				new Person("Alekhya", "Phani", 28, "Kuwait"),
				new Person("Karthik", "Mavuluri", 29, "Nellore"),
				new Person("Mahendra", "Dhara", 30, "Hyderabad"),
				new Person("KodandaRamu", "Kodakanti", 29, "Tirupathi"),
				new Person("Balaji", "Sanna", 33, "Sri KalaHasthi"), 
				new Person("Aravind", "Samanu", 30, "Kavali"));

		/** Sort by firstName in reverse Order**/
		personList.stream().sorted(Comparator.comparing(Person::getFirstName).reversed())
				.forEach(person -> System.out.println(person));

		/** Sort by age **/

		/** Sort by City **/

	}

}
