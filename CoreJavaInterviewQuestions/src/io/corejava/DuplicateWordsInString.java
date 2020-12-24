package io.corejava;

import static java.lang.System.in;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(in);

		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		String[] words = str.split(" ");

		duplicateWords(words);

		sc.close();
	}

	@SuppressWarnings("rawtypes")
	private static void duplicateWords(String[] words) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// Arrays.stream(words).

		// In Java 7
		for (String word : words) {
			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, ++count);
			} else {
				map.put(word, 1);
			}
		}

		System.out.println(map);

		// Printing in Java 7
		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			if (map.get(key) > 1) {
				System.out.println(key + " : " + map.get(key) + " time(s)");
			}
		}
		System.out.println();
		// Printing in Java 8
		map.keySet().stream().filter(key -> map.get(key) > 1)
				.forEach(value -> System.out.println(value + " : " + map.get(value) + " time(s)"));
	}

}
