package com.genpact;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*****
 * 
 * https://www.techiedelight.com/count-frequency-elements-list-java/
 * 
 ***/

public class FrequencyTest {

	public static void main(String[] args) {

//	        List<String> list = Arrays.asList("B", "A", "A", "C", "B", "A");
		List<Integer> list = Arrays.asList(1, 3, 3, 4, 4, 4);

		Set<Integer> distinct = new HashSet<>(list);
		for (Integer s : distinct) {

			if (Collections.frequency(list, s) > 1) {
				System.out.println(s + ": " + Collections.frequency(list, s));
			}
		}
		System.out.println();
		
		/** Using Java8 ***/
		Map<Integer, Long> frequencyMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Long frequencyCount = frequencyMap.values().stream().filter(count -> count > 1).collect(Collectors.counting());
		System.out.println("Frequency Size with count more than '1': " + frequencyCount);
		System.out.println();
		
		/*** Using Java7 Map ****/
		Map<Integer, Integer> frequencyMap1 = new HashMap<>();
		for (Integer s : list) {
			Integer count = frequencyMap1.get(s);
			if (count == null)
				count = 0;

			frequencyMap1.put(s, ++count);
		}
		for (Map.Entry<Integer, Integer> entry : frequencyMap1.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}