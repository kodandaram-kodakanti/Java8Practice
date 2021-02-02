package com.genpact;

import java.util.HashMap;
import java.util.Map;

public class StringTest {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2= new String("abc");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(str1, 1);
		map.put(str2, 2);
		
		
		String str3= new String("abc");
		
		System.out.println(map.get(str3));
		System.out.println(map.keySet().size());
		
		
		
		MyMethod(str1);
		System.out.println(str1);
	}

	private static void MyMethod(String str) {

		str = "def";
		System.out.println(str);
	}

}
