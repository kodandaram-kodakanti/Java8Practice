package stream_practice;

import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Ram", "Ram K K", "Ramya", "KodandaRam", "K K Ram");

		// 1) Stream.filter()
		Stream<String> startsWithR = names.filter(name -> name.startsWith("R"));
		startsWithR.forEach(System.out::println);
		

		System.out.println();

		// 2) // Stream.map()
		Stream<String> names1 = Stream.of("Ram", "Ram K K", "Ramya", "KodandaRam", "K K Ram");
		Stream<String> upperCaseNames = names1.map(String::toUpperCase);
		
		// 3) // Stream.sorted()
		upperCaseNames.sorted().forEach(System.out::println);
	}

}
