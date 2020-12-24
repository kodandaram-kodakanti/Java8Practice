package io.corejava;

import java.util.Scanner;

public class SwappingNumberWithoutThirdVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 'a' value: ");
		int a = sc.nextInt();
		System.out.println("Enter 'b' value: ");
		int b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping...");

		System.out.println("'a' value: " + a);
		System.out.println("'b' value: " + b);

		sc.close();

	}

}
