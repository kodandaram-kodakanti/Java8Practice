package util.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/***
 * 
 * https://javarevisited.blogspot.com/2017/09/java-8-sorting-hashmap-by-values-in.html#axzz6gzKqej4R
 **/

public class SortHashMapByValue {

	public static void main(String[] args) {

		Map<String, Integer> budget = new HashMap<>();
		budget.put("clothes", 120);
		budget.put("grocery", 150);
		budget.put("transportation", 100);
		budget.put("utility", 130);
		budget.put("rent", 1150);
		budget.put("miscellneous", 90);
		budget.put("clothes_1", 120);
		budget.put("miscellneous_1", 90);

		System.out.println("map before sorting: " + budget);

		/** In Java7 ***/
		/** Getting the EntrySet into List **/
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(budget.entrySet());

		System.out.println(list);

		/** Apply Collections.sort(list, comparator) method for sorting ***/
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}

		});

		// Maintaining insertion order with the help of LinkedHashMap
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();

		for (Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("Sorted Map Key-Values are: " + sortedMap);

		/** In Java-8 ***/
		Map<Object, Object> sortedMap1 = budget.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a, b) -> b, LinkedHashMap::new));
		System.out.println("Sorted Map Key-Values are: " + sortedMap1);

		Map<String, Integer> sortedMap2 = budget.entrySet().stream()
				.sorted((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a, b) -> b, LinkedHashMap::new));

		System.out.println("Sorted Map Key-Values are: " + sortedMap2);

		Map<String, Integer> sortedMap3 = budget.entrySet().stream()
				.sorted((entry1, entry2) -> entry1.getValue() - entry2.getValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a, b) -> b, LinkedHashMap::new));

		System.out.println("Sorted Map Key-Values are: " + sortedMap3);
	}

}
