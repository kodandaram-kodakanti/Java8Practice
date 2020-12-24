package io.corejava;

import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Integer value: ");
		int val = Integer.parseInt(sc.next());

		int reminder, temp;
		int palindromeVal = 0;

		temp = val;
		System.out.println();
		while (val > 0) {

			
			// Getting the reminder value which is the last letter of the given integer
			reminder = val % 10;

			System.out.println("reminder: " + reminder);

			//Assigning the reminder to as the first letter of palindromeVal variable
			palindromeVal = (palindromeVal * 10) + reminder;

			// making the original input number reducing by one-digit from last
			val = val / 10;

			System.out.println("Value: " + val);
			System.out.println();
		}

		System.out.println();
		if (temp == palindromeVal) {
			System.out.println("It's a Palindrome number: " + temp);

		} else {
			System.out.println("It's not a Palindrome number: " + temp);

		}

		sc.close();
	}

}
