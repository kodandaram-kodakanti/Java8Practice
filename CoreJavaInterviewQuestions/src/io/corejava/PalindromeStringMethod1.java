package io.corejava;

import java.util.Scanner;

public class PalindromeStringMethod1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string value for Palindrome check: ");

		String str = sc.next();

		if (palindromeString(str)) {

			System.out.println("It's a Palindrome: " + str);
		} else {

			System.out.println("It's not a Palindrome: " + str);
		}

		sc.close();

	}

	private static boolean palindromeString(String str) {
		boolean flag = false;
		StringBuilder newStr = new StringBuilder();

		for (int i = str.length(); i > 0; i--) {

			newStr.append(str.charAt(i - 1));

		}

		System.out.println("New String: " + newStr);
		flag = str.equals(newStr.toString()) ? true : false;
		return flag;
	}

}
