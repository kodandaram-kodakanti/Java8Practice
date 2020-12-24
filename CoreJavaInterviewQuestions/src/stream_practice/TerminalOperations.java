package stream_practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Ram", "Ram K K", "Ramya", "KodandaRam", "K K Ram");

		// 1) Stream.collect()
		List<String> startsWithR = names.filter(name -> name.startsWith("R")).collect(Collectors.toList());
		startsWithR.forEach(System.out::println);

		System.out.println();

		Stream<String> names1 = Stream.of("Ram", "Ram K K", "Ramya", "KodandaRam", "K K Ram");
		// 2) Stream.forEach()
		names1.forEach(System.out::println);

		System.out.println();

		// 3) // Stream.match()
		Stream<String> names2 = Stream.of("Ram", "Ram K K", "Ramya", "KodandaRam", "K K Ram");
		boolean flag = names2.filter(name -> name.endsWith("m")).anyMatch(name -> (name.length() >= 10));
		System.out.println(flag);

	}

}
