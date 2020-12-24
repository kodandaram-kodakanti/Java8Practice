package util.stream;

class Address {

	private String street;
	private String city;
	private String country;

	// standard constructors, getters and setters
	public Address(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
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

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
	}

}

class User {

	private String firstName;
	private String lastName;
	private Address address;

	// standard constructors, getters and setters
	public User(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
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
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

}

public class ShallowCopyExample {

	/**
	 * The shallow copy is the approach when we only copy field values and therefore
	 * the copy might be dependant on the original object.
	 **/
	public static void main(String[] args) {
		Address address = new Address("Downing St 10", "London", "England");
		User pm = new User("Prime", "Minister", address);

		User shallowCopy = new User(pm.getFirstName(), pm.getLastName(), pm.getAddress());
		System.out.println("shallowCopy: " + shallowCopy);
		System.out.println("OriginalCopy: " + pm);
		System.out.println(pm != shallowCopy);

		/**
		 * In this case pm != shallowCopy, which means that they're different objects,
		 * but the problem is that when we change any of the original address'
		 * properties, this will also affect the shallowCopy‘s address.
		 **/

		address.setCity("Bangalore");
		System.out.println("Copies after update in Originalcopy's Address: ");
		System.out.println("shallowCopy: " + shallowCopy);
		System.out.println("OriginalCopy: " + pm);

		/**
		 * now let's update the address in ShallowCopy and will the both the objects are
		 * different or same
		 ***/
		shallowCopy.getAddress().setCity("Hyderabad");
		System.out.println("Copies after update in ShallowCopy's Address: ");
		System.out.println("shallowCopy: " + shallowCopy);
		System.out.println("OriginalCopy: " + pm);
	}
}
