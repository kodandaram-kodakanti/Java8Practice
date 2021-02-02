package util.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 ** Simple example of how to use Optional from Java 8 to avoid
 * NullPointerException. Optional is a new addition in Java API and also allows
 * you to set default values for any object.
 */

class Address2 {
	public static final Address2 EMPTY_ADDRESS = new Address2("", "", "", 0);

	private final String line1;
	private final String city;
	private final String country;
	private final int zipcode;

	public Address2(String line1, String city, String country, int zipcode) {
		this.line1 = line1;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String line1() {
		return line1;
	}

	public String city() {
		return city;
	}

	public String country() {
		return country;
	}

	public int zipcode() {
		return zipcode;
	}

	@Override
	public String toString() {
		return "Address{" + "line1=" + line1 + ", city=" + city + ", country=" + country + ", zipcode=" + zipcode + '}';
	}
}

class Person2 {
	private String name;
	private Optional<Address2> address;
	private int phone;

	public Person2(String name, Optional<Address2> address, int phone) {
		if (name == null) {
			throw new IllegalArgumentException("Null value for name is not permitted");
		}
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String name() {
		return name;
	}

	public Optional<Address2> address() {
		return address;
	}

	public int phone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Person{" + "name=" + name + ", address=" + address + ", phone=" + phone + '}';
	}
}

public class OptionalDemoJava8 {

	public static void main(String[] args) {

		/*********************************************************************/
		
		Optional<Object> opt = Optional.ofNullable(null);

		System.out.println(opt.isPresent());

		opt = Optional.ofNullable("Hello");

		System.out.println(opt.isPresent());

		opt.ifPresent(System.out::println);

		/*********************************************************************/

		Address2 johnaddress = new Address2("52/A, 22nd Street", "Mumbai", "India", 400001);
		Person2 john = new Person2("John", Optional.of(johnaddress), 874731232);
		Person2 mac = new Person2("Mac", Optional.empty(), 333299911);
		Person2 gautam = new Person2("Gautam", Optional.empty(), 533299911);
		List<Person2> people = new ArrayList<>();
		people.add(john);
		people.add(mac);
		people.add(gautam);

		people.stream().forEach((p) -> {
			System.out.printf("%s from %s %n", p.name(), p.address().orElse(Address2.EMPTY_ADDRESS));
		});
	}
}