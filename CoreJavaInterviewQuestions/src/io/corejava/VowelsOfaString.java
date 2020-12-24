package io.corejava;

import java.util.Scanner;

public class VowelsOfaString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		findVowels(str);

		sc.close();
	}

	private static void findVowels(String str) {
		char[] charArray = str.toCharArray();
		int i = 0;
		for (char c : charArray) {
			switch (Character.toUpperCase(c)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				i = 1;
				System.out.println(c);

			}
		}
		if (i == 0) {
			System.out.println("No Vowels Found!!");
		}
	}

}
