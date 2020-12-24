package io.corejava.Synchronoss;

/**
 * 
 * Test cases : T SIZE OF Array : N Array : A
 * 
 * Input: 2, 1, 3, 4 	4(Size is 4)
 * 
 * Output: 3 3 4 -1
 * 
 */

public class GreaterValueArrayElements {

	public static void main(String[] args) {

		int[] A = { 2, 1, 3, 4 };

		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {

				if (A[j] > A[i]) {
					System.out.print(A[j] + " ");
					break;
				}
			}
		}

		System.out.print("-1");

	}

}
