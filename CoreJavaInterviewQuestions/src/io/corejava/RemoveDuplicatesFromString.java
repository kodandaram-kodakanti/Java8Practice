package io.corejava;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		System.out.println(removeDuplicates(str));

		sc.close();

	}

	private static StringBuilder removeDuplicates(String str) {

		HashSet<Character> set = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();

		for (Character c : str.toCharArray()) {
			boolean flag = set.add(c);
			if (flag) { // !set.contains(c)
				// set.add(c);
				sb.append(c);
			}
		}

		return sb;
	}

}
