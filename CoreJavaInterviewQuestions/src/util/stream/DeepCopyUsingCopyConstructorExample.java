package util.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Copy Constructor in java class is a special type of constructor that takes
 * same class as argument. Copy constructor is used to provide a copy of the
 * specified object.
 **/

class State {

	private List<String> cities;
	private String name;
	private String country;

	/** CopyConstructor **/
	public State(State st) {
		this.name = st.name; // string is immutable, so we can do direct assignment
		this.country = st.country;

		List<String> ct = new ArrayList<>();
		for (String c : st.cities) {
			ct.add(c);
		}
		this.cities = ct;
	}

	public State(List<String> cities, String name, String country) {
		this.cities = cities;
		this.name = name;
		this.country = country;
	}

	/**
	 * @return the cities
	 */
	public List<String> getCities() {
		return cities;
	}

	/**
	 * @param cities the cities to set
	 */
	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
		return "State [cities=" + cities + ", name=" + name + ", country=" + country + "]";
	}

	@Override
	public boolean equals(Object obj) {
		State st = (State) obj;
		if (st.getCountry().equalsIgnoreCase(this.country) && st.getName().equalsIgnoreCase(this.name)) {
			return true;
		}
		return false;
	}

}

public class DeepCopyUsingCopyConstructorExample {

	public static void main(String[] args) {
		State state = getState();
		State stateCopy = new State(state);
		System.out.println("State Original: " + state);
		System.out.println("StateCopy: " + stateCopy);
		System.out.println("Is both the Objects are with eqaul field values? " + state.equals(stateCopy));
		System.out.println();
		System.out.println("Adding the cities to CopiedObject. And setting new Country name to the CopiedObject.");
		System.out.println();

		state.setCountry("India");
		stateCopy.getCities().add("Cupertino");
		stateCopy.setCountry("United States of America");

		System.out.println("State OriginalCopy after update: " + state);
		System.out.println("StateCopy: " + stateCopy);
		System.out.println("Is both the Objects are with eqaul field values? " + state.equals(stateCopy));
	}

	private static State getState() {
		// in real life, it will do some DB call or expensive API
		// class to fetch the data
		List<String> cities = new ArrayList<>();
		cities.add("San Jose");
		cities.add("San Francisco");
		State state = new State(cities, "California", "USA");
		return state;
	}
}