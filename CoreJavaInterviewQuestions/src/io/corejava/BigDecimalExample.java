package io.corejava;

import java.math.BigDecimal;

public class BigDecimalExample {

	public static void main(String[] args) {

		
//		String abc = "abc";
//		String str = "abc";
//		System.out.println(abc == str);
//		str = str.toUpperCase();
//		System.out.println(abc);
//		System.out.println(str);
//		System.out.println(abc == str);		
		
		
		double amount1 = 2.15;
		double amount2 = 1.10;

		System.out.println("Difference between 2.15 and 1.10 using double is: " + (amount1 - amount2));

		BigDecimal bigDecimal1 = new BigDecimal("2.15");
		BigDecimal bigDecimal2 = new BigDecimal("1.10");
		System.out.println(
				"Difference between 2.15 and 1.10 using BigDecimal is: " + (bigDecimal1.subtract(bigDecimal2)));
	}

}