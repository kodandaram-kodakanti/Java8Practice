package com.genpact;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamTest {

	public static void main(String[] args) {

		Object obj = null;
		//Optional.of(obj); // RuntimeException
		
		
		/**************************************/
		int[] myArray = { 1, 5, 8 };

		IntStream stream = Arrays.stream(myArray);

		//System.out.println(stream.sum());
		System.out.println(stream.reduce(1, (a, b) -> a + b));

	}

}
