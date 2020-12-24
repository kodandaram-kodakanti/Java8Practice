package stream_practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamToCollections {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(20, 9, 15, 8, 23, 5, 10);

		// 1) Converting Stream to List
		List<Integer> list = stream.filter(i -> i > 10).collect(Collectors.toList());
		list.stream().forEach(System.out::println);

		System.out.println();

		// 2) Converting Stream to Array
		Stream<Integer> stream1 = Stream.of(20, 9, 15, 8, 23, 5, 10);
		Integer[] intArray = stream1.filter(i -> i > 10).toArray(Integer[]::new);
		Stream.of(intArray).forEach(System.out::println);

	}

}
