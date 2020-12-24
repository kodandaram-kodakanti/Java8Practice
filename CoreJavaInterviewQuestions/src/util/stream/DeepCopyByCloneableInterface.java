package util.stream;

class Address1 implements Cloneable {
	private String street;
	private String city;
	private String country;

	/**
	 * We have updated the access modifier to 'public' from 'protected' for the
	 * below clone() method
	 **/
	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Address1) super.clone();
	}

	public Address1(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address1 [street=" + street + ", city=" + city + ", country=" + country + "]";
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

}

class User1 implements Cloneable {
	private String firstName;
	private String lastName;
	private Address1 address;

	@Override
	public Object clone() throws CloneNotSupportedException {
		// cloning the root user
		User1 user = (User1) super.clone();

		// cloning the member object
		user.address = (Address1) this.address.clone();
		return user;
	}

	public User1(String firstName, String lastName, Address1 address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User1 [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
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
	public Address1 getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address1 address) {
		this.address = address;
	}

}

public class DeepCopyByCloneableInterface {

	public static void main(String[] args) {

		Address1 address = new Address1("Someshwara Temple Road", "Bangalore", "India");
		User1 originalUser = new User1("KodandaRamu", "Kodaconti", address);
		User1 clonedUser = null;
		try {
			clonedUser = (User1) originalUser.clone();
			System.out.println("OriginalUser: " + originalUser);
			System.out.println("ClonedUser: " + clonedUser);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Update the address details in cloned copy and check the originalCopy!");
		System.out.println();
		clonedUser.getAddress().setStreet("Ameerpet");
		clonedUser.getAddress().setCity("Hyderabad");

		originalUser.setFirstName("Ram K K");
		System.out.println("OriginalUser: " + originalUser);
		System.out.println("ClonedUser: " + clonedUser);
	}

}
