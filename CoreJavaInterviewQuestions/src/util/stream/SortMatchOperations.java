package util.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortMatchOperations {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 5, 1, 7, 4, 9, 10, 8, 3, 6);

		/** Sort by ascending order */
		List<Integer> ascOrder = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(ascOrder);

		/** Sort by descending order */
		List<Integer> descOrder = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descOrder);

		List<String> names = Arrays.asList("Ram", "Hari", "Kiran", "Vikram", "Praveen", "Arun");
		/** Sort by ascending order */
		List<String> namesAscOrder = names.stream().sorted().collect(Collectors.toList());
		System.out.println(namesAscOrder);

		/** Sort by descending order */
		List<String> namesDescOrder = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(namesDescOrder);
		
		
		
		//anyMatch
		Set<String> fruits = new HashSet<String>();
		fruits.add("One Apple");
		fruits.add("one Mango");
		fruits.add("one Apple");
		fruits.add("Two Oranges");
		fruits.add("One Guava");
		
		boolean result =fruits.stream().anyMatch(fruit -> fruit.startsWith("one"));
		System.out.println(result);
		
		boolean result1 = fruits.stream().anyMatch(fruit -> fruit.startsWith("two"));
		System.out.println(result1);
		
		//allMatch() - Every value should match with the given condition
		boolean result2= fruits.stream().allMatch(fruit -> fruit.startsWith("One"));
		System.out.println(result2);
		
		//noneMatch() - Every value should not match with the given condition
		boolean result3= fruits.stream().noneMatch(fruit -> fruit.startsWith("One"));
		System.out.println(result3);
	}

}


