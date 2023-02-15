package com.wipro;

import java.util.Scanner;

public class SumOfDigitsExample {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		number = sc.nextInt();

		System.out.println("Output: " + getCharForNumber(findSum(number)));
	}

	static int findSum(int n) {
		String numberStr = n + "";
		int sum = 0;
		for (int i = 0; i < numberStr.length(); i++) {
			sum = sum + Integer.parseInt(numberStr.charAt(i) + "");
		}
		return sum;
	}

	private static String getCharForNumber(int i) {
		System.out.println("Sum: " + i);
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		if (i > 25) {
			i = findSum(i - 1);

		}
		return Character.toString(alphabet[i]);
	}

}
