package io.corejava;

import java.util.Scanner;

public class PalindromeStringMethod2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string value for Palindrome check: ");

		String str = sc.next();

		if (palindromeString(str)) {

			System.out.println("It's a Palindrome: " +  (str.length() % 2 == 0 ? "EVEN" : "ODD"));
		} else {

			System.out.println("It's not a Palindrome: " + str);
		}

		sc.close();

	}

	private static boolean palindromeString(String str) {

		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;

	}

}
