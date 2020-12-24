package stream_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterNMapOperations {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(20, 9, 15, 6, 25, 10);

		// filer out greater than 10, map it to square of elements, and finding the sum
		int sum = list.stream().filter(num -> num > 10).map(num -> num * num).mapToInt(num -> num).sum();
		System.out.println(sum);

		System.out.println();
		// Filter string length greater than '8' and print in Upper-case

		List<String> strList = new ArrayList<>();
		strList.add("KodandaRamu K");
		strList.add("Bangalore");
		strList.add("Kavali");
		strList.add("Nellore");
		strList.add("Sri Kala Hasthi");

		strList.stream().filter(str -> str.length() > 8).map(str -> str.toUpperCase()).forEach(System.out::println);

	}

}
