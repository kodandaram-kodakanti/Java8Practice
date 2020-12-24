package io.corejava;

import java.util.Scanner;

public class PrintNumbersWithoutLoops {

	public static void main(String[] args) {

		System.out.println("Enter the max numbers to be printed: ");

		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.next());

		printNumbers(num);

		sc.close();

	}

	private static void printNumbers(int num) {

		if (num > 0) {
			//System.out.println(num);
			num--;
			printNumbers(num);
			System.out.println(num + 1); // This line is getting executed n no.of times because return; statement
		}
		return;

		// return; statement continues the previous execution from the next line where
		// exactly the previous execution flow has been interrupted
		// In the above case, it executes the SysOut statement n no.of times where after
		// the recursive function is called.
		// return; statement must be last statement of any method.
	}

}
