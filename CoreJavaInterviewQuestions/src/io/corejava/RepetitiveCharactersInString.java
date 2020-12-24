package io.corejava;

import java.util.ArrayList;

public class RepetitiveCharactersInString {

	public static void main(String[] args) {

		String str = "elephant";

		System.out.println(getChars(str));
	}

	private static ArrayList<String> getChars(String str) {

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < str.length(); i++) {
			if (!list.contains(str.charAt(i) + "".toLowerCase()) || !list.contains(str.charAt(i) + "".toUpperCase())) {
				list.add(str.charAt(i) + "");
			}
		}

		
		System.out.println(list.contains("e"));
		return list;

	}

}
