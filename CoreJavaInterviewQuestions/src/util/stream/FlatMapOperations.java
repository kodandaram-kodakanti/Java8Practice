package util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapOperations {

	public static void main(String[] args) {

		/***
		 * 
		 * FlatMap processes the data from Collection of Collection objects(nested
		 * collection objects) into Stream of Streams for each collection and provides
		 * the plain list of elements/attributes(not the nested list)
		 * 
		 */

		List<Integer> list1 = Arrays.asList(23, 20, 18, 25, 14, 30);
		List<Integer> list2 = Arrays.asList(22, 31, 28, 12, 24);
		List<Integer> list3 = Arrays.asList(14, 20, 34, 19, 15, 13, 26);

		List<List<Integer>> listOfList = Arrays.asList(list1, list2, list3);

		// Collect all the elements from the above lists into a Single List

		/** Before Java8 **/
		List<Integer> allIntegers = new ArrayList<Integer>();
		for (List<Integer> list : listOfList) {
			for (Integer i : list) {
				allIntegers.add(i);
			}
		}
		System.out.println(allIntegers);

		/** In Java8 **/
		//Collect all the elements which are >=20 and <=30
		List<Integer> finalList = listOfList.stream()
											.flatMap(numList -> numList.stream())
											.filter(num -> (num >= 20 && num <= 30))
											.collect(Collectors.toList());
		System.out.println(finalList);
		
		List<String> teamA = Arrays.asList("Ram", "Rahim", "Robert");
		List<String> teamB = Arrays.asList("Lakshman", "Bharath", "Arjun", "Krishna");
		List<String> teamC = Arrays.asList("Ravi", "Rohit", "Sunil");
		
		List<List<String>> teamList = Arrays.asList(teamA, teamB, teamC);
		
		//Printing using map
		System.out.println(teamList.stream().map(team->team).map(member->member).collect(Collectors.toList()));

		//Printing using flatMap
		List<String> names = teamList.stream().flatMap(team->team.stream()).map(member->member.toUpperCase()).collect(Collectors.toList());
		System.out.println(names);
	
	}

}
