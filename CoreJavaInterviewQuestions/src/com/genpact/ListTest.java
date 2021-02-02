package com.genpact;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		//List<Object> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		
		list.add("string");
		list.add("bye");
		System.out.println(list.size());
	}

}
