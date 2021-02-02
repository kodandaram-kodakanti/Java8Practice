package util.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamOperations {

	public static void main(String[] args) {

		/**
		 * Counting Empty String
		 **/
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		long count = strList.stream().filter(element -> element.isEmpty()).count();
		System.out.println("Empty String count: " + count);

		/**
		 * Count String whose length is more than three
		 *
		 ***/
		long num = strList.stream().filter(element -> element.length() > 3).count();
		System.out.println("Count String whose length is more than three: " + num);

		/**
		 * 
		 * Count number of String which starts with "a"
		 * 
		 ***/
		long aCount = strList.stream().filter(element -> element.startsWith("a")).count();
		System.out.println("Count number of String which starts with \"a\": " + aCount);

		/***
		 * 
		 * Remove all empty Strings from List
		 * 
		 ***/
		List<String> nonEmptyList = strList.stream().filter(element -> !element.isEmpty()).collect(Collectors.toList());
		System.out.println("Non-Empty Strins list: " + nonEmptyList);

		/***
		 * 
		 * Create a List with String more than 2 characters
		 * 
		 */
		List<String> twoCharList = strList.stream().filter(element -> element.length() > 2)
				.collect(Collectors.toList());
		System.out.println("String with more than 2 characters: " + twoCharList);

		/**
		 * 
		 * Convert String to uppercase and Join them with coma
		 * 
		 ***/
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		String joinedList = G7.stream().map(element -> element.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println("Strings Joined: " + joinedList);

		String joinedList1 = String.join(", ", G7);
		System.out.println("Strings Joined: " + joinedList1);

		/***
		 * 
		 * Create a List of the square of all distinct numbers
		 * 
		 ****/
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

		List<Integer> distinctSquares = numbers.stream().distinct().map(element -> element * element)
				.collect(Collectors.toList());
		System.out.println("List of the square of all distinct numbers: " + distinctSquares);

		/**
		 * 
		 * Get count, min, max, sum, and the average for numbers
		 * 
		 ****/
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt(number -> number).summaryStatistics();
		System.out.println("Numeric statistics: " + stats);
		System.out.println("Highest prime number in List : " + stats.getMax());
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());
		System.out.println("Count of all prime numbers : " + stats.getCount());

	}

}