package util.stream;

import java.util.ArrayList;

// declared as final class
final class Country {
	// declared private final instance variable
	private final String countryName;

	// Mutable object
	private final ArrayList<String> listOfStates;

	public Country(String countryName, ArrayList<String> listOfStates) {
		super();
		this.countryName = countryName;
		// this.listOfStates = listOfStates;
		// Creating deep copy for mutable object
		ArrayList<String> tempList = new ArrayList<String>();
		for (String state : listOfStates) {
			tempList.add(state);
		}
		this.listOfStates = tempList;

	}

	public String getCountryName() {
		// Do not need to do cloning as it is immutable object
		return countryName;
	}

	public ArrayList<String> getListOfStates() {
		// Returning cloned object
		return (ArrayList<String>) listOfStates.clone();
	}

}

public class ImmutableClassExample {

	public static void main(String[] args) {
		ArrayList<String> listOfStates = new ArrayList<String>();
		listOfStates.add("Madhya Pradesh");
		listOfStates.add("Maharastra");
		listOfStates.add("Gujrat");
		String countryName = "India";
		Country country = new Country(countryName, listOfStates);

		System.out.println("Country : " + country.getCountryName());
		// Lets try to change local variable countryName
		countryName = "China";
		System.out.println("Updated Country : " + country.getCountryName());
		System.out.println("List of states : " + country.getListOfStates());
		// It will not be added to the list because we are using clone in
		// getListOfStates
		country.getListOfStates().add("Kerala");
		// It will not be added to the list because we are using deep copy in
		// constructor
		listOfStates.add("Rajasthan");
		System.out.println("Updated List of states : " + country.getListOfStates());
	}

}