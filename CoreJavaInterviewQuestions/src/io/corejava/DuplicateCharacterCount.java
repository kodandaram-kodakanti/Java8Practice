package io.corejava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacterCount {
	public static void main(String[] args) {
		String str = " Hello how are you ";
		str = str.replaceAll("\\s", "");
		System.out.println("The string is " + str);
		System.out.println(" Duplicate character on above string: ");

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				int cnt = map.get(c);
				map.put(c, ++cnt);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		int maxValueInMap = (Collections.max(map.values()));
		Iterator<Entry<Character, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Character, Integer> entry = (Entry<Character, Integer>) itr.next();

			if (entry.getValue() == maxValueInMap) {
				System.out.print(entry);
			}

		}
	}
}