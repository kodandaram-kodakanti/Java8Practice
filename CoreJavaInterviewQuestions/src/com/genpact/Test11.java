package com.genpact;

public class Test11 {

	public static void main(String[] args) {

		String str = "abc";
		MyMethod(str);
		System.out.println(str);
	}

	private static void MyMethod(String str) {

		str = "def";
		System.out.println(str);
	}

}
