package com.genpact;

import java.util.Optional;

class recursion {
	int func(int n) {
		int result;
		result = func(n - 1);
		return result;
	}
}

public class Output {

	public static void main(String[] args) {

		/*
		 * Object o = () -> { System.out.println("Tricky Example"); };
		 */
		
		Object obj1 = null;
		Optional.of(obj1);
		/*************************************/

		recursion obj = new recursion();
		System.out.println(obj.func(12));
	}

}
