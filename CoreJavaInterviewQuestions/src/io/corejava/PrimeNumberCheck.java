package io.corejava;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {

		/**
		 * Rule: Prime Number is a number which can be divided by itself or can be divided by
		 * '1', or get the reminder '0'
		 * 
		 * Example: Number = 7; Here, 7 is a Prime number which can return the reminder
		 * 0 only if we divide with either 1 or 7
		 * 
		 * i.e., 7 % 1 = 0 and 7 % 7 = 0
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int num = Integer.parseInt(sc.next());

		if (primeNumberCheck(num)) {
			System.out.println("It's a Prmie Number: " + num);
		} else {
			System.out.println("It's not a Prmie Number: " + num);
		}

		sc.close();

	}

	private static boolean primeNumberCheck(int num) {

		if (num <= 1)
			return false;

		for (int i = 2; i < num; i++) {

			if (num % i == 0)
				return false;
		}

		return true;
	}

}
