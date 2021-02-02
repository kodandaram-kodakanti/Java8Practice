package com.genpact;

import java.util.Arrays;
import java.util.List;

public class Test {

	static Integer iCount = 0;

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "c");

		list.stream().forEach(i -> {
			iCount++;
		});

		System.out.println(iCount);
	}

}
