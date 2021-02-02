package com.genpact;

import java.util.Arrays;
import java.util.List;

public class Test1 {


	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "c");
		
		Integer iCount = 0;

		list.stream().forEach(i -> {
			//iCount++; //Local variable iCount defined in an enclosing scope must be final or effectively final
		});

		System.out.println(iCount);
	}

}
