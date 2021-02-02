package util.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortHashMapByValue_1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(523, "KodandaRamu K");
		map.put(524, "Priya K");
		map.put(525, "Alekhya");
		map.put(530, "Mahendra");
		map.put(518, "Javed Hassan");
		map.put(517, "Husna");
		map.put(520, "Husna");

		System.out.println("UnSorted Map Key-Values are: " + map);
		List<Entry<Integer, String>> linkedList = new LinkedList<Entry<Integer, String>>(map.entrySet());

		Collections.sort(linkedList, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}
		});

		/**
		 * Now create a new LinkedHashMap and copy the sorted elements into that. Since
		 * LinkedHashMap guarantees the insertion order of mappings. We cannot use
		 * TreeMap to sort values because TreeMap sorts elements by Keys in natural
		 * sorting order
		 */
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> sortedTreeMap = new TreeMap<Integer, String>();

		for (Entry<Integer, String> entry : linkedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
			sortedTreeMap.put(entry.getKey(), entry.getValue());

		}
		System.out.println("Sorted Map Key-Values are: " + sortedMap);
		System.out.println("Sorted TreeMap Key-Values are: " + sortedTreeMap);

		/** In Java-8 ***/
		/**
		 * toMap(keyMapper, valueMapper, keyConflict mergerFunction, Implementation Map
		 * Type)
		 **/
		Map<Integer, String> sortedMap1 = map.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (val1, val2) -> val2, LinkedHashMap::new));
		System.out.println("Sorted Map Key-Values are: " + sortedMap1);

		Map<Integer, String> sortedMap2 = map.entrySet().stream().sorted((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a, b) -> b, LinkedHashMap::new));
		
		System.out.println("Sorted Map Key-Values are: " + sortedMap2);
	}
}
