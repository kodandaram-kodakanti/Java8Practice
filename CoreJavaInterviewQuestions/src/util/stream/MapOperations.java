package util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperations {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ram", "Rahim", "Robert", "Kiran", "Ashok", "Anusha");
		List<String> namesInUpperCase = new ArrayList<String>();

		// Making the List into UpperCase and assigning to another List
		namesInUpperCase = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

		System.out.println(names); // Original Map
		System.out.println(namesInUpperCase);// New Map with upper-case names

		/** Print length of each element in the list */
		names.stream().map(name -> name.length()).forEach(length -> System.out.println(length));

		List<Integer> numbers = Arrays.asList(4, 2, 6, 3, 8, 5);
		List<Integer> multipliedList = new ArrayList<Integer>();

		/** Multiply each element in the list with 3 and assign it to another List. **/
		multipliedList = numbers.stream().map(number -> number * 3).collect(Collectors.toList());
		System.out.println("Before Multiplication: " + numbers);
		System.out.println("After Multiplication: " + multipliedList);

		String name1 = names.stream().filter(name -> name.length() > 4 && name.contains("s")).findFirst().get();
		System.out.println("Name with more than 4 character length and contains 's': " + name1);
	}

}