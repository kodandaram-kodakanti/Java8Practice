package io.corejava;

public strictfp class SumOfFirstNdigits {

	public strictfp static void main(String[] args) {
		// 1.0 is a double/float data type and double data type supports Infinity
		System.out.println(1.0f / 0);
		System.out.println(1.0 / 0);
		printSums();

	}

	// rule is: n * (n + 1) / 2
	public strictfp static void printSums() {
		for (int n = 1; n <= 10; n++) {
			System.out.println(n * (n + 1) / 2);
		}
	}
}