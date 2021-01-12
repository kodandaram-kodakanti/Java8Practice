package io.corejava;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int n = Integer.parseInt(sc.next());

		System.out.println("factorial value is: " + factorial(n));
		System.out.println("factorial value is: " + factorialRecursion(n));
	}

	private static int factorialRecursion(int n) {
			  if (n == 0)    
			    return 1;    
			  else    
			    return(n * factorialRecursion(n-1));
	}

	private static int factorial(int n) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

}
