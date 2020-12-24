package util.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFindOperations {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("one", "two", "One", "Three", "four");
		//List<String> stringList1 = Arrays.asList();
		String item = stringList.stream().findAny().get();
		System.out.println(item);
		// String item1 = stringList1.stream().findAny().get();
		// //java.util.NoSuchElementException
		// System.out.println(item1);

		String item2 = stringList.stream().findFirst().get();
		System.out.println(item2);

		/** Concatenating streams **/
		Stream<String> stream1 = Stream.of("Lion", "Tiger", "Deer", "Elephant");
		Stream<String> stream2 = Stream.of("Hen", "Peacock", "Parrot", "Dove");

		List<String> concatenatedList = Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(concatenatedList);

	}

}
