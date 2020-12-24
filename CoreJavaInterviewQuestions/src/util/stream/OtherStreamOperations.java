package util.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OtherStreamOperations {

	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("Car", "Bus", "car", "Bike", "Aeroplane", "Bus", "Scooty", "Car");

		/** Distinct vehicles **/
		List<String> distinctVehicles = vehicles.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVehicles);

		/** count of distinct vehicles **/
		long count = vehicles.stream().distinct().count();
		System.out.println("count of distinct vehicles: " + count);

		/** Collect top 3 elements */
		List<String> top3 = vehicles.stream().limit(3).collect(Collectors.toList());
		System.out.println(top3);

		/** Skip top 3 */
		List<String> top3Skipped = vehicles.stream().skip(3).collect(Collectors.toList());
		System.out.println(top3Skipped);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		/** Min number value */
		int min = numbers.stream().min((val1, val2) -> val1.compareTo(val2)).get();
		System.out.println("Minumum number: " + min);

		min = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minumum number: " + min);
		/** Max number value */
		int max = numbers.stream().max((val1, val2) -> val1.compareTo(val2)).get();
		System.out.println("Maximum number: " + max);

		max = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum number: " + max);

		/** reduce operation */
		/**
		 * sum(), min(), max(), count() etc. are some examples of reduce operations.
		 * reduce() explicitly asks you to specify how to reduce the data that made it
		 * through the stream
		 */
		List<String> values = Arrays.asList("How", "are", "you?", "Hello", "Hi");
		String reducedValue = values.stream().reduce((operationResult, element) -> {
			System.out.println("operationResult: " + operationResult);
			System.out.println("element: " + element);
			return operationResult + " " + element;
		}).get();
		System.out.println("reducedValue: " + reducedValue);

		/** toArray Example */
		List<String> list = Arrays.asList("Geeks", "for", "gfg", "GeeksQuiz");
		Object[] array = list.stream().filter(item -> item.startsWith("G")).toArray();
		System.out.println(Arrays.toString(array));

	}

}
