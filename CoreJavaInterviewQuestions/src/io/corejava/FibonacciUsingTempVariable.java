package io.corejava;

import java.util.Scanner;

public class FibonacciUsingTempVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int num = Integer.parseInt(sc.next());

		System.out.println("Fibonacci number for " + num + " is: " + fibonacciNum(num));

		sc.close();

	}

	private static int fibonacciNum(int num) {

		int a = 0, b = 1, c;

		if (num == 0) {
			return 0;
		}

		for (int i = 2; i <= num; i++) {

			c = a + b;
			a = b;
			b = c;

		}

		return b;
	}

}
