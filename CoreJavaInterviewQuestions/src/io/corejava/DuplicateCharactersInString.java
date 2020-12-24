package io.corejava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		Set<Character> duplicateCharacters = new HashSet<Character>();

		System.out.println("Enter the input String value: ");

		String str = sc.next();

		char[] charArray = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (charArray[i] == charArray[j]) {
					System.out.println(charArray[j]);
					duplicateCharacters.add(charArray[j]);
					break;
				}
			}
		}

		sc.close();
		System.out.println("Repetitive characters are: " + duplicateCharacters);
	}

}
