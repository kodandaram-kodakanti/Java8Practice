package io.corejava;

import java.util.Scanner;

public class FibonacciUsingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int num = Integer.parseInt(sc.next());

		System.out.println("Fibonacci number for " + num + " is: " + fibonacciNum(num));

		sc.close();
	}

	private static int fibonacciNum(int length) {

		int[] numArray = new int[length + 2];

		numArray[0] = 0;
		numArray[1] = 1;

		for (int i = 2; i < numArray.length; i++) {
			numArray[i] = numArray[i - 1] + numArray[i - 2];
		}

		return numArray[length];
	}

}