package io.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MergeTwoIntegerArraysWithUniqueElements {

	public static void main(String[] args) {

		int[] a = new int[] { 2, 4, 5, 6, 2, 3, 5, 7 };
		int[] b = new int[] { 3, 6, 4, 8, 9, 10, 1, 0 };

		Set<Integer> set = new HashSet<Integer>();

		List<Integer> list1 = new ArrayList<Integer>();
		for (int number : a) {
			list1.add(number);
		}

		set.addAll(list1);
		System.out.println(set);
		List<Integer> list2 = new ArrayList<Integer>();
		for (int number : b) {
			list2.add(number);
		}

		set.addAll(list2);
		System.out.println(set);
		
		
		
		try {
			try {
			} catch (Exception e) {

			}
		} catch (Exception e) {
		}

	}

}
