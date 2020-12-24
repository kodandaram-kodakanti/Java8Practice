package io.corejava;

import java.util.Scanner;

public class FibonacciUsingRecursion
{
	static int fib(int n) {
		System.out.println("n: " + n);
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int n = Integer.parseInt(sc.next());

		System.out.println("Fibonacci number is: " + fib(n));

		sc.close();
	}
}
