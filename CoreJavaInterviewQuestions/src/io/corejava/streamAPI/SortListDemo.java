package io.corejava.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20, 50, 12, 55, 23);

		Collections.sort(list); // Ascending order
		System.out.println(list);

		Collections.reverse(list);

		System.out.println(list);

		// Using Streams
		list.stream().sorted().forEach(item -> System.out.print(item + ", ")); // Ascending
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).forEach(item -> System.out.print(item + ", ")); // Descending
	}

}