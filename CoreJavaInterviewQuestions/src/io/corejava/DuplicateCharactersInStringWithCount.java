package io.corejava;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharactersInStringWithCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input string value: ");
		String str = sc.nextLine();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		// Java 8
		str.chars().mapToObj(c -> (char) c).forEach(c -> {
			if (map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, ++count);
			} else {
				map.put(c, 1);
			}
		});
		System.out.println("Characters count: " + map);
		System.out.println();

		// Java 7
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (map1.containsKey(charArray[i])) {
				int count = map1.get(charArray[i]);
				map1.put(charArray[i], ++count);
			} else {
				map1.put(charArray[i], 1);
			}
		}

		System.out.println("Characters count: " + map1);

		sc.close();
	}

}
