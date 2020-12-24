package stream_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreations_3_Ways {

	public static void main(String[] args) {

		// Way 1: Using Stream.of(val1, val2, val3,...)
		Stream<Integer> streamFrmVal = Stream.of(10, 20, 30, 40, 50);
		streamFrmVal.forEach(System.out::println);
		// or
		// streamFrmVal.forEach(p -> System.out.println(p));
		System.out.println();

		// Way 2: Using Stream.of(array of Elements)
		Stream<Integer> streamFrmArray = Stream.of(new Integer[] { 10, 20, 30, 40, 50 });
		streamFrmArray.forEach(System.out::println);
		System.out.println();

		// Way 3: Using List.stream()
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		Stream<Integer> streamFrmList = list.stream();

		streamFrmList.forEach(System.out::println);

	}

}
